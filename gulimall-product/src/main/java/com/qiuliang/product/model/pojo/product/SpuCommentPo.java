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
public class SpuCommentPo implements Serializable {
    /**
     * 自增主键ID
     */
    private Long id;

    /**
     * 评论id
     */
    private Long commentId;

    /**
     * sku_id
     */
    private Long skuId;

    /**
     * spu_id
     */
    private Long spuId;

    /**
     * 显示状态[0-不显示，1-显示]
     */
    private Integer showStatus;

    /**
     * 评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]
     */
    private String resource;

    /**
     * 内容
     */
    private String content;

    /**
     * 评论类型[0 - 对商品的直接评论，1 - 对评论的回复]
     */
    private Integer commentType;

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