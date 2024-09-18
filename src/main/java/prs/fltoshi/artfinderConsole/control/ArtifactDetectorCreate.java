package prs.fltoshi.artfinderConsole.control;

import prs.fltoshi.artfinderConsole.entity.CharacterEntity;
import prs.fltoshi.artfinderConsole.interfaces.Creator;

import java.util.Scanner;

public class ArtifactDetectorCreate implements Creator {
    CharacterEntity character = new CharacterEntity();

    public ArtifactDetectorCreate(CharacterEntity character){
        this.character = character;
    }

    @Override
    public void anythingCreator() {
        printMenu();
        chooseOption();
    }

    private void printMenu() {
        System.out.printf("Выбери детектор артефактов из имеющихся:\n%n" +
                "1) Нет\n" +
                "2) «Отклик»\n" +
                "3) «Медведь»\n" +
                "4) «Велес»\n" +
                "5) «Сварог»\n" +
                "%n");
    }

    private void chooseOption() {
        try (var input = new Scanner(System.in)) {
            var choice = input.nextInt();
            validateChoice(choice);
        } catch (Exception e) {
            System.err.println("Неправильно введено значение.");
        }
    }

    private void validateChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Выбрано: ничего");
                break;
            case 2:
                System.out.println("Выбран: Отклик");
                setTiersForChoice(2);
                break;
            case 3:
                System.out.println("Выбран: Медведь");
                setTiersForChoice(3);
                break;
            case 4:
                System.out.println("Выбран: Велес");
                setTiersForChoice(4);
                break;
            case 5:
                System.out.println("Выбран: прототип Сварога");
                addAnomaliesToChoice(5);
                setTiersForChoice(5);
                break;
            default:
                System.err.println("Дурак что-ли? Написано же по-русски: выбери из имеющихся.");
                break;
        }
    }

    private void setTiersForChoice(int choice) {
        switch (choice) {
            case 2:
                character.setTierOneAvailable(true);
                break;
            case 3:
                character.setTierOneAvailable(true);
                character.setTierTwoAvailable(true);
                break;
            case 4:
                character.setTierOneAvailable(true);
                character.setTierTwoAvailable(true);
                character.setTierThreeAvailable(true);
                break;
            case 5:
                character.setTierOneAvailable(true);
                character.setTierTwoAvailable(true);
                character.setTierThreeAvailable(true);
                break;
        }
    }

    private void addAnomaliesToChoice(int choice) {
        if (choice == 5) {
            int currentAnomalies = character.getAnomalies();
            character.setAnomalies(currentAnomalies + 5);
            System.out.println("Увеличиваю параметр 'Аномалии' на 5 очков.");
        }
    }
}