package com.sprint1.evaluation.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sprint1.evaluation.domain.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
