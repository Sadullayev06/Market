package uz.isystem.Market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isystem.Market.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}
