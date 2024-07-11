package com.entity.view;

import com.entity.QicaiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 器材
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("qicai")
public class QicaiView extends QicaiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 器材类型的值
		*/
		private String qicaiValue;



	public QicaiView() {

	}

	public QicaiView(QicaiEntity qicaiEntity) {
		try {
			BeanUtils.copyProperties(this, qicaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 器材类型的值
			*/
			public String getQicaiValue() {
				return qicaiValue;
			}
			/**
			* 设置： 器材类型的值
			*/
			public void setQicaiValue(String qicaiValue) {
				this.qicaiValue = qicaiValue;
			}









}
