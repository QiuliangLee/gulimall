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
public class SkuInfoPo implements Serializable {
    /**
     * 自增主键ID
     */
    private Long id;

    /**
     * skuId
     */
    private Long skuId;

    /**
     * spuId
     */
    private Long spuId;

    /**
     * sku名称
     */
    private String skuName;

    /**
     * sku介绍描述
     */
    private String skuDesc;

    /**
     * 默认图片
     */
    private String skuImg;

    /**
     * 标题
     */
    private String skuTitle;

    /**
     * 副标题
     */
    private String skuSubtitle;

    /**
     * 价格，十分位存储，1.2-12
     */
    private Long price;

    /**
     * 销量
     */
    private Long saleCount;

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