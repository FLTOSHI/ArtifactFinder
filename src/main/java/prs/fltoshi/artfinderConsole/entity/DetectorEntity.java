package prs.fltoshi.artfinderConsole.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetectorEntity {
    private String name;    // Название детектора.
    private String type;    // Тип детекора. Детектит аномалии или артефакты.

    @Override
    public String toString() {
        return type + " " + name;
    }
}