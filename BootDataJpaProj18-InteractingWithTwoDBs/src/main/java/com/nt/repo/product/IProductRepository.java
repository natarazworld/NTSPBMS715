package com.nt.repo.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.product.Product;

public interface  IProductRepository extends JpaRepository<Product, Integer> {

}
