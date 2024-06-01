package prs.fltoshi.artfinderConsole.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnomalyEntity {
    private String name;    // Название аномалии.
    private String type;    // Вид аномалии. Определяет порождаемые артефакты. Например, гравитационная.

    @Override
    public String toString() {
        return type + " " + name;
    }
}
