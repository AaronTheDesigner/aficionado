package com.aficionado.sevice;

import com.aficionado.models.Product;
import com.aficionado.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(long id) {
        return productRepository.findById(id);
    }

    public List<Product> findByColor(String color) {
        return productRepository.findByColor(color);
    }

    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }

    public void save(Product product) {
        productRepository.save(product);
    }

    public void deleteById(long id) {
        productRepository.deleteById(id);
    }

    public List<Product> findByColorOrName(String color, String name) {
        if(name == null && color == null) {
            return productRepository.findAll();
        }
        else if (color == null) {
            return productRepository.findByName(name);
        }
        else if (name == null) {
            return productRepository.findByColor(color);
        }
        else {
            return productRepository.findByNameAndColor(name, color);
        }

    }
}
