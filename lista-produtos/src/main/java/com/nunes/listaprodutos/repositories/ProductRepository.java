package com.nunes.listaprodutos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nunes.listaprodutos.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
