package com.aficionado.repository;

import java.util.List;

import com.aficionado.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends CrudRepository <Product, Long> {

}
