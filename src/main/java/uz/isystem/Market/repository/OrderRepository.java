package uz.isystem.Market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isystem.Market.model.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
