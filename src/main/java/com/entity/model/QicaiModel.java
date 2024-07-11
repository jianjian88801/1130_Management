package com.entity.model;

import com.entity.QicaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 器材
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QicaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 器材名称
     */
    private String qicaiName;


    /**
     * 器材类型
     */
    private Integer qicaiTypes;


    /**
     * 器材照片
     */
    private String qicaiPhoto;


    /**
     * 器材数量
     */
    private Integer qicaiNumber;


    /**
     * 器材介绍
     */
    private String qicaiContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：器材名称
	 */
    public String getQicaiName() {
        return qicaiName;
    }


    /**
	 * 设置：器材名称
	 */
    public void setQicaiName(String qicaiName) {
        this.qicaiName = qicaiName;
    }
    /**
	 * 获取：器材类型
	 */
    public Integer getQicaiTypes() {
        return qicaiTypes;
    }


    /**
	 * 设置：器材类型
	 */
    public void setQicaiTypes(Integer qicaiTypes) {
        this.qicaiTypes = qicaiTypes;
    }
    /**
	 * 获取：器材照片
	 */
    public String getQicaiPhoto() {
        return qicaiPhoto;
    }


    /**
	 * 设置：器材照片
	 */
    public void setQicaiPhoto(String qicaiPhoto) {
        this.qicaiPhoto = qicaiPhoto;
    }
    /**
	 * 获取：器材数量
	 */
    public Integer getQicaiNumber() {
        return qicaiNumber;
    }


    /**
	 * 设置：器材数量
	 */
    public void setQicaiNumber(Integer qicaiNumber) {
        this.qicaiNumber = qicaiNumber;
    }
    /**
	 * 获取：器材介绍
	 */
    public String getQicaiContent() {
        return qicaiContent;
    }


    /**
	 * 设置：器材介绍
	 */
    public void setQicaiContent(String qicaiContent) {
        this.qicaiContent = qicaiContent;
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
