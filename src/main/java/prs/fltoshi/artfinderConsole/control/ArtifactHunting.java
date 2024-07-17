package prs.fltoshi.artfinderConsole.control;

import prs.fltoshi.artfinderConsole.entity.AnomalyEntity;
import prs.fltoshi.artfinderConsole.entity.CharacterEntity;

import java.util.Random;
import java.util.Scanner;

public class ArtifactHunting {

    CharacterEntity character = new CharacterEntity();
    AnomalyEntity anomaly = new AnomalyEntity();

    Random dice = new Random();

    private int limit = 15;
    Scanner scanner = new Scanner(System.in);

    public void anomalySelect() {
        System.out.println("Введите название аномалии, в которую лезёт" + character.getName());
        anomaly.setName(scanner.nextLine());
    }

    public void mainProcess() {

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
