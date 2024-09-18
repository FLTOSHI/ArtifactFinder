package prs.fltoshi.artfinderConsole.control;

import prs.fltoshi.artfinderConsole.entity.CharacterEntity;

import java.util.Scanner;

public class CharacterCreate {

    private final AnomalyDetectorCreate anomalyDetector;
    private final ArtifactDetectorCreate artifactDetector;
    private final CharacterEntity character;

    public CharacterCreate(AnomalyDetectorCreate anomalyDetector, ArtifactDetectorCreate artifactDetector, CharacterEntity character) {
        this.anomalyDetector = anomalyDetector;
        this.artifactDetector = artifactDetector;
        this.character = character;
    }

    public void createCharacter() {
        Scanner characterParametersInput = new Scanner(System.in);
        System.out.print("Введи имя персонажа: ");
        character.setName(characterParametersInput.nextLine());
        System.out.print("Введи его характеристику 'Интеллект': ");
        character.setIntelligence(characterParametersInput.nextInt());
        System.out.print("Введи его параметр 'Аномалии': ");
        character.setAnomalies(characterParametersInput.nextInt());
        System.out.print("Введи его параметр 'Артефакты': ");
        character.setArtifacts(characterParametersInput.nextInt());
        anomalyDetector.anythingCreator();
        artifactDetector.anythingCreator();
    }
}