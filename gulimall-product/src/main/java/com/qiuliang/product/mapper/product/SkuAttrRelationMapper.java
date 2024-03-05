package com.qiuliang.product.mapper.product;

import com.qiuliang.product.model.pojo.product.SkuAttrRelationPo;
import com.qiuliang.product.model.pojo.product.SkuAttrRelationPoExample;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Param;

public interface SkuAttrRelationMapper {
    long countByExample(SkuAttrRelationPoExample example);

    int deleteByExample(SkuAttrRelationPoExample example);

    int deleteByPrimaryKey(Long id);

    int insertUpdate(SkuAttrRelationPo record);

    int insertBatch(List<SkuAttrRelationPo> records);

    int insertUpdateBatch(List<SkuAttrRelationPo> records);

    int insert(SkuAttrRelationPo record);

    int insertUpdateSelective(SkuAttrRelationPo record);

    int insertSelective(SkuAttrRelationPo record);

    List<SkuAttrRelationPo> selectByExample(SkuAttrRelationPoExample example);

    SkuAttrRelationPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SkuAttrRelationPo record, @Param("example") SkuAttrRelationPoExample example);

    int updateByExample(@Param("record") SkuAttrRelationPo record, @Param("example") SkuAttrRelationPoExample example);

    int updateByPrimaryKeySelective(SkuAttrRelationPo record);

    int updateByPrimaryKey(SkuAttrRelationPo record);
}