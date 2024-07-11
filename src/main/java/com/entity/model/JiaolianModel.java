package com.entity.model;

import com.entity.JiaolianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 教练
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiaolianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 所获荣誉
     */
    private String rongyuContent;


    /**
     * 教练详细介绍
     */
    private String jiaolianContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：教练姓名
	 */
    public String getJiaolianName() {
        return jiaolianName;
    }


    /**
	 * 设置：教练姓名
	 */
    public void setJiaolianName(String jiaolianName) {
        this.jiaolianName = jiaolianName;
    }
    /**
	 * 获取：教练手机号
	 */
    public String getJiaolianPhone() {
        return jiaolianPhone;
    }


    /**
	 * 设置：教练手机号
	 */
    public void setJiaolianPhone(String jiaolianPhone) {
        this.jiaolianPhone = jiaolianPhone;
    }
    /**
	 * 获取：教练头像
	 */
    public String getJiaolianPhoto() {
        return jiaolianPhoto;
    }


    /**
	 * 设置：教练头像
	 */
    public void setJiaolianPhoto(String jiaolianPhoto) {
        this.jiaolianPhoto = jiaolianPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：所获荣誉
	 */
    public String getRongyuContent() {
        return rongyuContent;
    }


    /**
	 * 设置：所获荣誉
	 */
    public void setRongyuContent(String rongyuContent) {
        this.rongyuContent = rongyuContent;
    }
    /**
	 * 获取：教练详细介绍
	 */
    public String getJiaolianContent() {
        return jiaolianContent;
    }


    /**
	 * 设置：教练详细介绍
	 */
    public void setJiaolianContent(String jiaolianContent) {
        this.jiaolianContent = jiaolianContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
