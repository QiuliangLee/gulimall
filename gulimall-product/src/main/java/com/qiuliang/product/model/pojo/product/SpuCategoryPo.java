package com.qiuliang.product.model.pojo.product;

import java.io.Serializable;
import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SpuCategoryPo implements Serializable {
    /**
     * 自增主键ID
     */
    private Long id;

    /**
     * 分类id
     */
    private Long categoryId;

    /**
     * 是否显示[0-不显示，1显示]
     */
    private Integer showStatus;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 父分类id
     */
    private Long parentCid;

    /**
     * 层级
     */
    private Integer catLevel;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 图标地址
     */
    private String icon;

    /**
     * 计量单位
     */
    private String productUnit;

    /**
     * 商品数量
     */
    private Integer productCount;

    /**
     * 逻辑删除，0-未删除，1-已删除
     */
    private Integer isDeleted;

    /**
     * 创建时间
     */
    private Timestamp ctime;

    /**
     * 修改时间
     */
    private Timestamp mtime;

    private static final long serialVersionUID = 1L;
}