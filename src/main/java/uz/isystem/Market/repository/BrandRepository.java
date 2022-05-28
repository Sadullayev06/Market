package uz.isystem.Market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isystem.Market.model.Brand;

public interface BrandRepository extends JpaRepository<Brand,Integer> {
}
