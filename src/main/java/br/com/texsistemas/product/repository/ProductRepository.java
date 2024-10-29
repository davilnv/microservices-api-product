package br.com.texsistemas.product.repository;


import br.com.texsistemas.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
