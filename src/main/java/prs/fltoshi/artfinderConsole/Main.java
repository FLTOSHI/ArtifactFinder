package prs.fltoshi.artfinderConsole;

import prs.fltoshi.artfinderConsole.control.ArtifactHunting;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Система поиска артефактов для РП-проекта «Path of S.T.A.L.K.E.R». Автор - FLTOSHI#1337" + "\n"); // Неважно.
        ArtifactHunting art = new ArtifactHunting();
        Scanner menuSelectorScanner = new Scanner(System.in);
        byte input = 0;

        Menu.mainMenu(input);

        do {
            input = menuSelectorScanner.nextByte();

            switch (input) {
                case 1:
                    art.characterSelect();
                    break;

                case 2:
                    System.out.println("Механ слабачок. Хы-хы!");
                    break;

                case 3:
                    System.out.println("Арривидерчи!");
                    break;
            }
        } while (input != 3);
    }
}