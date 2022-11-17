package com.sprint1.evaluation.services;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint1.evaluation.domain.Product;
import com.sprint1.evaluation.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ProductRepository productRepository;
	

	@Override
	public void saveProduct(Product product) {
		productRepository.save(product);
	}
	

	@Override
	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);
	}
	
	@Override
	public Iterable<Product> listAllProducts() {
		logger.debug("listAllProducts called");
		return productRepository.findAll();
	}
	

	@Override
	public Product getProductById(Integer id) {
		Optional<Product> optPro = productRepository.findById(id);
		return optPro.get();
	}
	

}
