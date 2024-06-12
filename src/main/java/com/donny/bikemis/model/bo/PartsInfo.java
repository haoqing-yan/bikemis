package com.donny.bikemis.model.bo;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author Your Name
 * @date 2024/6/12
 */
@Entity
@Table(name = "parts_info")
@Data
public class PartsInfo extends BaseModel {
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "brand")
    private String brand;

    @Column(name = "color")
    private String color;

    @Column(name = "material")
    private String material;

    @Column(name = "comment")
    private String comment;

    @Column(name = "size")
    private String size;

    @Column(name = "weight")
    private String weight;

    @Column(name = "compatibility")
    private String compatibility;

    @Column(name = "safety_rating")
    private String safetyRating;

    @Column(name = "min_lifespan")
    private Integer minLifespan;
}
