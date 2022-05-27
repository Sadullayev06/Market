package uz.isystem.Market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.Market.dto.OrderDto;
import uz.isystem.Market.service.OrderService;

import javax.validation.Valid;

@RestController
@RequestMapping("orders")
public class OrderController {


    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody @Valid OrderDto orderDto) {
        OrderDto result = orderService.create(orderDto);
        return ResponseEntity.ok(orderDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id) {
        OrderDto result = orderService.get(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody @Valid OrderDto orderDto) {
        boolean result = orderService.update(id, orderDto);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id,
                                    @RequestBody @Valid OrderDto orderDto) {
        boolean result = orderService.delete(id, orderDto);
        return ResponseEntity.ok(result);
    }


}
