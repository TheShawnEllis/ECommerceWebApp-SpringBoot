package learning.springframwork.ecommercewebapp.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

// NOTE: There is a known issue with @Data when using many-to-one and one-to-many
//      Using @Getter & @Setter instead of @Data to produce same result.
@Entity
@Table(name="product_category")
// @Data
@Getter
@Setter
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;
}
