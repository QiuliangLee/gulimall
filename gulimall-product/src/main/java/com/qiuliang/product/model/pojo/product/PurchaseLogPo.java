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
public class PurchaseLogPo implements Serializable {
    /**
     * 自增主键ID
     */
    private Long id;

    /**
     * 购买记录id
     */
    private Long purchaseId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * sku_id
     */
    private Long skuId;

    /**
     * sku_name
     */
    private String skuName;

    /**
     * spu_id
     */
    private Long spuId;

    /**
     * spu_name
     */
    private String spuName;

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