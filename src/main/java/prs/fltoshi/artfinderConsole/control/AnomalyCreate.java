package prs.fltoshi.artfinderConsole.control;

import prs.fltoshi.artfinderConsole.entity.AnomalyEntity;
import prs.fltoshi.artfinderConsole.entity.CharacterEntity;

import java.util.Scanner;

public class AnomalyCreate {
    AnomalyEntity anomaly = new AnomalyEntity();
    CharacterEntity character = new CharacterEntity();

    private boolean anomalyValidInput = false;

    public void anomalySelect() {
        Scanner anomalyInputChecker = new Scanner(System.in);

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

        int anomalyInput = anomalyInputChecker.nextInt();

        while (!anomalyValidInput) {
            switch (anomalyInput) {
                case 1 -> {
                    System.out.println("Выбрано: Трамплин");
                    anomaly.setName("Трамплин");
                    anomaly.setType("Гравитационная");
                    anomalyValidInput = true;
                }
                case 2 -> {
                    System.out.println("Выбрано: Карусель");
                    anomaly.setName("Карусель");
                    anomaly.setType("Гравитационная");
                    anomalyValidInput = true;
                }
                case 3 -> {
                    System.out.println("Выбрано: Воронка");
                    anomaly.setName("Воронка");
                    anomaly.setType("Гравитационная");
                    anomalyValidInput = true;
                }
                case 4 -> {
                    System.out.println("Выбрано: Электра");
                    anomaly.setName("Электра");
                    anomaly.setType("Электрическая");
                    anomalyValidInput = true;
                }
                case 5 -> {
                    System.out.println("Выбрано: Жарка");
                    anomaly.setName("Жарка");
                    anomaly.setType("Огненная");
                    anomalyValidInput = true;
                }
                case 6 -> {
                    System.out.println("Выбрано: Кисель");
                    anomaly.setName("Кисель");
                    anomaly.setType("Кислотная");
                    anomalyValidInput = true;
                }
                case 7 -> {
                    System.out.println("Выбрано: Газировка");
                    anomaly.setName("Газировка");
                    anomaly.setType("Кислотная");
                    anomalyValidInput = true;
                }
                case 8 -> {
                    System.out.println("Выбрано: Кислотный туман");
                    anomaly.setName("Кислотный туман");
                    anomaly.setType("Кислотная");
                    anomalyValidInput = true;
                }
                case 9 -> {
                    System.out.println("Выбрано: Жгучий пух");
                    anomaly.setName("Жгучий пух");
                    anomaly.setType("Кислотная");
                    anomalyValidInput = true;
                }
                case 10 -> {
                    System.out.println("Выбрано: Архианомалия");
                    anomaly.setName("Архианомалия");
                    anomaly.setType("-");
                    anomalyValidInput = true;
                }
                default -> System.out.print("Дурак что-ли? Написано же по-русски: выбери из имеющихся.");
            }
        }
    }
}