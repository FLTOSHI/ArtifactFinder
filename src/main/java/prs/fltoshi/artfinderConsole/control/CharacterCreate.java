package prs.fltoshi.artfinderConsole.control;

import prs.fltoshi.artfinderConsole.entity.CharacterEntity;
import prs.fltoshi.artfinderConsole.entity.DetectorEntity;

import java.util.Scanner;

public class CharacterCreate {
    CharacterEntity character = new CharacterEntity();
    DetectorEntity detector = new DetectorEntity();

    public void detectorSelect() {
        System.out.print("""
                Выбери детектор аномалий из имеющихся:\s
                1) Нет
                2) ДА-2
                3) УДА-14а
                """);
        Scanner inputChecker = new Scanner(System.in);
        int input = inputChecker.nextInt();
        switch (input) {
            case 1 -> System.out.println("Выбрано: ничего");
            case 2 -> {
                System.out.println("Выбран: ДА-2");
                detector.setType("детектор аномалий");
                detector.setName("ДА-2");
                character.setArtifacts(+3);
//                System.out.println("Увеличиваю параметр 'Аномалии' на " + character.getArtifacts());
            }
            case 3 -> {
                System.out.println("Выбран: УДА-14а");
                detector.setType("детектор аномалий");
                detector.setName("УДА-14а");
                character.setArtifacts(+5);
//                System.out.println("Увеличиваю параметр 'Аномалии' на " + character.getArtifacts());
            }
        }
        if (input != 1 || input != 2 || input != 3)
            System.out.print("Долбаёб? Написано по-русски: выбери из имеющихся.");
    }

    public void characterCreation() {
        System.out.print("Приступаем к созданию персонажа." + "\n");
        detectorSelect();
    }
}