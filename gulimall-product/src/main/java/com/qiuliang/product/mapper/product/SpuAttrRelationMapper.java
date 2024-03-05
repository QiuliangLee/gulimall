package com.qiuliang.product.mapper.product;

import com.qiuliang.product.model.pojo.product.SpuAttrRelationPo;
import com.qiuliang.product.model.pojo.product.SpuAttrRelationPoExample;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Param;

public interface SpuAttrRelationMapper {
    long countByExample(SpuAttrRelationPoExample example);

    int deleteByExample(SpuAttrRelationPoExample example);

    int deleteByPrimaryKey(Long id);

    int insertUpdate(SpuAttrRelationPo record);

    int insertBatch(List<SpuAttrRelationPo> records);

    int insertUpdateBatch(List<SpuAttrRelationPo> records);

    int insert(SpuAttrRelationPo record);

    int insertUpdateSelective(SpuAttrRelationPo record);

    int insertSelective(SpuAttrRelationPo record);

    List<SpuAttrRelationPo> selectByExample(SpuAttrRelationPoExample example);

    SpuAttrRelationPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SpuAttrRelationPo record, @Param("example") SpuAttrRelationPoExample example);

    int updateByExample(@Param("record") SpuAttrRelationPo record, @Param("example") SpuAttrRelationPoExample example);

    int updateByPrimaryKeySelective(SpuAttrRelationPo record);

    int updateByPrimaryKey(SpuAttrRelationPo record);
}