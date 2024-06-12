package com.donny.bikemis.repository;

import com.donny.bikemis.model.bo.InventoryAndPricing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Donny
 * @date 2024/6/12
 */
@Repository
public interface InventoryAndPricingRepository extends JpaRepository<InventoryAndPricing, Long> {

}
