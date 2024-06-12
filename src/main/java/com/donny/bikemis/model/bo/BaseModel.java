package com.donny.bikemis.model.bo;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Your Name
 * @date 2024/6/12
 */
@Data
@MappedSuperclass
public class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_time", nullable = false, updatable = false)
    private LocalDateTime createTime;

    @Column(name = "update_time")
    private LocalDateTime updateTime;

    @Column(name = "creator")
    private String creator;

}
