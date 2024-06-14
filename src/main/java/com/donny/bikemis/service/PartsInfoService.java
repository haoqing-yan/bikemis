package com.donny.bikemis.service;

import com.donny.bikemis.model.PartsInfo;
import com.donny.bikemis.repository.PartsInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
/**
 * @author Donny
 * @date 2024/6/12
 */


@Service
public class PartsInfoService {
    @Autowired
    private PartsInfoRepository partsInfoRepository;

    // Create or Update a part
    public PartsInfo savePart(PartsInfo part) {
        return partsInfoRepository.save(part);
    }

    // Retrieve a part by ID
    public Optional<PartsInfo> getPartById(Long id) {
        return partsInfoRepository.findById(id);
    }

    // Retrieve all parts
    public List<PartsInfo> getAllParts() {
        return partsInfoRepository.findAll();
    }

    // Delete a part
    public void deletePart(Long id) {
        partsInfoRepository.deleteById(id);
    }
}
