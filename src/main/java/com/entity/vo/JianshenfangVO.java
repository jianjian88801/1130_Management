package com.entity.vo;

import com.entity.JianshenfangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 健身房
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jianshenfang")
public class JianshenfangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
