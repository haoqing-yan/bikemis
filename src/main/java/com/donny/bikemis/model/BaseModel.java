package com.donny.bikemis.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Donny
 * @date 2024/6/12
 */
@Data
@MappedSuperclass
public class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @Column(name = "create_time", nullable = false, updatable = false)
    private LocalDateTime createTime;

    @JsonIgnore
    @Column(name = "update_time")
    private LocalDateTime updateTime;

    @JsonIgnore
    @Column(name = "creator")
    private String creator;

}
