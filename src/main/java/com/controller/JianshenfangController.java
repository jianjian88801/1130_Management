
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 健身房
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/jianshenfang")
public class JianshenfangController {
    private static final Logger logger = LoggerFactory.getLogger(JianshenfangController.class);

    @Autowired
    private JianshenfangService jianshenfangService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = jianshenfangService.queryPage(params);

        //字典表数据转换
        List<JianshenfangView> list =(List<JianshenfangView>)page.getList();
        for(JianshenfangView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JianshenfangEntity jianshenfang = jianshenfangService.selectById(id);
        if(jianshenfang !=null){
            //entity转view
            JianshenfangView view = new JianshenfangView();
            BeanUtils.copyProperties( jianshenfang , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody JianshenfangEntity jianshenfang, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,jianshenfang:{}",this.getClass().getName(),jianshenfang.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<JianshenfangEntity> queryWrapper = new EntityWrapper<JianshenfangEntity>()
            .eq("jianshenfang_name", jianshenfang.getJianshenfangName())
            .eq("jianshenfang_address", jianshenfang.getJianshenfangAddress())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JianshenfangEntity jianshenfangEntity = jianshenfangService.selectOne(queryWrapper);
        if(jianshenfangEntity==null){
            jianshenfang.setInsertTime(new Date());
            jianshenfang.setCreateTime(new Date());
            jianshenfangService.insert(jianshenfang);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody JianshenfangEntity jianshenfang, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,jianshenfang:{}",this.getClass().getName(),jianshenfang.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<JianshenfangEntity> queryWrapper = new EntityWrapper<JianshenfangEntity>()
            .notIn("id",jianshenfang.getId())
            .andNew()
            .eq("jianshenfang_name", jianshenfang.getJianshenfangName())
            .eq("jianshenfang_address", jianshenfang.getJianshenfangAddress())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JianshenfangEntity jianshenfangEntity = jianshenfangService.selectOne(queryWrapper);
        if("".equals(jianshenfang.getJianshenfangPhoto()) || "null".equals(jianshenfang.getJianshenfangPhoto())){
                jianshenfang.setJianshenfangPhoto(null);
        }
        if(jianshenfangEntity==null){
            jianshenfangService.updateById(jianshenfang);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        jianshenfangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<JianshenfangEntity> jianshenfangList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            JianshenfangEntity jianshenfangEntity = new JianshenfangEntity();
//                            jianshenfangEntity.setJianshenfangName(data.get(0));                    //健身房名称 要改的
//                            jianshenfangEntity.setJianshenfangPhoto("");//照片
//                            jianshenfangEntity.setJianshenfangAddress(data.get(0));                    //健身房位置 要改的
//                            jianshenfangEntity.setJianshenfangContent("");//照片
//                            jianshenfangEntity.setInsertTime(date);//时间
//                            jianshenfangEntity.setCreateTime(date);//时间
                            jianshenfangList.add(jianshenfangEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        jianshenfangService.insertBatch(jianshenfangList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
