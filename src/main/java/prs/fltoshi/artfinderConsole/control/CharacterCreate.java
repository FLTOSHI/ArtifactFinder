package prs.fltoshi.artfinderConsole.control;

import prs.fltoshi.artfinderConsole.entity.CharacterEntity;

import java.util.Scanner;

public class CharacterCreate {

    DetectorCreate detectorCreation = new DetectorCreate();
    CharacterEntity character = new CharacterEntity();

    public void characterSelect() {
        Scanner characterParametersInput = new Scanner(System.in);
        System.out.print("Введи имя персонажа: ");
        character.setName(characterParametersInput.nextLine());
        System.out.print("Введи его характеристику 'Интеллект': ");
        character.setIntelligence(characterParametersInput.nextInt());
        System.out.print("Введи его параметр 'Аномалии': ");
        character.setAnomalies(characterParametersInput.nextInt());
        System.out.print("Введи его параметр 'Артефакты': ");
        character.setArtifacts(characterParametersInput.nextInt());
    }

    public void characterCreation() {
        System.out.print("Приступаем к созданию персонажа." + "\n");
        characterSelect();
        detectorCreation.anomalyDetectorSelect();
        detectorCreation.artifactDetectorSelect();

        System.out.println("Получилась следующая ебака аномалий. Всё нормально? (мне похуй): ");
        System.out.print(character);
    }
}

// TODO: 20.07.2024 - разобраться, почему не присваиваются параметр "Аномалии"