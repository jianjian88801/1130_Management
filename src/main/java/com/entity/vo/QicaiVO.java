package com.entity.vo;

import com.entity.QicaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 器材
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("qicai")
public class QicaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


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

}
