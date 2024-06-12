package com.donny.bikemis.repository;

import com.donny.bikemis.model.bo.PartsInfo;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Donny
 * @date 2024/6/12
 */
@Repository
public interface PartsInfoRepository extends JpaRepository<PartsInfo, Long> {
}
