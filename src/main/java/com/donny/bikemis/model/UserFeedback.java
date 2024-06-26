package com.donny.bikemis.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @author Donny
 * @date 2024/6/12
 */
@Entity
@Table(name = "user_feedback")
@Data
public class UserFeedback extends BaseModel {

    @Column(name = "part_id")
    private Long partId;

    @Column(name = "user_rating")
    private Float userRating;

    @Column(name = "feedback", columnDefinition = "TEXT")
    private String feedback;
}
