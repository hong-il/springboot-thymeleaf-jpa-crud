package boot.jpa.crud.service;

import boot.jpa.crud.domain.hero.HeroRepository;
import boot.jpa.crud.dto.HeroFindAllResponseDto;
import boot.jpa.crud.dto.HeroSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HeroService {

    private HeroRepository heroRepository;

    @Transactional
    public Long HeroSaveRequest(HeroSaveRequestDto dto){
        return heroRepository.save(dto.toEntity()).getId();
    }

    @Transactional
    @ReadOnlyProperty
    public List<HeroFindAllResponseDto> HeroFindAllResponse() {
        return heroRepository.findAll().stream()
                .map(HeroFindAllResponseDto::new)
                .collect(Collectors.toList());
    }
}
