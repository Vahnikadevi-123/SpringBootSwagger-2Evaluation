package com.sprint1.evaluation.services;

import com.sprint1.evaluation.domain.Product;

public interface ProductService {

	void saveProduct(Product product);

	Product getProductById(Integer id);

	void deleteProduct(Integer id);

	Iterable listAllProducts();

	

}
