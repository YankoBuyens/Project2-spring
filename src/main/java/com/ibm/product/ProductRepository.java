package com.ibm.product;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ProductRepository extends CrudRepository<Product, String> {

    List<Product> findByCountryNotLike(String countryString);
    
}
