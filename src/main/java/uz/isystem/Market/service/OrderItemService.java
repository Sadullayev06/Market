package uz.isystem.Market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.isystem.Market.dto.OrderItemDto;
import uz.isystem.Market.exception.BadRequest;
import uz.isystem.Market.model.OrderItem;
import uz.isystem.Market.repository.OrderItemRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    public OrderItemDto create(OrderItemDto orderItemDto) {
        OrderItem orderItem = new OrderItem();
        convertDtoToEntity(orderItemDto, orderItem);
        orderItem.setStatus(true);
        orderItem.setCreatedAt(LocalDateTime.now());
        orderItemRepository.save(orderItem);
        orderItemDto.setId(orderItem.getId());
        return orderItemDto;

    }

    public OrderItemDto get(Integer id) {
        OrderItem orderItem = getEntity(id);
        OrderItemDto orderItemDto = new OrderItemDto();
        convertEntityToDto(orderItem, orderItemDto);
        return orderItemDto;
    }

    public boolean update(Integer id, OrderItemDto orderItemDto) {
        OrderItem update = getEntity(id);
        convertDtoToEntity(orderItemDto, update);
        orderItemRepository.save(update);
        return true;
    }

    public boolean delete(Integer id, OrderItemDto orderItemDto) {
        OrderItem orderItem = getEntity(id);
        orderItemRepository.delete(orderItem);
        return true;
    }

    private void convertDtoToEntity(OrderItemDto dto, OrderItem entity) {
        entity.setOrder(dto.getOrder());
        entity.setProduct(dto.getProduct());
    }

    private void convertEntityToDto(OrderItem entity, OrderItemDto dto) {
        dto.setOrder(entity.getOrder());
        dto.setProduct(entity.getProduct());
    }

    public OrderItem getEntity(Integer id) {
        Optional<OrderItem> optional = orderItemRepository.findById(id);
        if (optional.isEmpty()) {
            throw new BadRequest("OrderItem not found");
        }
        return optional.get();
    }
}
