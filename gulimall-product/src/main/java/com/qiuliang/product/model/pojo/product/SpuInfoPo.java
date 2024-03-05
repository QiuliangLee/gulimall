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
public class SpuInfoPo implements Serializable {
    /**
     * 自增主键ID
     */
    private Long id;

    /**
     * 商品id
     */
    private Long spuId;

    /**
     * 商品名称
     */
    private String spuName;

    /**
     * 商品描述
     */
    private String spuDesc;

    /**
     * 权重,千分位存储，0.198-198
     */
    private Long weight;

    /**
     * 上架状态，0-下架，1-上架
     */
    private Integer publishStatus;

    /**
     * 分类id
     */
    private Long catalogId;

    /**
     * 品牌id
     */
    private Long brandId;

    /**
     * 分类id
     */
    private Long categoryId;

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