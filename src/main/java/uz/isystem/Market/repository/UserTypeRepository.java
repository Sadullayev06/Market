package uz.isystem.Market.repository;

import org.hibernate.usertype.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeRepository extends JpaRepository<UserType,Integer> {
}
