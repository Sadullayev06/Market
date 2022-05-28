package uz.isystem.Market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.Market.dto.OsDto;
import uz.isystem.Market.dto.ProductDto;
import uz.isystem.Market.service.OsService;

import javax.validation.Valid;

@RestController
@RequestMapping("/oses")
public class OsController {


@Autowired
    private OsService osService;



    @PostMapping
    public ResponseEntity<?> create(@RequestBody @Valid OsDto osDto){
        OsDto result = osService.create(osDto);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id){
        OsDto result = osService.get(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody @Valid OsDto osDto){
        boolean result = osService.update(id, osDto);
        return ResponseEntity.ok(result);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id,
                                    @RequestBody @Valid OsDto osDto){
        boolean result = osService.delete(id,osDto);
        return ResponseEntity.ok(result);
    }


}