package com.qiuliang.product.mapper.product;

import com.qiuliang.product.model.pojo.product.SkuAttrPo;
import com.qiuliang.product.model.pojo.product.SkuAttrPoExample;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Param;

public interface SkuAttrMapper {
    long countByExample(SkuAttrPoExample example);

    int deleteByExample(SkuAttrPoExample example);

    int deleteByPrimaryKey(Long id);

    int insertUpdate(SkuAttrPo record);

    int insertBatch(List<SkuAttrPo> records);

    int insertUpdateBatch(List<SkuAttrPo> records);

    int insert(SkuAttrPo record);

    int insertUpdateSelective(SkuAttrPo record);

    int insertSelective(SkuAttrPo record);

    List<SkuAttrPo> selectByExample(SkuAttrPoExample example);

    SkuAttrPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SkuAttrPo record, @Param("example") SkuAttrPoExample example);

    int updateByExample(@Param("record") SkuAttrPo record, @Param("example") SkuAttrPoExample example);

    int updateByPrimaryKeySelective(SkuAttrPo record);

    int updateByPrimaryKey(SkuAttrPo record);
}