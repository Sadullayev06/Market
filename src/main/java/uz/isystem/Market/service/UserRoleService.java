package uz.isystem.Market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.isystem.Market.dto.OrderDto;
import uz.isystem.Market.dto.UserRoleDto;
import uz.isystem.Market.exception.BadRequest;
import uz.isystem.Market.model.Order;
import uz.isystem.Market.model.UserRole;
import uz.isystem.Market.repository.OrderRepository;
import uz.isystem.Market.repository.UserRoleRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserRoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;

    public UserRoleDto create(UserRoleDto userRoleDto) {
        UserRole userRole = new UserRole();
        convertDtoToEntity(userRoleDto, userRole);
        userRole.setStatus(true);
        userRole.setCreatedAt(LocalDateTime.now());
        userRoleRepository.save(userRole);
        userRoleDto.setId(userRole.getId());
        return userRoleDto;
    }

    public UserRoleDto get(Integer id) {
        UserRole userRole = getEntity(id);
        UserRoleDto userRoleDto = new UserRoleDto();
        convertEntityToDto(userRole, userRoleDto);
        return userRoleDto;
    }

    public boolean update(Integer id, UserRoleDto userRoleDto) {
        UserRole update = getEntity(id);
        convertDtoToEntity(userRoleDto, update);
        userRoleRepository.save(update);
        return true;
    }

    public boolean delete(Integer id, UserRoleDto userRoleDto) {
        UserRole userRole = getEntity(id);
        userRoleRepository.delete(userRole);
        return true;
    }

    private void convertDtoToEntity(UserRoleDto dto, UserRole entity) {
        entity.setName(dto.getName());
    }

    private void convertEntityToDto(UserRole entity, UserRoleDto dto) {
        dto.setName(entity.getName());
    }

    public UserRole getEntity(Integer id) {
        Optional<UserRole> optional = userRoleRepository.findById(id);
        if (optional.isEmpty()) {
            throw new BadRequest("Order not found");
        }
        return optional.get();
    }
}
