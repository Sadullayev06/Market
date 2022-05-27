package uz.isystem.Market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isystem.Market.model.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
