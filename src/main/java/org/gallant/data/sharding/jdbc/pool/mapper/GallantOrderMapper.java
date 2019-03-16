package org.gallant.data.sharding.jdbc.pool.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.gallant.data.sharding.jdbc.pool.entity.GallantOrder;
import org.gallant.data.sharding.jdbc.pool.entity.GallantOrderExample;

public interface GallantOrderMapper {
    long countByExample(GallantOrderExample example);

    int deleteByExample(GallantOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GallantOrder record);

    int insertSelective(GallantOrder record);

    List<GallantOrder> selectByExample(GallantOrderExample example);

    GallantOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GallantOrder record, @Param("example") GallantOrderExample example);

    int updateByExample(@Param("record") GallantOrder record, @Param("example") GallantOrderExample example);

    int updateByPrimaryKeySelective(GallantOrder record);

    int updateByPrimaryKey(GallantOrder record);
}