package uz.isystem.Market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.isystem.Market.dto.OrderDto;
import uz.isystem.Market.dto.ProductDto;
import uz.isystem.Market.exception.BadRequest;
import uz.isystem.Market.model.Order;
import uz.isystem.Market.model.Product;
import uz.isystem.Market.repository.OrderRepository;
import uz.isystem.Market.repository.ProductRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductDto create(ProductDto productDto) {
        Product product = new Product();
        convertDtoToEntity(productDto, product);
        product.setStatus(true);
        product.setCreatedAt(LocalDateTime.now());
        productRepository.save(product);
        productDto.setId(product.getId());
        return productDto;
    }

    public ProductDto get(Integer id) {
        Product product = getEntity(id);
        ProductDto productDto = new ProductDto();
        convertEntityToDto(product, productDto);
        return productDto;
    }

    public boolean update(Integer id, ProductDto productDto) {
        Product update = getEntity(id);
        convertDtoToEntity(productDto, update);
        productRepository.save(update);
        return true;
    }

    public boolean delete(Integer id, ProductDto productDto) {
        Product product = getEntity(id);
        productRepository.delete(product);
        return true;
    }

    private void convertDtoToEntity(ProductDto dto, Product entity) {
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setPrice(dto.getPrice());
        entity.setProductType(dto.getProductType());
        entity.setRate(dto.getRate());
        entity.setVisible(dto.getVisible());
    }

    private void convertEntityToDto(Product entity, ProductDto dto) {
        dto.setName(entity.getName());
        dto.setProductType(entity.getProductType());
        dto.setDescription(entity.getDescription());
        dto.setPrice(entity.getPrice());
        dto.setRate(entity.getRate());
        dto.setVisible(entity.getVisible());
    }

    public Product getEntity(Integer id) {
        Optional<Product> optional = productRepository.findById(id);
        if (optional.isEmpty()) {
            throw new BadRequest("Order not found");
        }
        return optional.get();
    }
}
