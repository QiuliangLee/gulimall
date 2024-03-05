package com.qiuliang.product.mapper.product;

import com.qiuliang.product.model.pojo.product.SkuAttrGroupPo;
import com.qiuliang.product.model.pojo.product.SkuAttrGroupPoExample;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Param;

public interface SkuAttrGroupMapper {
    long countByExample(SkuAttrGroupPoExample example);

    int deleteByExample(SkuAttrGroupPoExample example);

    int deleteByPrimaryKey(Long id);

    int insertUpdate(SkuAttrGroupPo record);

    int insertBatch(List<SkuAttrGroupPo> records);

    int insertUpdateBatch(List<SkuAttrGroupPo> records);

    int insert(SkuAttrGroupPo record);

    int insertUpdateSelective(SkuAttrGroupPo record);

    int insertSelective(SkuAttrGroupPo record);

    List<SkuAttrGroupPo> selectByExample(SkuAttrGroupPoExample example);

    SkuAttrGroupPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SkuAttrGroupPo record, @Param("example") SkuAttrGroupPoExample example);

    int updateByExample(@Param("record") SkuAttrGroupPo record, @Param("example") SkuAttrGroupPoExample example);

    int updateByPrimaryKeySelective(SkuAttrGroupPo record);

    int updateByPrimaryKey(SkuAttrGroupPo record);
}