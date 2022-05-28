package uz.isystem.Market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.isystem.Market.dto.AddressDto;
import uz.isystem.Market.dto.OsDto;
import uz.isystem.Market.exception.BadRequest;
import uz.isystem.Market.model.Address;
import uz.isystem.Market.model.Os;
import uz.isystem.Market.repository.AddressRepository;
import uz.isystem.Market.repository.OsRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class OsService {

    @Autowired
    private OsRepository osRepository;

    public OsDto create(OsDto osDto) {
        Os os = new Os();
        convertDtoToEntity(osDto, os);
        os.setStatus("true");
        os.setCreated_At(LocalDateTime.now());
        osRepository.save(os);
        osDto.setId(os.getId());
        return osDto;

    }

    public OsDto get(Integer id) {
        Os os = getEntity(id);
        OsDto osDto = new OsDto();
        convertEntityToDto(os, osDto);
        return osDto;
    }

    public boolean update(Integer id, OsDto osDto) {
        Os update = getEntity(id);
        convertDtoToEntity(osDto, update);
        osRepository.save(update);
        return true;
    }

    public boolean delete(Integer id, OsDto osDto) {
        Os os = getEntity(id);
        osRepository.delete(os);
        return true;
    }


    private void convertDtoToEntity(OsDto dto, Os entity) {
        entity.setName(dto.getName());
    }


    private void convertEntityToDto(Os entity, OsDto dto) {
        dto.setName(entity.getName());
    }

    private Os getEntity(Integer id) {
        Optional<Os> optional = osRepository.findById(id);
        if (optional.isEmpty()){
            throw  new BadRequest("Address not found");
        }
        return optional.get();
    }
}
