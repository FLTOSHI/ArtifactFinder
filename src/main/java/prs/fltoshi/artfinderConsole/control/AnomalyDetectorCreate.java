package prs.fltoshi.artfinderConsole.control;

import prs.fltoshi.artfinderConsole.entity.CharacterEntity;
import prs.fltoshi.artfinderConsole.interfaces.Creator;

import java.awt.*;
import java.util.Scanner;

public class AnomalyDetectorCreate implements Creator {

    CharacterEntity character = new CharacterEntity();

    public AnomalyDetectorCreate(CharacterEntity character){
        this.character = character;
    }

    @Override
    public void anythingCreator() {
        printMenu();
        chooseOption();
    }

    private void printMenu() {
        System.out.printf("Выбери детектор аномалий из имеющихся:\n%n" +
                "1) Нет\n" +
                "2) ДА-2\n" +
                "3) УДА-14а\n" +
                "%n");
    }

    private void chooseOption() {
        Scanner scanner = new Scanner(System.in);
         int choice = scanner.nextInt();{
            switch (choice) {
                case 1:
                    System.out.println("Выбрано: ничего");
                    break;
                case 2:
                    System.out.println("Выбран: ДА-2");
                    character.setAnomalies(character.getAnomalies() + 3);
                    System.out.println("Увеличиваю параметр 'Аномалии' на 3 очка.");
                    break;
                case 3:
                    System.out.println("Выбран: УДА-14а");
                    character.setAnomalies(character.getAnomalies() + 5);
                    System.out.println("Увеличиваю параметр 'Аномалии' на 5 очков.");
                    break;
                default:
                    System.err.println("Дурак что-ли? Написано же по-русски: выбери из имеющихся.");
                    break;
            }
        }
    }
}