package prs.fltoshi.artfinderConsole.control;

import prs.fltoshi.artfinderConsole.entity.CharacterEntity;

import java.util.Scanner;

public class CharacterCreate {
    boolean anomalyValidInput = false;
    boolean artValidInput = false;

    CharacterEntity character = new CharacterEntity();
    public void anomalyDetectorSelect() {
        Scanner anomalyDetectorInputChecker = new Scanner(System.in);

        System.out.print("""
                Выбери детектор аномалий из имеющихся:\s
                1) Нет
                2) ДА-2
                3) УДА-14а
                """);
        int anomalyInput = anomalyDetectorInputChecker.nextInt();
        while (!anomalyValidInput) {
            switch (anomalyInput) {
                case 1 -> {
                    System.out.println("Выбрано: ничего");
                    anomalyValidInput = true;
                }
                case 2 -> {
                    System.out.println("Выбран: ДА-2");
                    character.setAnomalies(character.getAnomalies()+3);
//                System.out.println("Увеличиваю параметр 'Аномалии' на " + character.getArtifacts());
                    anomalyValidInput = true;
                }
                case 3 -> {
                    System.out.println("Выбран: УДА-14а");
                    character.setAnomalies(character.getAnomalies()+5);
//                System.out.println("Увеличиваю параметр 'Аномалии' на " + character.getArtifacts());
                    anomalyValidInput = true;
                }
                default -> System.out.print("Дурак что-ли? Написано же по-русски: выбери из имеющихся.");
            }
        }
    }

    public void artifactDetectorSelect() {
        System.out.print("""
                Выбери детектор артефактов из имеющихся:\s
                1) Нет
                2) «Отклик»
                3) «Медведь»
                4) «Велес»
                5) «Сварог»
                   """);
        Scanner artifactInputChecker = new Scanner(System.in);
        int artifactInput = artifactInputChecker.nextInt();
        while (!artValidInput) {
            switch (artifactInput) {
                case 1 -> {
                    System.out.println("Выбрано: ничего");
                    artValidInput = true;
                }
                case 2 -> {
                    System.out.println("Выбран: Отклик");
                    artValidInput = true;
                    character.setTierOneAvailable(true);
                }
                case 3 -> {
                    System.out.println("Выбран: Медведь");
                    artValidInput = true;
                    character.setTierOneAvailable(true);
                    character.setTierTwoAvailable(true);
                }
                case 4 -> {
                    System.out.println("Выбран: Велес");
                    artValidInput = true;
                    character.setTierOneAvailable(true);
                    character.setTierTwoAvailable(true);
                    character.setTierThreeAvailable(true);
                }
                case 5 -> {
                    System.out.println("Выбран: прототип Сварога");

                    artValidInput = true;
                    character.setAnomalies(character.getAnomalies() + 5);
//                System.out.println("Увеличиваю параметр 'Аномалии' на " + character.getArtifacts());
                    character.setTierOneAvailable(true);
                    character.setTierTwoAvailable(true);
                    character.setTierThreeAvailable(true);
                }
                default -> System.out.print("Дурак что-ли? Написано же по-русски: выбери из имеющихся.");
            }
        }
    }


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
        anomalyDetectorSelect();
        artifactDetectorSelect();

        System.out.println("Получилась следующая ебака аномалий. Всё нормально? (мне похуй): ");
        System.out.print(character);
    }
}