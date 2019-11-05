package boot.jpa.crud.web;

import boot.jpa.crud.dto.HeroSaveRequestDto;
import boot.jpa.crud.service.HeroService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class WebRestController {

    private HeroService heroService;

    @PostMapping("/save")
    public Long HeroSaveRequest(@RequestBody HeroSaveRequestDto dto){
        return heroService.HeroSaveRequest(dto);
    }
}
