package com.dao;

import com.entity.QicaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QicaiView;

/**
 * 器材 Dao 接口
 *
 * @author 
 */
public interface QicaiDao extends BaseMapper<QicaiEntity> {

   List<QicaiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
