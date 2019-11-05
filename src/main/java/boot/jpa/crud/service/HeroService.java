package boot.jpa.crud.service;

import boot.jpa.crud.domain.hero.HeroRepository;
import boot.jpa.crud.dto.HeroSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class HeroService {

    private HeroRepository heroRepository;

    @Transactional
    public Long HeroSaveRequest(HeroSaveRequestDto dto){
        return heroRepository.save(dto.toEntity()).getId();
    }
}
