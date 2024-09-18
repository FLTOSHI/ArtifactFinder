package prs.fltoshi.artfinderConsole.control;

import prs.fltoshi.artfinderConsole.entity.AnomalyEntity;
import prs.fltoshi.artfinderConsole.entity.CharacterEntity;
import prs.fltoshi.artfinderConsole.interfaces.Creator;

import java.util.Scanner;

public class AnomalyCreate implements Creator {
    CharacterEntity character = new CharacterEntity();
    AnomalyEntity anomaly = new AnomalyEntity();

    @Override
    public void anythingCreator() {
        printMenu();
        chooseOption();
    }

    public void printMenu() {
        System.out.println("Выбери аномалию, в которую лезет " + character.getName() + ": ");
        System.out.print("""
                из имеющихся:\s
                1) Трамплин
                2) Карусель
                3) Воронка
                4) Электра
                5) Жарка
                6) Кисель
                7) Газировка
                8) Кислотный туман
                9) Жгучий пух
                10) Архианомалия
                """);
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
            case 1 -> {
                System.out.println("Выбрано: Трамплин");
                anomaly.setName("Трамплин");
                anomaly.setType("Гравитационная");
            }
            case 2 -> {
                System.out.println("Выбрано: Карусель");
                anomaly.setName("Карусель");
                anomaly.setType("Гравитационная");
            }
            case 3 -> {
                System.out.println("Выбрано: Воронка");
                anomaly.setName("Воронка");
                anomaly.setType("Гравитационная");
            }
            case 4 -> {
                System.out.println("Выбрано: Электра");
                anomaly.setName("Электра");
                anomaly.setType("Электрическая");
            }
            case 5 -> {
                System.out.println("Выбрано: Жарка");
                anomaly.setName("Жарка");
                anomaly.setType("Огненная");
            }
            case 6 -> {
                System.out.println("Выбрано: Кисель");
                anomaly.setName("Кисель");
                anomaly.setType("Кислотная");
            }
            case 7 -> {
                System.out.println("Выбрано: Газировка");
                anomaly.setName("Газировка");
                anomaly.setType("Кислотная");
            }
            case 8 -> {
                System.out.println("Выбрано: Кислотный туман");
                anomaly.setName("Кислотный туман");
                anomaly.setType("Кислотная");
            }
            case 9 -> {
                System.out.println("Выбрано: Жгучий пух");
                anomaly.setName("Жгучий пух");
                anomaly.setType("Кислотная");
            }
            case 10 -> {
                System.out.println("Выбрано: Архианомалия");
                anomaly.setName("Архианомалия");
                anomaly.setType("-");
            }
            default -> System.out.print("Дурак что-ли? Написано же по-русски: выбери из имеющихся.");
        }
    }
}