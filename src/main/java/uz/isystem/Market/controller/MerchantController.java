package uz.isystem.Market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.Market.dto.MerchantDto;
import uz.isystem.Market.dto.ProductDto;
import uz.isystem.Market.service.MerchantService;

import javax.validation.Valid;

@RestController
@RequestMapping("/merchantss")
public class MerchantController {

    @Autowired
    private MerchantService merchantService;


    @PostMapping
    public ResponseEntity<?> create(@RequestBody @Valid MerchantDto merchantDto){
        MerchantDto result = merchantService.create(merchantDto);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id){
        MerchantDto result = merchantService.get(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody @Valid MerchantDto merchantDto){
        boolean result = merchantService.update(id, merchantDto);
        return ResponseEntity.ok(result);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id,
                                    @RequestBody @Valid MerchantDto merchantDto){
        boolean result = merchantService.delete(id,merchantDto);
        return ResponseEntity.ok(result);

    }




















}
