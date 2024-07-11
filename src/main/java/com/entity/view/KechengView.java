package com.entity.view;

import com.entity.KechengEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 课程
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kecheng")
public class KechengView extends KechengEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 课程类型的值
		*/
		private String kechengValue;



		//级联表 jianshenfang
			/**
			* 健身房名称
			*/
			private String jianshenfangName;
			/**
			* 健身房照片
			*/
			private String jianshenfangPhoto;
			/**
			* 健身房位置
			*/
			private String jianshenfangAddress;
			/**
			* 健身房详细介绍
			*/
			private String jianshenfangContent;

		//级联表 jiaolian
			/**
			* 教练姓名
			*/
			private String jiaolianName;
			/**
			* 教练手机号
			*/
			private String jiaolianPhone;
			/**
			* 教练头像
			*/
			private String jiaolianPhoto;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 所获荣誉
			*/
			private String rongyuContent;
			/**
			* 教练详细介绍
			*/
			private String jiaolianContent;

	public KechengView() {

	}

	public KechengView(KechengEntity kechengEntity) {
		try {
			BeanUtils.copyProperties(this, kechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 课程类型的值
			*/
			public String getKechengValue() {
				return kechengValue;
			}
			/**
			* 设置： 课程类型的值
			*/
			public void setKechengValue(String kechengValue) {
				this.kechengValue = kechengValue;
			}








				//级联表的get和set jianshenfang
					/**
					* 获取： 健身房名称
					*/
					public String getJianshenfangName() {
						return jianshenfangName;
					}
					/**
					* 设置： 健身房名称
					*/
					public void setJianshenfangName(String jianshenfangName) {
						this.jianshenfangName = jianshenfangName;
					}
					/**
					* 获取： 健身房照片
					*/
					public String getJianshenfangPhoto() {
						return jianshenfangPhoto;
					}
					/**
					* 设置： 健身房照片
					*/
					public void setJianshenfangPhoto(String jianshenfangPhoto) {
						this.jianshenfangPhoto = jianshenfangPhoto;
					}
					/**
					* 获取： 健身房位置
					*/
					public String getJianshenfangAddress() {
						return jianshenfangAddress;
					}
					/**
					* 设置： 健身房位置
					*/
					public void setJianshenfangAddress(String jianshenfangAddress) {
						this.jianshenfangAddress = jianshenfangAddress;
					}
					/**
					* 获取： 健身房详细介绍
					*/
					public String getJianshenfangContent() {
						return jianshenfangContent;
					}
					/**
					* 设置： 健身房详细介绍
					*/
					public void setJianshenfangContent(String jianshenfangContent) {
						this.jianshenfangContent = jianshenfangContent;
					}


				//级联表的get和set jiaolian
					/**
					* 获取： 教练姓名
					*/
					public String getJiaolianName() {
						return jiaolianName;
					}
					/**
					* 设置： 教练姓名
					*/
					public void setJiaolianName(String jiaolianName) {
						this.jiaolianName = jiaolianName;
					}
					/**
					* 获取： 教练手机号
					*/
					public String getJiaolianPhone() {
						return jiaolianPhone;
					}
					/**
					* 设置： 教练手机号
					*/
					public void setJiaolianPhone(String jiaolianPhone) {
						this.jiaolianPhone = jiaolianPhone;
					}
					/**
					* 获取： 教练头像
					*/
					public String getJiaolianPhoto() {
						return jiaolianPhoto;
					}
					/**
					* 设置： 教练头像
					*/
					public void setJiaolianPhoto(String jiaolianPhoto) {
						this.jiaolianPhoto = jiaolianPhoto;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 所获荣誉
					*/
					public String getRongyuContent() {
						return rongyuContent;
					}
					/**
					* 设置： 所获荣誉
					*/
					public void setRongyuContent(String rongyuContent) {
						this.rongyuContent = rongyuContent;
					}
					/**
					* 获取： 教练详细介绍
					*/
					public String getJiaolianContent() {
						return jiaolianContent;
					}
					/**
					* 设置： 教练详细介绍
					*/
					public void setJiaolianContent(String jiaolianContent) {
						this.jiaolianContent = jiaolianContent;
					}













}
