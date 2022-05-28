package uz.isystem.Market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.isystem.Market.dto.OrderDto;
import uz.isystem.Market.dto.UserDto;
import uz.isystem.Market.exception.BadRequest;
import uz.isystem.Market.model.Order;
import uz.isystem.Market.model.User;
import uz.isystem.Market.repository.OrderRepository;
import uz.isystem.Market.repository.UserRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDto create(UserDto userDto) {
        User user = new User();
        convertDtoToEntity(userDto, user);
        user.setStatus(true);
        user.setCreatedAt(LocalDateTime.now());
        userRepository.save(user);
        userDto.setId(user.getId());
        return userDto;
    }

    public UserDto get(Integer id) {
        User user = getEntity(id);
        UserDto userDto = new UserDto();
        convertEntityToDto(user, userDto);
        return userDto;
    }

    public boolean update(Integer id, UserDto userDto) {
        User update = getEntity(id);
        convertDtoToEntity(userDto, update);
        userRepository.save(update);
        return true;
    }

    public boolean delete(Integer id, UserDto userDto) {
        User user = getEntity(id);
        userRepository.delete(user);
        return true;
    }

    private void convertDtoToEntity(UserDto dto, User entity) {
        entity.setContact(dto.getContact());
        entity.setAddressId(dto.getAdressId());
        entity.setEmail(dto.getEmail());
        entity.setImageId(dto.getImageId());
        entity.setName(dto.getName());
        entity.setSurname(dto.getSurname());
        entity.setPassword(dto.getPassword());
    }

    private void convertEntityToDto(User entity, UserDto dto) {
        dto.setContact(entity.getContact());
        dto.setAdressId(entity.getAddressId());
        dto.setEmail(entity.getEmail());
        dto.setImageId(entity.getImageId());
        dto.setName(entity.getName());
        dto.setSurname(entity.getSurname());
        dto.setPassword(entity.getPassword());
    }

    public User getEntity(Integer id) {
        Optional<User> optional = userRepository.findById(id);
        if (optional.isEmpty()) {
            throw new BadRequest("Order not found");
        }
        return optional.get();
    }
}
