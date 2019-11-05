package boot.jpa.crud.web;

import boot.jpa.crud.dto.HeroFindByIdResponseDto;
import boot.jpa.crud.dto.HeroSaveRequestDto;
import boot.jpa.crud.dto.HeroUpdateRequestDto;
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

    @PostMapping("/find")
    public HeroFindByIdResponseDto HeroFindByIdResponse(@RequestBody Long id) {
        return heroService.HeroFindByIdResponse(id);
    }

    @PutMapping("/update")
    public Long HeroUpdateRequest(@RequestBody HeroUpdateRequestDto dto) {
        return heroService.HeroUpdateRequest(dto);
    }

    @DeleteMapping("/delete")
    public Long HeroDeleteByIdRequest(@RequestBody Long id) {
        heroService.HeroDeleteByIdRequest(id);
        return id;
    }
}
