package prs.fltoshi.artfinderConsole.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocationEntity {
    private String name;
    private Integer tier;

    @Override
    public String toString() {
        return "Локация " + name + tier;
    }
}
