import java.time.*;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.*;

public class Clock {

    public static void main(String[] args) {

        // Определить текущее время и дату
        LocalDateTime now = LocalDateTime.now();
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        int minute = now.get(ChronoField.MINUTE_OF_DAY);
        int month = now.get(ChronoField.MONTH_OF_YEAR);
        int day = now.get(ChronoField.DAY_OF_MONTH);
        int year = now.get(ChronoField.YEAR);

        // Вывести приветствие
        if (hour < 12) {
            System.out.println("Доброе утро!\n");
        } else if (hour < 17) {
            System.out.println("Добрый день!\n");
        } else {
            System.out.println("Добрый вечер!\n");
        }

        // Начало форматирования строки, отображаемой время
        System.out.println("Сейчас ");

        // Сколько часов
        System.out.println(hour);
        System.out.println((hour != 1 & hour != 21) ? " часа (часов)" : " час");

        // Сколько минут
        if (minute != 0) {
            System.out.println(minute);
            System.out.println( (minute != 1 & minute != 21 & minute != 31
                                & minute != 41 & minute != 51) ? " минуты (минут)" :
                                " минута");
        }

        // Отображение числа месяца
        System.out.println("\n" + day + " ");

        // Название месяца
        switch (month) {
            case 1:
                System.out.println("января");
                break;
            case 2:
                System.out.println("февраля");
                break;
            case 3:
                System.out.println("марта");
                break;
            case 4:
                System.out.println("апреля");
                break;
            case 5:
                System.out.println("мая");
                break;
            case 6:
                System.out.println("июня");
                break;
            case 7:
                System.out.println("июля");
                break;
            case 8:
                System.out.println("августа");
                break;
            case 9:
                System.out.println("сентября");
                break;
            case 10:
                System.out.println("октября");
                break;
            case 11:
                System.out.println("ноября");
                break;
            case 12:
                System.out.println("декабря");
                break;
        }

        // Отображения года
        System.out.println(" ," + year);

    }

}
