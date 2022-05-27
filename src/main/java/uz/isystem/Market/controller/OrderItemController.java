package uz.isystem.Market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.Market.dto.OrderItemDto;
import uz.isystem.Market.model.OrderItem;
import uz.isystem.Market.service.OrderItemService;

import javax.validation.Valid;

@RestController
@RequestMapping("/orderitems")
public class OrderItemController {


@Autowired
    private OrderItemService orderItemService;

@PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody @Valid OrderItemDto orderItemDto){
    OrderItemDto result = orderItemService.create(orderItemDto);
    return ResponseEntity.ok(result);
}

@GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable ("id") Integer id){
    OrderItemDto result = orderItemService.get(id);
    return ResponseEntity.ok(result);
}

@PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,@RequestBody @Valid OrderItemDto orderItemDto){
    boolean result = orderItemService.update(id,orderItemDto);
    return ResponseEntity.ok(result);
}


@DeleteMapping("/{id}")
public ResponseEntity<?> delete(@PathVariable("id") Integer id,@RequestBody @Valid OrderItemDto orderItemDto){
    boolean result = orderItemService.delete(id,orderItemDto);
    return ResponseEntity.ok(result);
}



}
