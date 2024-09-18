package prs.fltoshi.artfinderConsole.control;

import prs.fltoshi.artfinderConsole.entity.CharacterEntity;
import prs.fltoshi.artfinderConsole.entity.LocationEntity;
import prs.fltoshi.artfinderConsole.interfaces.Creator;

import java.util.Scanner;

public class LocationCreate implements Creator {
    LocationEntity location;

    public LocationCreate(LocationEntity location) {
        this.location = location;
    }

    @Override
    public void anythingCreator() {
        printMenu();
        chooseOption();
    }

    public void printMenu() {
        System.out.print("""
                 Выбери локацию из предствленных:
                 -=- Локации первого тира -=-
                 1) Болота
                 2) Кордон
                 3) Свалка
                 4) Тёмная лощина
                 5) Завод «Росток»
                                \s
                 -=- Локации второго тира -=-
                 6) Тёмная долина
                 7) Кладбище техники
                 8) Янтарь
                 9) Лес
                 10) Мёртвый город
                 11) Армейские склады
                                \s
                 -=- Локации третьего тира -=-
                 12) Затон
                 13) Радар
                 14) Рыжий лес
                 15) Лиманск
                 16) Верхние болота
                 17) Старая дорога
                 18) Госпиталь
                 19) Развилка
                 20) Окрестности «Юпитера»
                 21) Припять
                 22) Чернобыльская АЭС
                                \s
                 23) Подземное сооружение
                \s
                \s""");
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
                System.out.println("Выбрано: Болота");
                location.setName("Болота");
                location.setTier(1);
            }
            case 2 -> {
                System.out.println("Выбрано: Кордон");
                location.setName("Кордон");
                location.setTier(1);
            }
            case 3 -> {
                System.out.println("Выбрано: Свалка");
                location.setName("Свалка");
                location.setTier(1);
            }
            case 4 -> {
                System.out.println("Выбрано: Тёмная лощина");
                location.setName("Тёмная лощина");
                location.setTier(1);
            }
            case 5 -> {
                System.out.println("Выбрано: Завод «Росток»");
                location.setName("Завод «Росток»");
                location.setTier(1);
            }
            case 6 -> {
                System.out.println("Выбрано: Тёмная долина");
                location.setName("Тёмная долина");
                location.setTier(2);
            }
            case 7 -> {
                System.out.println("Выбрано: Кладбище техники");
                location.setName("Кладбище техники");
                location.setTier(2);
            }
            case 8 -> {
                System.out.println("Выбрано: Янтарь");
                location.setName("Янтарь");
                location.setTier(2);
            }
            case 9 -> {
                System.out.println("Выбрано: Лес");
                location.setName("Лес");
                location.setTier(2);
            }
            case 10 -> {
                System.out.println("Выбрано: Мёртвый город");
                location.setName("Мёртвый город");
                location.setTier(2);
            }
            case 11 -> {
                System.out.println("Выбрано: Армейские склады");
                location.setName("Армейские склады");
                location.setTier(2);
            }
            case 12 -> {
                System.out.println("Выбрано: Затон");
                location.setName("Затон");
                location.setTier(3);
            }
            case 13 -> {
                System.out.println("Выбрано: Радар");
                location.setName("Радар");
                location.setTier(3);
            }
            case 14 -> {
                System.out.println("Выбрано: Рыжий лес");
                location.setName("Рыжий лес");
                location.setTier(3);
            }
            case 15 -> {
                System.out.println("Выбрано: Лиманск");
                location.setName("Лиманск");
                location.setTier(3);
            }
            case 16 -> {
                System.out.println("Выбрано: Верхние болота");
                location.setName("Верхние болота");
                location.setTier(3);
            }
            case 17 -> {
                System.out.println("Выбрано: Старая дорога");
                location.setName("Старая дорога");
                location.setTier(3);
            }
            case 18 -> {
                System.out.println("Выбрано: Госпиталь");
                location.setName("Госпиталь");
                location.setTier(3);
            }
            case 19 -> {
                System.out.println("Выбрано: Развилка");
                location.setName("Развилка");
                location.setTier(3);
            }
            case 20 -> {
                System.out.println("Выбрано: Окресности «Юпитера»");
                location.setName("Окресности «Юпитера»");
                location.setTier(3);
            }
            case 21 -> {
                System.out.println("Выбрано: Припять");
                location.setName("Припять");
                location.setTier(3);
            }
            case 22 -> {
                System.out.println("Выбрано: ЧАЭС");
                location.setName("ЧАЭС");
                location.setTier(3);
            }
            case 23 -> {
                System.out.println("Выбрано: Подземное сооружение");
                location.setName("Подземное сооружение");
                location.setTier(4);
            }
            default ->
                    System.err.print("Я понимаю, список большой, но всё же, повторяю по-русски ещё раз: выбери из имеющихся.");
        }
    }
}