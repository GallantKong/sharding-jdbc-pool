package org.gallant.data.sharding.jdbc.pool.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.gallant.data.sharding.jdbc.pool.entity.GallantOrderItem;
import org.gallant.data.sharding.jdbc.pool.entity.GallantOrderItemExample;

public interface GallantOrderItemMapper {
    long countByExample(GallantOrderItemExample example);

    int deleteByExample(GallantOrderItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GallantOrderItem record);

    int insertSelective(GallantOrderItem record);

    List<GallantOrderItem> selectByExample(GallantOrderItemExample example);

    GallantOrderItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GallantOrderItem record, @Param("example") GallantOrderItemExample example);

    int updateByExample(@Param("record") GallantOrderItem record, @Param("example") GallantOrderItemExample example);

    int updateByPrimaryKeySelective(GallantOrderItem record);

    int updateByPrimaryKey(GallantOrderItem record);
}