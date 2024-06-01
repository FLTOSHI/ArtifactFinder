package prs.fltoshi.artfinderConsole.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArtifactEntity {
    private String name;    // Название артефакта.
    private String type;    // Тип артефакта. Например, химический.
    private Integer tier;   // Тир артефакта. Определяет его редкость.
}
