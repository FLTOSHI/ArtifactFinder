package prs.fltoshi.artfinderConsole.control;

import prs.fltoshi.artfinderConsole.entity.AnomalyEntity;
import prs.fltoshi.artfinderConsole.entity.CharacterEntity;
import prs.fltoshi.artfinderConsole.entity.LocationEntity;

import java.util.Random;

public class ArtifactHunting {

    // Сущности.
    CharacterEntity character = new CharacterEntity();
    AnomalyEntity anomaly = new AnomalyEntity();
    LocationEntity location = new LocationEntity();

    // Классы для их обработки.
    LocationCreate locationCreate = new LocationCreate(location);
    AnomalyCreate anomalyCreate = new AnomalyCreate();
    AnomalyDetectorCreate anomalyDetector = new AnomalyDetectorCreate(character);
    ArtifactDetectorCreate artifactDetector = new ArtifactDetectorCreate(character);
    CharacterCreate characterCreate = new CharacterCreate(anomalyDetector, artifactDetector, character);

    Random dice = new Random(); // Инициализация кубика. Настроено ниже.
    private int limit = 0; // Порог.

    public void mainProcess() {
        characterCreate.createCharacter();
        locationCreate.anythingCreator();
//        anomalyCreate.anythingCreator();

/*        // первый этап.
        if (character.getIntelligence() + character.getAnomalies() + dice.nextInt(10) > limit) {
            System.out.println("Персонаж успешно вошёл в аномальное поле.");
        } else System.out.println("Персонаж успешно вляпался в аномалию " + anomaly.getName() + "!");

        // второй этап.
        if (dice.nextInt(2) != 1) {
            System.out.println(character.getName() + ' ' + "не смог найти артефакт, поэтому уходит из аномалии.");
        } else System.out.println(character.getName() + ' ' + "смог найти артефакт!");

        // третий этап
        if (character.getIntelligence() + character.getAnomalies() + dice.nextInt(10) > limit - 3) {
            System.out.println("Персонаж успешно вышел из аномального поля!");
        } else System.out.println("Персонаж успешно вляпался в аномалию " + anomaly.getName() + "!");*/
    }
}
