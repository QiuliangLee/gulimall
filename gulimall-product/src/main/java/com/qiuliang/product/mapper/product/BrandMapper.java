package com.qiuliang.product.mapper.product;

import com.qiuliang.product.model.pojo.product.BrandPo;
import com.qiuliang.product.model.pojo.product.BrandPoExample;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Param;

public interface BrandMapper {
    long countByExample(BrandPoExample example);

    int deleteByExample(BrandPoExample example);

    int deleteByPrimaryKey(Long id);

    int insertUpdate(BrandPo record);

    int insertBatch(List<BrandPo> records);

    int insertUpdateBatch(List<BrandPo> records);

    int insert(BrandPo record);

    int insertUpdateSelective(BrandPo record);

    int insertSelective(BrandPo record);

    List<BrandPo> selectByExample(BrandPoExample example);

    BrandPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BrandPo record, @Param("example") BrandPoExample example);

    int updateByExample(@Param("record") BrandPo record, @Param("example") BrandPoExample example);

    int updateByPrimaryKeySelective(BrandPo record);

    int updateByPrimaryKey(BrandPo record);
}