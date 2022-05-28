package uz.isystem.Market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.isystem.Market.dto.AddressDto;
import uz.isystem.Market.dto.BrandDto;
import uz.isystem.Market.exception.BadRequest;
import uz.isystem.Market.model.Address;
import uz.isystem.Market.model.Brand;
import uz.isystem.Market.repository.AddressRepository;
import uz.isystem.Market.repository.BrandRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class BrandService {

    @Autowired
    private BrandRepository brandRepository;

    public BrandDto create(BrandDto brandDto) {
        Brand brand = new Brand();
        convertDtoToEntity(brandDto, brand);
        brand.setStatus("not");
        brand.setCreate_At(LocalDateTime.now());
        brandRepository.save(brand);
        brandDto.setId(brand.getId());
        return brandDto;

    }

    public BrandDto get(Integer id) {
        Brand brand = getEntity(id);
        BrandDto brandDto = new BrandDto();
        convertEntityToDto(brand, brandDto);
        return brandDto;
    }

    public boolean update(Integer id, BrandDto brandDto) {
        Brand update = getEntity(id);
        convertDtoToEntity(brandDto, update);
        brandRepository.save(update);
        return true;
    }

    public boolean delete(Integer id, BrandDto brandDto) {
        Brand brand = getEntity(id);
        brandRepository.delete(brand);
        return true;
    }


    private void convertDtoToEntity(BrandDto dto, Brand entity) {
        entity.setName(dto.getName());
    }


    private void convertEntityToDto(Brand entity, BrandDto dto) {
        dto.setName(entity.getName());
    }

    private Brand getEntity(Integer id) {
        Optional<Brand> optional = brandRepository.findById(id);
        if (optional.isEmpty()){
            throw  new BadRequest("Address not found");
        }
        return optional.get();
    }
}
