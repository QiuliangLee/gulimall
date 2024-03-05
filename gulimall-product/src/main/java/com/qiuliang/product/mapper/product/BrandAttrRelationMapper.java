package com.qiuliang.product.mapper.product;

import com.qiuliang.product.model.pojo.product.BrandAttrRelationPo;
import com.qiuliang.product.model.pojo.product.BrandAttrRelationPoExample;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Param;

public interface BrandAttrRelationMapper {
    long countByExample(BrandAttrRelationPoExample example);

    int deleteByExample(BrandAttrRelationPoExample example);

    int deleteByPrimaryKey(Long id);

    int insertUpdate(BrandAttrRelationPo record);

    int insertBatch(List<BrandAttrRelationPo> records);

    int insertUpdateBatch(List<BrandAttrRelationPo> records);

    int insert(BrandAttrRelationPo record);

    int insertUpdateSelective(BrandAttrRelationPo record);

    int insertSelective(BrandAttrRelationPo record);

    List<BrandAttrRelationPo> selectByExample(BrandAttrRelationPoExample example);

    BrandAttrRelationPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BrandAttrRelationPo record, @Param("example") BrandAttrRelationPoExample example);

    int updateByExample(@Param("record") BrandAttrRelationPo record, @Param("example") BrandAttrRelationPoExample example);

    int updateByPrimaryKeySelective(BrandAttrRelationPo record);

    int updateByPrimaryKey(BrandAttrRelationPo record);
}