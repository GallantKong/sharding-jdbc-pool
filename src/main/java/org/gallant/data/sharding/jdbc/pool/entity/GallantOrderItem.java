package org.gallant.data.sharding.jdbc.pool.entity;

import java.io.Serializable;

public class GallantOrderItem implements Serializable {
    private Long id;

    private Long orderId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}