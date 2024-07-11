package com.entity.vo;

import com.entity.JiaolianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 教练
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiaolian")
public class JiaolianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
