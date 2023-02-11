package com.microservice.InventoryService.service;

import com.microservice.InventoryService.dto.InventoryResponse;
import com.microservice.InventoryService.model.Inventory;
import com.microservice.InventoryService.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public boolean isInStock(Long quantity, Long productId) {

         Inventory inventory = inventoryRepository.findById(productId).orElseThrow();

        return inventory.getQuantity() >= quantity;
    }
}
