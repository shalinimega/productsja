package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	@Query(value = "SELECT * FROM product_details WHERE price = (SELECT MAX(price) FROM product_details)", nativeQuery = true)
	public Product maxprice();
	
	
	@Query(value = "SELECT * FROM product_details ORDER BY price ASC LIMIT 1,1", nativeQuery = true)
	public Product minprice();

	@Query(value = "SELECT * FROM product_details WHERE hsn=?", nativeQuery = true)
	public Product number(int h);




}
