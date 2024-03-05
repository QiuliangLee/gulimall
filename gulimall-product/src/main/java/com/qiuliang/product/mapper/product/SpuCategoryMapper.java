package com.qiuliang.product.mapper.product;

import com.qiuliang.product.model.pojo.product.SpuCategoryPo;
import com.qiuliang.product.model.pojo.product.SpuCategoryPoExample;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Param;

public interface SpuCategoryMapper {
    long countByExample(SpuCategoryPoExample example);

    int deleteByExample(SpuCategoryPoExample example);

    int deleteByPrimaryKey(Long id);

    int insertUpdate(SpuCategoryPo record);

    int insertBatch(List<SpuCategoryPo> records);

    int insertUpdateBatch(List<SpuCategoryPo> records);

    int insert(SpuCategoryPo record);

    int insertUpdateSelective(SpuCategoryPo record);

    int insertSelective(SpuCategoryPo record);

    List<SpuCategoryPo> selectByExample(SpuCategoryPoExample example);

    SpuCategoryPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SpuCategoryPo record, @Param("example") SpuCategoryPoExample example);

    int updateByExample(@Param("record") SpuCategoryPo record, @Param("example") SpuCategoryPoExample example);

    int updateByPrimaryKeySelective(SpuCategoryPo record);

    int updateByPrimaryKey(SpuCategoryPo record);
}