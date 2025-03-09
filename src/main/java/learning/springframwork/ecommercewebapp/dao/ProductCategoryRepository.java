package learning.springframwork.ecommercewebapp.dao;

import learning.springframwork.ecommercewebapp.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// NOTE: When creating a Repository you can specify the name of the JSON entry and reference path for the data.
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
