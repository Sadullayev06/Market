package uz.isystem.Market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.isystem.Market.dto.AddressDto;
import uz.isystem.Market.dto.MerchantDto;
import uz.isystem.Market.exception.BadRequest;
import uz.isystem.Market.model.Address;
import uz.isystem.Market.model.Merchant;
import uz.isystem.Market.repository.AddressRepository;
import uz.isystem.Market.repository.MerchantsRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class MerchantService {

    @Autowired
    private MerchantsRepository merchantsRepository;

    public MerchantDto create(MerchantDto merchantDto) {
        Merchant merchant = new Merchant();
        convertDtoToEntity(merchantDto, merchant);
        merchant.setStatus("true");
        merchant.setCreated_At(LocalDateTime.now());
        merchantsRepository.save(merchant);
        merchantDto.setId(merchant.getId());
        return merchantDto;

    }

    public MerchantDto get(Integer id) {
        Merchant merchant = getEntity(id);
        MerchantDto merchantDto = new MerchantDto();
        convertEntityToDto(merchant, merchantDto);
        return merchantDto;
    }

    public boolean update(Integer id, MerchantDto merchantDto) {
        Merchant update = getEntity(id);
        convertDtoToEntity(merchantDto, update);
        merchantsRepository.save(update);
        return true;
    }

    public boolean delete(Integer id, MerchantDto merchantDto) {
        Merchant merchant = getEntity(id);
        merchantsRepository.delete(merchant);
        return true;
    }


    private void convertDtoToEntity(MerchantDto dto, Merchant entity) {
        entity.setName(dto.getName());
    }


    private void convertEntityToDto(Merchant entity, MerchantDto dto) {
        dto.setName(entity.getName());
    }

    private Merchant getEntity(Integer id) {
        Optional<Merchant> optional = merchantsRepository.findById(id);
        if (optional.isEmpty()){
            throw  new BadRequest("Address not found");
        }
        return optional.get();
    }
}
