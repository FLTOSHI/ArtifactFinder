package prs.fltoshi.artfinderConsole.control;

import prs.fltoshi.artfinderConsole.entity.AnomalyEntity;
import prs.fltoshi.artfinderConsole.entity.CharacterEntity;

import java.util.Random;
import java.util.Scanner;

public class ArtifactHunting {

    CharacterEntity person = new CharacterEntity();
    AnomalyEntity anomaly = new AnomalyEntity();

    Random dice = new Random(1L);

    private int porog = 15;
    Scanner scanner = new Scanner(System.in);

    public void characterSelect() {
        System.out.println("Отлично! Приступаем к созданию персонажа! \n -=-=-=-=-=-=-=-");
        System.out.println("Введите имя бедолаги: ");
        person.setName(scanner.nextLine());
        System.out.println("Введите показатель характеристики «Интеллект»: ");
        person.setIntelligence(scanner.nextInt());
        System.out.println("Введите показатель навыка «Аномалии»: ");
        person.setAnomalies(scanner.nextInt());
        System.out.println("Введите показатель навыка «Артефакты»: ");
        person.setArtifacts(scanner.nextInt());

        System.out.println("-=-=-=-=-=-=-=-");
        System.out.println("Получился следующий инвалид. Всё в порядке? (мне похуй)");
        System.out.println(person);
    }

    public void anomalySelect() {
        System.out.println("Введите название аномалии, в которую лезёт" + person.getName());
        anomaly.setName(scanner.nextLine());
    }

    public void mainProcess(){

        // первый этап.
        if(person.getIntelligence() + person.getAnomalies() + dice.nextInt(10) > porog) {
            System.out.println("Персонаж успешно вошёл в аномальное поле.");
        } else System.out.println("Персонаж успешно вляпался в аномалию!");

        // второй этап.
        if (dice.nextInt(2) != 1) {
            System.out.println(person.getName() + ' ' + "не смог найти артефакт, поэтому уходит из аномалии.");
        } else System.out.println(person.getName() + ' ' + "смог найти артефакт!");

        // третий этап
        if(person.getIntelligence() + person.getAnomalies() + dice.nextInt(10) > porog-3) {
            System.out.println("Персонаж успешно вышел из аномального поля!");
        } else System.out.println("Персонаж успешно вляпался в аномалию!");
    }
}
