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
 * 健身房
 *
 * @author 
 * @email
 */
@TableName("jianshenfang")
public class JianshenfangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JianshenfangEntity() {

	}

	public JianshenfangEntity(T t) {
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
     * 健身房名称
     */
    @TableField(value = "jianshenfang_name")

    private String jianshenfangName;


    /**
     * 健身房照片
     */
    @TableField(value = "jianshenfang_photo")

    private String jianshenfangPhoto;


    /**
     * 健身房位置
     */
    @TableField(value = "jianshenfang_address")

    private String jianshenfangAddress;


    /**
     * 健身房详细介绍
     */
    @TableField(value = "jianshenfang_content")

    private String jianshenfangContent;


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
	 * 设置：健身房名称
	 */
    public String getJianshenfangName() {
        return jianshenfangName;
    }


    /**
	 * 获取：健身房名称
	 */

    public void setJianshenfangName(String jianshenfangName) {
        this.jianshenfangName = jianshenfangName;
    }
    /**
	 * 设置：健身房照片
	 */
    public String getJianshenfangPhoto() {
        return jianshenfangPhoto;
    }


    /**
	 * 获取：健身房照片
	 */

    public void setJianshenfangPhoto(String jianshenfangPhoto) {
        this.jianshenfangPhoto = jianshenfangPhoto;
    }
    /**
	 * 设置：健身房位置
	 */
    public String getJianshenfangAddress() {
        return jianshenfangAddress;
    }


    /**
	 * 获取：健身房位置
	 */

    public void setJianshenfangAddress(String jianshenfangAddress) {
        this.jianshenfangAddress = jianshenfangAddress;
    }
    /**
	 * 设置：健身房详细介绍
	 */
    public String getJianshenfangContent() {
        return jianshenfangContent;
    }


    /**
	 * 获取：健身房详细介绍
	 */

    public void setJianshenfangContent(String jianshenfangContent) {
        this.jianshenfangContent = jianshenfangContent;
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
        return "Jianshenfang{" +
            "id=" + id +
            ", jianshenfangName=" + jianshenfangName +
            ", jianshenfangPhoto=" + jianshenfangPhoto +
            ", jianshenfangAddress=" + jianshenfangAddress +
            ", jianshenfangContent=" + jianshenfangContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
