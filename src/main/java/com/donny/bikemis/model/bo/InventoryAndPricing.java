package com.donny.bikemis.model.bo;

import jakarta.persistence.*;

/**
 * @author Your Name
 * @date 2024/6/12
 */

@Entity
@Table(name = "inventory_and_pricing")
public class InventoryAndPricing extends BaseModel {

    @Column(name = "part_id")
    private Long partId;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "price")
    private Double price;

    @Column(name = "warranty_period")
    private Integer warrantyPeriod;
}
