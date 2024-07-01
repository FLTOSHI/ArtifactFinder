package prs.fltoshi.artfinderConsole.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CharacterEntity {

    private String name;
    private Integer intelligence;
    private Integer anomalies;
    private Integer artifacts;

    @Override
    public String toString() {
        return "Персонаж:" + '\n' +
                "Имя / Прозвище: " + name + '\n' +
                "Интеллект: " + ' ' + intelligence + '\n' +
                "Навык «Аномалии»: " + ' ' + anomalies + '\n' +
                "Навык «Артефакты»" + ' ' + artifacts + '\n' +
        "-=-=-=-=-=-=-=-";
    }
}
