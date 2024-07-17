package prs.fltoshi.artfinderConsole.control;

import prs.fltoshi.artfinderConsole.entity.CharacterEntity;
import prs.fltoshi.artfinderConsole.entity.DetectorEntity;

import java.util.Scanner;

public class CharacterCreate {
    CharacterEntity character = new CharacterEntity();
    DetectorEntity detector = new DetectorEntity();

    boolean validInput = false;

    public void anomalyDetectorSelect() {
        System.out.print("""
                Выбери детектор аномалий из имеющихся:\s
                1) Нет
                2) ДА-2
                3) УДА-14а
                """);
        Scanner anomalyDetectorInputChecker = new Scanner(System.in);

        while (!validInput) {
            int input = anomalyDetectorInputChecker.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println("Выбрано: ничего");
                    validInput = true;
                }
                case 2 -> {
                    System.out.println("Выбран: ДА-2");
                    detector.setType("детектор аномалий");
                    detector.setName("ДА-2");
                    character.setAnomalies(+3);
//                System.out.println("Увеличиваю параметр 'Аномалии' на " + character.getArtifacts());
                    validInput = true;
                }
                case 3 -> {
                    System.out.println("Выбран: УДА-14а");
                    detector.setType("детектор аномалий");
                    detector.setName("УДА-14а");
                    character.setAnomalies(+5);
//                System.out.println("Увеличиваю параметр 'Аномалии' на " + character.getArtifacts());
                    validInput = true;
                }
                default -> System.out.print("Дурак что-ли? Написано же по-русски: выбери из имеющихся.");
            }
        }
        anomalyDetectorInputChecker.close();
        validInput = false;
    }

    public void artifactDetectorSelect() {
        System.out.print("""
                Выбери детектор артефактов из имеющихся:\s
                1) Нет
                2) Отклик
                3) Медведь
                4) Велес
                5) Сварог
                """);
        Scanner artifactDetectorInputChecker = new Scanner(System.in);
        while (!validInput) {
            int input = artifactDetectorInputChecker.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println("Выбрано: ничего");
                    validInput = true;
                }
                case 2 -> {
                    System.out.println("Выбран: Отклик");
                    detector.setType("детектор артефактов");
                    detector.setName("Отклик");
                    validInput = true;
                }
                case 3 -> {
                    System.out.println("Выбран: Медведь");
                    detector.setType("детектор артефактов");
                    detector.setName("Медведь");
                    validInput = true;

                }
                case 4 -> {
                    System.out.println("Выбран: Велес");
                    detector.setType("детектор артефактов");
                    detector.setName("Велес");
                    validInput = true;
                }
                case 5 -> {
                    System.out.println("Выбран: прототип Сварога");
                    detector.setType("детектор артефактов");
                    detector.setName("Сварог");
                    validInput = true;
                    character.setAnomalies(+5);
//                System.out.println("Увеличиваю параметр 'Аномалии' на " + character.getArtifacts());

                }
                default -> System.out.print("Дурак что-ли? Написано же по-русски: выбери из имеющихся.");
            }
        }
        artifactDetectorInputChecker.close();
        validInput = false;
    }

    public void characterCreation() {
        System.out.print("Приступаем к созданию персонажа." + "\n");
        anomalyDetectorSelect();
        artifactDetectorSelect();
    }
}