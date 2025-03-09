package learning.springframwork.ecommercewebapp.dao;

import learning.springframwork.ecommercewebapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// NOTE: When extending the JpaRepository, specify the Entity type and the primary key type.

public interface ProductRepository extends JpaRepository<Product, Long> {
}
