package com.qiuliang.product.mapper.product;

import com.qiuliang.product.model.pojo.product.SpuCommentPo;
import com.qiuliang.product.model.pojo.product.SpuCommentPoExample;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Param;

public interface SpuCommentMapper {
    long countByExample(SpuCommentPoExample example);

    int deleteByExample(SpuCommentPoExample example);

    int deleteByPrimaryKey(Long id);

    int insertUpdate(SpuCommentPo record);

    int insertBatch(List<SpuCommentPo> records);

    int insertUpdateBatch(List<SpuCommentPo> records);

    int insert(SpuCommentPo record);

    int insertUpdateSelective(SpuCommentPo record);

    int insertSelective(SpuCommentPo record);

    List<SpuCommentPo> selectByExample(SpuCommentPoExample example);

    SpuCommentPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SpuCommentPo record, @Param("example") SpuCommentPoExample example);

    int updateByExample(@Param("record") SpuCommentPo record, @Param("example") SpuCommentPoExample example);

    int updateByPrimaryKeySelective(SpuCommentPo record);

    int updateByPrimaryKey(SpuCommentPo record);
}