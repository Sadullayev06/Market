package uz.isystem.Market.repository;

import org.hibernate.usertype.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import uz.isystem.Market.model.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole,Integer> {
}
