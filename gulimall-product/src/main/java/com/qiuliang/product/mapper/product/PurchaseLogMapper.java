package com.qiuliang.product.mapper.product;

import com.qiuliang.product.model.pojo.product.PurchaseLogPo;
import com.qiuliang.product.model.pojo.product.PurchaseLogPoExample;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Param;

public interface PurchaseLogMapper {
    long countByExample(PurchaseLogPoExample example);

    int deleteByExample(PurchaseLogPoExample example);

    int deleteByPrimaryKey(Long id);

    int insertUpdate(PurchaseLogPo record);

    int insertBatch(List<PurchaseLogPo> records);

    int insertUpdateBatch(List<PurchaseLogPo> records);

    int insert(PurchaseLogPo record);

    int insertUpdateSelective(PurchaseLogPo record);

    int insertSelective(PurchaseLogPo record);

    List<PurchaseLogPo> selectByExample(PurchaseLogPoExample example);

    PurchaseLogPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PurchaseLogPo record, @Param("example") PurchaseLogPoExample example);

    int updateByExample(@Param("record") PurchaseLogPo record, @Param("example") PurchaseLogPoExample example);

    int updateByPrimaryKeySelective(PurchaseLogPo record);

    int updateByPrimaryKey(PurchaseLogPo record);
}