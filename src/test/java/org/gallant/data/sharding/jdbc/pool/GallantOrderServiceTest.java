package org.gallant.data.sharding.jdbc.pool;

import javax.annotation.Resource;
import org.gallant.data.sharding.jdbc.pool.domain.dto.GallantOrderSaveDTO;
import org.gallant.data.sharding.jdbc.pool.service.GallantOrderService;
import org.junit.Test;

/**
 * @author kongyong
 * @date 2019/3/16
 */
public class GallantOrderServiceTest extends UnitTestBase {

    @Resource
    private GallantOrderService gallantOrderService;

    @Test
    public void save(){
        GallantOrderSaveDTO gallantOrderSaveDTO = new GallantOrderSaveDTO();
        gallantOrderSaveDTO.setCityId(1);
        gallantOrderSaveDTO.setUserId(1L);
        gallantOrderSaveDTO.setTitle("我是一个霸气的title");
        gallantOrderService.save(gallantOrderSaveDTO);
        gallantOrderSaveDTO = new GallantOrderSaveDTO();
        gallantOrderSaveDTO.setCityId(2);
        gallantOrderSaveDTO.setUserId(1L);
        gallantOrderSaveDTO.setTitle("我是一个霸气的title");
        gallantOrderService.save(gallantOrderSaveDTO);
        gallantOrderSaveDTO = new GallantOrderSaveDTO();
        gallantOrderSaveDTO.setCityId(1);
        gallantOrderSaveDTO.setUserId(2L);
        gallantOrderSaveDTO.setTitle("我是一个霸气的title");
        gallantOrderService.save(gallantOrderSaveDTO);
        gallantOrderSaveDTO = new GallantOrderSaveDTO();
        gallantOrderSaveDTO.setCityId(2);
        gallantOrderSaveDTO.setUserId(2L);
        gallantOrderSaveDTO.setTitle("我是一个霸气的title");
        gallantOrderService.save(gallantOrderSaveDTO);
    }

}
