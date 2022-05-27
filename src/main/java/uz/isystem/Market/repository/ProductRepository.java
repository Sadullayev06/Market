package uz.isystem.Market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isystem.Market.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
