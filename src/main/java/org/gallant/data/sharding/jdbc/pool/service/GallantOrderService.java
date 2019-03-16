package org.gallant.data.sharding.jdbc.pool.service;

import javax.annotation.Resource;
import org.gallant.data.sharding.jdbc.pool.domain.dto.GallantOrderSaveDTO;
import org.gallant.data.sharding.jdbc.pool.manager.GallantOrderManager;
import org.gallant.data.sharding.jdbc.pool.utils.ConvertUtil;
import org.springframework.stereotype.Component;

/**
 * @author kongyong
 * @date 2019/3/16
 */
@Component
public class GallantOrderService {

    @Resource
    private GallantOrderManager gallantOrderManager;

    public boolean save(GallantOrderSaveDTO gallantOrderSaveDTO) {
        return gallantOrderManager.save(ConvertUtil.convert2GallantOrder(gallantOrderSaveDTO));
    }

}
