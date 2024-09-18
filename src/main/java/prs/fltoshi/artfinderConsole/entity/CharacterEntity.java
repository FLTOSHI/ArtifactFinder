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

    String name = "";
    int intelligence = 0;
    int anomalies = 0;
    int artifacts = 0;

    // Логические переменные, отвечающие за то, может ли персонаж находить артефакты определенного тира.
    boolean tierOneAvailable = false;
    boolean tierTwoAvailable = false;
    boolean tierThreeAvailable = false;

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
