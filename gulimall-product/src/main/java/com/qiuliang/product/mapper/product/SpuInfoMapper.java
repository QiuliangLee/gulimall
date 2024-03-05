package com.qiuliang.product.mapper.product;

import com.qiuliang.product.model.pojo.product.SpuInfoPo;
import com.qiuliang.product.model.pojo.product.SpuInfoPoExample;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Param;

public interface SpuInfoMapper {
    long countByExample(SpuInfoPoExample example);

    int deleteByExample(SpuInfoPoExample example);

    int deleteByPrimaryKey(Long id);

    int insertUpdate(SpuInfoPo record);

    int insertBatch(List<SpuInfoPo> records);

    int insertUpdateBatch(List<SpuInfoPo> records);

    int insert(SpuInfoPo record);

    int insertUpdateSelective(SpuInfoPo record);

    int insertSelective(SpuInfoPo record);

    List<SpuInfoPo> selectByExample(SpuInfoPoExample example);

    SpuInfoPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SpuInfoPo record, @Param("example") SpuInfoPoExample example);

    int updateByExample(@Param("record") SpuInfoPo record, @Param("example") SpuInfoPoExample example);

    int updateByPrimaryKeySelective(SpuInfoPo record);

    int updateByPrimaryKey(SpuInfoPo record);
}