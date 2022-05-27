package uz.isystem.Market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.Market.dto.ImageDto;
import uz.isystem.Market.model.Image;
import uz.isystem.Market.service.ImageService;

import javax.validation.Valid;

@RestController
@RequestMapping("/images")
public class ImageController {

    @Autowired
    private ImageService imageService;


    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody @Valid ImageDto imageDto){
        ImageDto result = imageService.create(imageDto);
        return ResponseEntity.ok(result);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id){
        ImageDto result = imageService.get(id);
        return ResponseEntity.ok(result);
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,
                                    @RequestBody @Valid ImageDto imageDto){
        boolean result = imageService.update(id,imageDto);
        return ResponseEntity.ok(result);
    }

@DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id,
                                    @RequestBody @Valid ImageDto imageDto){
        boolean result = imageService.delete(id,imageDto);
        return ResponseEntity.ok(result);
}


}
