package uz.isystem.Market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.isystem.Market.dto.AddressDto;
import uz.isystem.Market.exception.BadRequest;
import uz.isystem.Market.model.Address;
import uz.isystem.Market.repository.AddressRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public AddressDto create(AddressDto addressDto) {
        Address address = new Address();
        convertDtoToEntity(addressDto, address);
        address.setStatus(true);
        address.setCreatedAt(LocalDateTime.now());
        addressRepository.save(address);
        addressDto.setId(address.getId());
        return addressDto;

    }

    public AddressDto get(Integer id) {
        Address address = getEntity(id);
        AddressDto addressDto = new AddressDto();
        convertEntityToDto(address, addressDto);
        return addressDto;
    }

    public boolean update(Integer id, AddressDto addressDto) {
        Address update = getEntity(id);
        convertDtoToEntity(addressDto, update);
        addressRepository.save(update);
        return true;
    }

    public boolean delete(Integer id, AddressDto addressDto) {
        Address address = getEntity(id);
        addressRepository.delete(address);
        return true;
    }


    private void convertDtoToEntity(AddressDto dto, Address entity) {
        entity.setCity(dto.getCity());
        entity.setDistrict(dto.getDistrict());
        entity.setHome(dto.getHome());
        entity.setRegion(dto.getRegion());
    }


    private void convertEntityToDto(Address entity, AddressDto dto) {
        dto.setCity(entity.getCity());
        dto.setHome(entity.getHome());
        dto.setRegion(entity.getRegion());
        dto.setStreet(entity.getStreet());
    }

    private Address getEntity(Integer id) {
        Optional<Address> optional = addressRepository.findById(id);
        if (optional.isEmpty()){
            throw  new BadRequest("Address not found");
        }
         return optional.get();
    }


}
