package uz.isystem.Market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.isystem.Market.dto.OrderDto;
import uz.isystem.Market.exception.BadRequest;
import uz.isystem.Market.model.Order;
import uz.isystem.Market.repository.OrderRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderDto create(OrderDto orderDto) {
        Order order = new Order();
        convertDtoToEntity(orderDto, order);
        order.setStatus(true);
        order.setCreatedAt(LocalDateTime.now());
        orderRepository.save(order);
        orderDto.setId(order.getId());
        return orderDto;
    }

    public OrderDto get(Integer id) {
        Order order = getEntity(id);
        OrderDto orderDto = new OrderDto();
        convertEntityToDto(order, orderDto);
        return orderDto;
    }

    public boolean update(Integer id, OrderDto orderDto) {
        Order update = getEntity(id);
        convertDtoToEntity(orderDto, update);
        orderRepository.save(update);
        return true;
    }

    public boolean delete(Integer id, OrderDto orderDto) {
        Order order = getEntity(id);
        orderRepository.delete(order);
        return true;
    }

    private void convertDtoToEntity(OrderDto dto, Order entity) {
        entity.setAddress(dto.getAdress());
        entity.setContact(dto.getContact());
        entity.setDelevereDate(dto.getDeleveredDate());
        entity.setRequirment(dto.getRequirment());
        entity.setDeliveryDate(dto.getDeliveryDate());
        entity.setTotal_payment(dto.getTotal_payment());
        entity.setUser(dto.getUser());
    }

    private void convertEntityToDto(Order entity, OrderDto dto) {
        dto.setContact(entity.getContact());
        dto.setDeliveryDate(entity.getDeliveryDate());
        dto.setRequirment(entity.getRequirment());
        dto.setTotal_payment(entity.getTotal_payment());
        dto.setAdress(entity.getAddress());
        dto.setDeleveredDate(entity.getDelevereDate());
        dto.setUser(entity.getUser());
    }

    public Order getEntity(Integer id) {
        Optional<Order> optional = orderRepository.findById(id);
        if (optional.isEmpty()) {
            throw new BadRequest("Order not found");
        }
        return optional.get();
    }
}
