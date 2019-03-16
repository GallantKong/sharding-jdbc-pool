package org.gallant.data.sharding.jdbc.pool.utils;

import org.gallant.data.sharding.jdbc.pool.domain.dto.GallantOrderSaveDTO;
import org.gallant.data.sharding.jdbc.pool.entity.GallantOrder;

/**
 * @author kongyong
 * @date 2019/3/16
 */
public class ConvertUtil {

    public static GallantOrder convert2GallantOrder(GallantOrderSaveDTO gallantOrderSaveDTO) {
        GallantOrder gallantOrder = new GallantOrder();
        gallantOrder.setCityId(gallantOrderSaveDTO.getCityId());
        gallantOrder.setUserId(gallantOrderSaveDTO.getUserId());
        gallantOrder.setTitle(gallantOrderSaveDTO.getTitle());
        return gallantOrder;
    }

}
