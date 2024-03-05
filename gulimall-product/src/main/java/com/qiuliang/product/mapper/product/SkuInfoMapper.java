package com.qiuliang.product.mapper.product;

import com.qiuliang.product.model.pojo.product.SkuInfoPo;
import com.qiuliang.product.model.pojo.product.SkuInfoPoExample;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Param;

public interface SkuInfoMapper {
    long countByExample(SkuInfoPoExample example);

    int deleteByExample(SkuInfoPoExample example);

    int deleteByPrimaryKey(Long id);

    int insertUpdate(SkuInfoPo record);

    int insertBatch(List<SkuInfoPo> records);

    int insertUpdateBatch(List<SkuInfoPo> records);

    int insert(SkuInfoPo record);

    int insertUpdateSelective(SkuInfoPo record);

    int insertSelective(SkuInfoPo record);

    List<SkuInfoPo> selectByExample(SkuInfoPoExample example);

    SkuInfoPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SkuInfoPo record, @Param("example") SkuInfoPoExample example);

    int updateByExample(@Param("record") SkuInfoPo record, @Param("example") SkuInfoPoExample example);

    int updateByPrimaryKeySelective(SkuInfoPo record);

    int updateByPrimaryKey(SkuInfoPo record);
}