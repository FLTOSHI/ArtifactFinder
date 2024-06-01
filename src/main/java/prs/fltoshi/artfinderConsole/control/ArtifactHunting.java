package prs.fltoshi.artfinderConsole.control;

import prs.fltoshi.artfinderConsole.entity.CharacterEntity;

import java.util.Scanner;

public class ArtifactHunting {

    CharacterEntity person = new CharacterEntity();
    Scanner scanner = new Scanner(System.in);

    public void characterSelect() {
        System.out.println("Отлично! Приступаем к созданию персонажа! \n -=-=-=-=-=-=-=-");
        System.out.println("Введите имя бедолаги: ");
        person.setName(scanner.nextLine());
        System.out.println("Введите показатель характеристики «Интеллект» бедолаги: ");
        person.setIntelligence(scanner.nextInt());
        System.out.println("Введите показатель навыка «Аномалии» бедолаги: ");
        person.setAnomalies(scanner.nextInt());
        System.out.println("Введите показатель навыка «Артефакты» бедолаги: ");
        person.setArtifacts(scanner.nextInt());

        System.out.println("Получился следующий инвалид. Всё в порядке?");
        System.out.println(person);
    }
}
