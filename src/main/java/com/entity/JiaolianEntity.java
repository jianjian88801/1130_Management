package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 教练
 *
 * @author 
 * @email
 */
@TableName("jiaolian")
public class JiaolianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaolianEntity() {

	}

	public JiaolianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 教练姓名
     */
    @TableField(value = "jiaolian_name")

    private String jiaolianName;


    /**
     * 教练手机号
     */
    @TableField(value = "jiaolian_phone")

    private String jiaolianPhone;


    /**
     * 教练头像
     */
    @TableField(value = "jiaolian_photo")

    private String jiaolianPhoto;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 所获荣誉
     */
    @TableField(value = "rongyu_content")

    private String rongyuContent;


    /**
     * 教练详细介绍
     */
    @TableField(value = "jiaolian_content")

    private String jiaolianContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：教练姓名
	 */
    public String getJiaolianName() {
        return jiaolianName;
    }


    /**
	 * 获取：教练姓名
	 */

    public void setJiaolianName(String jiaolianName) {
        this.jiaolianName = jiaolianName;
    }
    /**
	 * 设置：教练手机号
	 */
    public String getJiaolianPhone() {
        return jiaolianPhone;
    }


    /**
	 * 获取：教练手机号
	 */

    public void setJiaolianPhone(String jiaolianPhone) {
        this.jiaolianPhone = jiaolianPhone;
    }
    /**
	 * 设置：教练头像
	 */
    public String getJiaolianPhoto() {
        return jiaolianPhoto;
    }


    /**
	 * 获取：教练头像
	 */

    public void setJiaolianPhoto(String jiaolianPhoto) {
        this.jiaolianPhoto = jiaolianPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：所获荣誉
	 */
    public String getRongyuContent() {
        return rongyuContent;
    }


    /**
	 * 获取：所获荣誉
	 */

    public void setRongyuContent(String rongyuContent) {
        this.rongyuContent = rongyuContent;
    }
    /**
	 * 设置：教练详细介绍
	 */
    public String getJiaolianContent() {
        return jiaolianContent;
    }


    /**
	 * 获取：教练详细介绍
	 */

    public void setJiaolianContent(String jiaolianContent) {
        this.jiaolianContent = jiaolianContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jiaolian{" +
            "id=" + id +
            ", jiaolianName=" + jiaolianName +
            ", jiaolianPhone=" + jiaolianPhone +
            ", jiaolianPhoto=" + jiaolianPhoto +
            ", sexTypes=" + sexTypes +
            ", rongyuContent=" + rongyuContent +
            ", jiaolianContent=" + jiaolianContent +
            ", createTime=" + createTime +
        "}";
    }
}
