package prs.fltoshi.artfinderConsole.control;

import prs.fltoshi.artfinderConsole.entity.AnomalyEntity;
import prs.fltoshi.artfinderConsole.entity.CharacterEntity;
import prs.fltoshi.artfinderConsole.entity.LocationEntity;

import java.util.Random;
import java.util.Scanner;

public class ArtifactHunting {

    CharacterCreate characterCreate = new CharacterCreate();
    DetectorCreate detectorCreate = new DetectorCreate();
    LocationCreate locationCreate = new LocationCreate();
    AnomalyCreate anomalyCreate = new AnomalyCreate();

    CharacterEntity character = new CharacterEntity();
    AnomalyEntity anomaly = new AnomalyEntity();
    LocationEntity location = new LocationEntity();

    Random dice = new Random();

    private int limit = 0;
    Scanner scanner = new Scanner(System.in);


    public void mainProcess() {
        characterCreate.characterCreation();
        detectorCreate.anomalyDetectorSelect();
        detectorCreate.artifactDetectorSelect();
        locationCreate.locationSelect();
        anomalyCreate.anomalySelect();

        if(location.getName().equals("Болота") && anomaly.getName().equals("Трамплин")) {
            limit = 12;
        }

        // первый этап.
        if (character.getIntelligence() + character.getAnomalies() + dice.nextInt(10) > limit) {
            System.out.println("Персонаж успешно вошёл в аномальное поле.");
        } else System.out.println("Персонаж успешно вляпался в аномалию!");

        // второй этап.
        if (dice.nextInt(2) != 1) {
            System.out.println(character.getName() + ' ' + "не смог найти артефакт, поэтому уходит из аномалии.");
        } else System.out.println(character.getName() + ' ' + "смог найти артефакт!");

        // третий этап
        if (character.getIntelligence() + character.getAnomalies() + dice.nextInt(10) > limit - 3) {
            System.out.println("Персонаж успешно вышел из аномального поля!");
        } else System.out.println("Персонаж успешно вляпался в аномалию!");
    }
}
