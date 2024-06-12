package com.donny.bikemis.controller;
import com.donny.bikemis.model.bo.PartsInfo;
import com.donny.bikemis.service.PartsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Donny
 * @date 2024/6/12
 */
@RestController
@RequestMapping("/api/parts")
public class PartController {

    @Autowired
    private PartsInfoService partsInfoService;

    // POST endpoint to create a new part
    @PostMapping
    public ResponseEntity<PartsInfo> createPart(@RequestBody PartsInfo part) {
        PartsInfo savedPart = partsInfoService.savePart(part);
        return ResponseEntity.ok(savedPart);
    }

    // GET endpoint to retrieve a part by its ID
    @GetMapping("/{id}")
    public ResponseEntity<PartsInfo> getPartById(@PathVariable Long id) {
        Optional<PartsInfo> part = partsInfoService.getPartById(id);
        if (part.isPresent()) {
            return ResponseEntity.ok(part.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // GET endpoint to retrieve all parts
    @GetMapping
    public ResponseEntity<List<PartsInfo>> getAllParts() {
        List<PartsInfo> parts = partsInfoService.getAllParts();
        return ResponseEntity.ok(parts);
    }

    // PUT endpoint to update an existing part
    @PutMapping("/{id}")
    public ResponseEntity<PartsInfo> updatePart(@PathVariable Long id, @RequestBody PartsInfo partDetails) {
        Optional<PartsInfo> partOptional = partsInfoService.getPartById(id);
        if (!partOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        partDetails.setId(id); // Ensure the correct part is updated
        PartsInfo updatedPart = partsInfoService.savePart(partDetails);
        return ResponseEntity.ok(updatedPart);
    }

    // DELETE endpoint to delete a part
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePart(@PathVariable Long id) {
        if (!partsInfoService.getPartById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        partsInfoService.deletePart(id);
        return ResponseEntity.ok().build();
    }
}
