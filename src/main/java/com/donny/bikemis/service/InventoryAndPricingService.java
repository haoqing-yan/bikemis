package com.donny.bikemis.service;

import com.donny.bikemis.model.bo.InventoryAndPricing;
import com.donny.bikemis.repository.InventoryAndPricingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 * @author Donny
 * @date 2024/6/12
 */
@Service
public class InventoryAndPricingService {
    @Autowired
    private InventoryAndPricingRepository inventoryAndPricingRepository;

    public InventoryAndPricing saveInventoryAndPricing(InventoryAndPricing inventory) {
        return inventoryAndPricingRepository.save(inventory);
    }

    public Optional<InventoryAndPricing> getInventoryById(Long id) {
        return inventoryAndPricingRepository.findById(id);
    }

    public List<InventoryAndPricing> getAllInventory() {
        return inventoryAndPricingRepository.findAll();
    }

    public void deleteInventory(Long id) {
        inventoryAndPricingRepository.deleteById(id);
    }
}