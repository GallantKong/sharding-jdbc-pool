package org.gallant.data.sharding.jdbc.pool.domain.dto;

import java.io.Serializable;
import lombok.Data;

/**
 * @author kongyong
 * @date 2019/3/16
 */
@Data
public class GallantOrderSaveDTO implements Serializable {

    private static final long serialVersionUID = -8841651450919693111L;

    private Long userId;
    private Integer cityId;
    private String title;

}
