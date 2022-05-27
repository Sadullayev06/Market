package uz.isystem.Market.controller;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.Market.dto.ProductDto;
import uz.isystem.Market.service.ProductService;

import javax.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductController {


 @Autowired
    private ProductService productService;

 @PostMapping
    public ResponseEntity<?> create( @RequestBody @Valid ProductDto productDto){
     ProductDto result = productService.create(productDto);
     return ResponseEntity.ok(result);
 }

 @GetMapping("/{id}")
 public ResponseEntity<?> get(@PathVariable("id") Integer id){
     ProductDto result = productService.get(id);
     return ResponseEntity.ok(result);
 }

 @PutMapping("/{id}")
public ResponseEntity<?> update(@PathVariable("id") Integer id,@RequestBody @Valid ProductDto productDto){
     boolean result = productService.update(id, productDto);
     return ResponseEntity.ok(result);
 }


 @DeleteMapping("/{id}")
public ResponseEntity<?> delete(@PathVariable("id") Integer id,@RequestBody @Valid ProductDto productDto){
     boolean result = productService.delete(id,productDto);
     return ResponseEntity.ok(result);

 }






}
