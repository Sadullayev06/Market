package uz.isystem.Market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isystem.Market.model.Image;

public interface ImageRepository extends JpaRepository<Image,Integer> {
}
