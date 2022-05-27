package uz.isystem.Market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.Market.dto.ProductTypeDto;
import uz.isystem.Market.service.ProductTypeService;

import javax.validation.Valid;

@RestController
@RequestMapping("/producttypes")
public class ProductTypeController {


@Autowired
    private ProductTypeService productTypeService;

@PostMapping("/create")
public ResponseEntity<?> create(@RequestBody @Valid ProductTypeDto productTypeDto){
    ProductTypeDto result = productTypeService.create(productTypeDto);
    return ResponseEntity.ok(result);
}

@GetMapping("/{id}")
public ResponseEntity<?> get(@PathVariable("id") Integer id){
    ProductTypeDto result = productTypeService.get(id);
    return ResponseEntity.ok(result);
}

@PutMapping("/{id}")
public ResponseEntity<?> update(@PathVariable("id") Integer id,@RequestBody @Valid ProductTypeDto productTypeDto){
    boolean result = productTypeService.update(id,productTypeDto);
    return ResponseEntity.ok(result);
}

@DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id,@RequestBody @Valid ProductTypeDto productTypeDto){
    boolean result = productTypeService.delete(id,productTypeDto);
    return ResponseEntity.ok(result);
}


}
