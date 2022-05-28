package uz.isystem.Market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.Market.dto.BrandDto;
import uz.isystem.Market.dto.MerchantDto;
import uz.isystem.Market.service.BrandService;

import javax.validation.Valid;

@RestController
@RequestMapping("/brands")
public class BranController {


    @Autowired
    private BrandService brandService;



    @PostMapping
    public ResponseEntity<?> create(@RequestBody @Valid BrandDto brandDto){
        BrandDto result = brandService.create(brandDto);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id){
        BrandDto result = brandService.get(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody @Valid BrandDto brandDto){
        boolean result = brandService.update(id, brandDto);
        return ResponseEntity.ok(result);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id,
                                    @RequestBody @Valid BrandDto brandDto){
        boolean result = brandService.delete(id,brandDto);
        return ResponseEntity.ok(result);

    }








}
