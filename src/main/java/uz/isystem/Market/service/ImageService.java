package uz.isystem.Market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.isystem.Market.dto.ImageDto;
import uz.isystem.Market.exception.BadRequest;
import uz.isystem.Market.model.Image;
import uz.isystem.Market.repository.ImageRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public ImageDto create(ImageDto imageDto) {
        Image image = new Image();
        convertDtoToEntity(imageDto, image);
        image.setStatus(true);
        image.setCreatedAt(LocalDateTime.now());
        imageRepository.save(image);
        imageDto.setId(image.getId());
        return imageDto;
    }

    public ImageDto get(Integer id) {
        Image image = getEntity(id);
        ImageDto imageDto = new ImageDto();
        convertEntityToDto(image, imageDto);
        return imageDto;
    }

    public boolean update(Integer id, ImageDto imageDto) {
        Image update = getEntity(id);
        convertDtoToEntity(imageDto, update);
        imageRepository.save(update);
        return true;

    }

    public boolean delete(Integer id, ImageDto imageDto) {
        Image image = getEntity(id);
        imageRepository.delete(image);
        return true;
    }


    private void convertDtoToEntity(ImageDto dto, Image entity) {
        entity.setPath(dto.getPath());
        entity.setSize(dto.getSize());
        entity.setToken(dto.getToken());
        entity.setType(dto.getType());
    }


    private void convertEntityToDto(Image entity, ImageDto dto) {
        dto.setPath(entity.getPath());
        dto.setSize(entity.getSize());
        dto.setToken(entity.getToken());
        dto.setType(entity.getType());
    }

    private Image getEntity(Integer id) {
        Optional<Image> optional = imageRepository.findById(id);
        if (optional.isEmpty()){
            throw new BadRequest("Image not found");
        }
        return optional.get();
    }
}
