import java.time.*;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.*;

public class Clock {

    public static void main(String[] args) {

        // ���������� ������� ����� � ����
        LocalDateTime now = LocalDateTime.now();
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        int minute = now.get(ChronoField.MINUTE_OF_DAY);
        int month = now.get(ChronoField.MONTH_OF_YEAR);
        int day = now.get(ChronoField.DAY_OF_MONTH);
        int year = now.get(ChronoField.YEAR);

        // ������� �����������
        if (hour < 12) {
            System.out.println("������ ����!\n");
        } else if (hour < 17) {
            System.out.println("������ ����!\n");
        } else {
            System.out.println("������ �����!\n");
        }

        // ������ �������������� ������, ������������ �����
        System.out.println("������ ");

        // ������� �����
        System.out.println(hour);
        System.out.println((hour != 1 & hour != 21) ? " ���� (�����)" : " ���");

        // ������� �����
        if (minute != 0) {
            System.out.println(minute);
            System.out.println( (minute != 1 & minute != 21 & minute != 31
                                & minute != 41 & minute != 51) ? " ������ (�����)" :
                                " ������");
        }

        // ����������� ����� ������
        System.out.println("\n" + day + " ");

        // �������� ������
        switch (month) {
            case 1:
                System.out.println("������");
                break;
            case 2:
                System.out.println("�������");
                break;
            case 3:
                System.out.println("�����");
                break;
            case 4:
                System.out.println("������");
                break;
            case 5:
                System.out.println("���");
                break;
            case 6:
                System.out.println("����");
                break;
            case 7:
                System.out.println("����");
                break;
            case 8:
                System.out.println("�������");
                break;
            case 9:
                System.out.println("��������");
                break;
            case 10:
                System.out.println("�������");
                break;
            case 11:
                System.out.println("������");
                break;
            case 12:
                System.out.println("�������");
                break;
        }

        // ����������� ����
        System.out.println(" ," + year);

    }

}
