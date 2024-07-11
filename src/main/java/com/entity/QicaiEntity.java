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
 * 器材
 *
 * @author 
 * @email
 */
@TableName("qicai")
public class QicaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QicaiEntity() {

	}

	public QicaiEntity(T t) {
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
     * 器材名称
     */
    @TableField(value = "qicai_name")

    private String qicaiName;


    /**
     * 器材类型
     */
    @TableField(value = "qicai_types")

    private Integer qicaiTypes;


    /**
     * 器材照片
     */
    @TableField(value = "qicai_photo")

    private String qicaiPhoto;


    /**
     * 器材数量
     */
    @TableField(value = "qicai_number")

    private Integer qicaiNumber;


    /**
     * 器材介绍
     */
    @TableField(value = "qicai_content")

    private String qicaiContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：器材名称
	 */
    public String getQicaiName() {
        return qicaiName;
    }


    /**
	 * 获取：器材名称
	 */

    public void setQicaiName(String qicaiName) {
        this.qicaiName = qicaiName;
    }
    /**
	 * 设置：器材类型
	 */
    public Integer getQicaiTypes() {
        return qicaiTypes;
    }


    /**
	 * 获取：器材类型
	 */

    public void setQicaiTypes(Integer qicaiTypes) {
        this.qicaiTypes = qicaiTypes;
    }
    /**
	 * 设置：器材照片
	 */
    public String getQicaiPhoto() {
        return qicaiPhoto;
    }


    /**
	 * 获取：器材照片
	 */

    public void setQicaiPhoto(String qicaiPhoto) {
        this.qicaiPhoto = qicaiPhoto;
    }
    /**
	 * 设置：器材数量
	 */
    public Integer getQicaiNumber() {
        return qicaiNumber;
    }


    /**
	 * 获取：器材数量
	 */

    public void setQicaiNumber(Integer qicaiNumber) {
        this.qicaiNumber = qicaiNumber;
    }
    /**
	 * 设置：器材介绍
	 */
    public String getQicaiContent() {
        return qicaiContent;
    }


    /**
	 * 获取：器材介绍
	 */

    public void setQicaiContent(String qicaiContent) {
        this.qicaiContent = qicaiContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "Qicai{" +
            "id=" + id +
            ", qicaiName=" + qicaiName +
            ", qicaiTypes=" + qicaiTypes +
            ", qicaiPhoto=" + qicaiPhoto +
            ", qicaiNumber=" + qicaiNumber +
            ", qicaiContent=" + qicaiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
