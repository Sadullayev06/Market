package uz.isystem.Market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.isystem.Market.dto.OrderDto;
import uz.isystem.Market.dto.ProductTypeDto;
import uz.isystem.Market.exception.BadRequest;
import uz.isystem.Market.model.Order;
import uz.isystem.Market.model.ProductType;
import uz.isystem.Market.repository.OrderRepository;
import uz.isystem.Market.repository.ProductTypeRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ProductTypeService {

    @Autowired
    private ProductTypeRepository productTypeRepository;

    public ProductTypeDto create(ProductTypeDto productTypeDto) {
        ProductType productType = new ProductType();
        convertDtoToEntity(productTypeDto, productType);
        productType.setStatus(true);
        productType.setCreatedAt(LocalDateTime.now());
        productTypeRepository.save(productType);
        productTypeDto.setId(productType.getId());
        return productTypeDto;
    }

    public ProductTypeDto get(Integer id) {
        ProductType productType = getEntity(id);
        ProductTypeDto productTypeDto = new ProductTypeDto();
        convertEntityToDto(productType, productTypeDto);
        return productTypeDto;
    }

    public boolean update(Integer id, ProductTypeDto productTypeDto) {
        ProductType update = getEntity(id);
        convertDtoToEntity(productTypeDto, update);
        productTypeRepository.save(update);
        return true;
    }

    public boolean delete(Integer id, ProductTypeDto productTypeDto) {
        ProductType productType = getEntity(id);
        productTypeRepository.delete(productType);
        return true;
    }

    private void convertDtoToEntity(ProductTypeDto dto, ProductType entity) {
        entity.setBran_id(dto.getBran_id());
        entity.setCamera_back(dto.getCamera_back());
        entity.setCore(dto.getCore());
        entity.setCamera_fron(dto.getCamera_fron());
        entity.setDisplay(dto.getDisplay());
        entity.setMaterial(dto.getMaterial());
        entity.setName(dto.getName());
    }

    private void convertEntityToDto(ProductType entity, ProductTypeDto dto) {
        dto.setBran_id(entity.getBran_id());
        dto.setCamera_back(entity.getCamera_back());
        dto.setCore(entity.getCore());
        dto.setCamera_fron(entity.getCamera_fron());
        dto.setDisplay(entity.getDisplay());
        dto.setMaterial(entity.getMaterial());
        dto.setName(entity.getName());
    }

    public ProductType getEntity(Integer id) {
        Optional<ProductType> optional = productTypeRepository.findById(id);
        if (optional.isEmpty()) {
            throw new BadRequest("Order not found");
        }
        return optional.get();
    }
}
