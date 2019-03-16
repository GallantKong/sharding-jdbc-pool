package org.gallant.data.sharding.jdbc.pool.manager;

import javax.annotation.Resource;
import org.gallant.data.sharding.jdbc.pool.entity.GallantOrder;
import org.gallant.data.sharding.jdbc.pool.mapper.GallantOrderMapper;
import org.springframework.stereotype.Component;

/**
 * @author kongyong
 * @date 2019/3/16
 */
@Component
public class GallantOrderManager {

    @Resource
    private GallantOrderMapper gallantOrderMapper;

    public boolean save(GallantOrder gallantOrder) {
        return gallantOrderMapper.insertSelective(gallantOrder) > 0;
    }

}
