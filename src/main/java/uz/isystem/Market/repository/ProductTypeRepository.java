package uz.isystem.Market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isystem.Market.model.ProductType;

public interface ProductTypeRepository extends JpaRepository<ProductType,Integer> {
}
