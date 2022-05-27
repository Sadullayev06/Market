package uz.isystem.Market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.isystem.Market.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Integer> {
}
