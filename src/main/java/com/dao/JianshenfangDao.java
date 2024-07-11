package com.dao;

import com.entity.JianshenfangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JianshenfangView;

/**
 * 健身房 Dao 接口
 *
 * @author 
 */
public interface JianshenfangDao extends BaseMapper<JianshenfangEntity> {

   List<JianshenfangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
