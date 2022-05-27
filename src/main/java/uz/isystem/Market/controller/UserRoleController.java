package uz.isystem.Market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.isystem.Market.dto.UserDto;
import uz.isystem.Market.dto.UserRoleDto;
import uz.isystem.Market.service.UserRoleService;
import uz.isystem.Market.service.UserService;

import javax.validation.Valid;
@RestController
@RequestMapping("/userroles")
public class UserRoleController {




    @Autowired
    private UserRoleService userRoleService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody @Valid UserRoleDto userRoleDto){
        UserRoleDto result = userRoleService.create(userRoleDto);
        return ResponseEntity.ok(result);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id){
        UserRoleDto result = userRoleService.get(id);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id,@RequestBody @Valid UserRoleDto userRoleDto){
        boolean result = userRoleService.update(id,userRoleDto);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id, @RequestBody @Valid UserRoleDto userRoleDto){
        boolean result = userRoleService.delete(id,userRoleDto);
        return ResponseEntity.ok(result);
    }

}
