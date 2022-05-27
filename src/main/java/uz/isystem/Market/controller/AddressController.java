package uz.isystem.Market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.Market.dto.AddressDto;
import uz.isystem.Market.service.AddressService;

import javax.validation.Valid;

@RestController
@RequestMapping("/adresses")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/create")

    public ResponseEntity<?> create(@RequestBody @Valid AddressDto addressDto){
        AddressDto result = addressService.create(addressDto);
        return ResponseEntity.ok(result);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id){
        AddressDto result = addressService.get(id);
        return ResponseEntity.ok(result);
    }


@PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,@RequestBody @Valid AddressDto addressDto){
        boolean result = addressService.update(id,addressDto);
        return ResponseEntity.ok(result);
}

@DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id,@RequestBody @Valid AddressDto addressDto){
        boolean result = addressService.delete(id,addressDto);
        return ResponseEntity.ok(result);
}







}
