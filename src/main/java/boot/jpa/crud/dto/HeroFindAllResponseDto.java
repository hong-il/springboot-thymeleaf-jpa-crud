package boot.jpa.crud.dto;

import boot.jpa.crud.domain.hero.Hero;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Getter
public class HeroFindAllResponseDto {

    private Long id;
    private String name;
    private int age;
    private String note;
    private String modifiedDate;

    public HeroFindAllResponseDto(Hero entity) {
        id = entity.getId();
        name = entity.getName();
        age = entity.getAge();
        note = entity.getNote();
        modifiedDate = toStringLocalDateTime(entity.getModifiedDate());
    }

    public String toStringLocalDateTime(LocalDateTime modifiedDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return Optional.ofNullable(modifiedDate)
                .map(formatter::format)
                .orElse("");
    }
}
