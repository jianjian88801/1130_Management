package com.entity.model;

import com.entity.JianshenfangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 健身房
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JianshenfangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：健身房名称
	 */
    public String getJianshenfangName() {
        return jianshenfangName;
    }


    /**
	 * 设置：健身房名称
	 */
    public void setJianshenfangName(String jianshenfangName) {
        this.jianshenfangName = jianshenfangName;
    }
    /**
	 * 获取：健身房照片
	 */
    public String getJianshenfangPhoto() {
        return jianshenfangPhoto;
    }


    /**
	 * 设置：健身房照片
	 */
    public void setJianshenfangPhoto(String jianshenfangPhoto) {
        this.jianshenfangPhoto = jianshenfangPhoto;
    }
    /**
	 * 获取：健身房位置
	 */
    public String getJianshenfangAddress() {
        return jianshenfangAddress;
    }


    /**
	 * 设置：健身房位置
	 */
    public void setJianshenfangAddress(String jianshenfangAddress) {
        this.jianshenfangAddress = jianshenfangAddress;
    }
    /**
	 * 获取：健身房详细介绍
	 */
    public String getJianshenfangContent() {
        return jianshenfangContent;
    }


    /**
	 * 设置：健身房详细介绍
	 */
    public void setJianshenfangContent(String jianshenfangContent) {
        this.jianshenfangContent = jianshenfangContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
