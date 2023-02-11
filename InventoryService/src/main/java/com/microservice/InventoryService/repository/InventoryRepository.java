package com.microservice.InventoryService.repository;


import com.microservice.InventoryService.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
//    List<Inventory> findBySkuCodeIn(List<String> skuCode);
    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
