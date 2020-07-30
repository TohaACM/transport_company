package by.teachmeskills.applications.utils;

import by.teachmeskills.entity.transport.TransportType;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        if (scanner.hasNext()) {
            int a = scanner.nextInt();
            scanner.nextLine();
            return a;
        }
        System.out.println(scanner.nextInt() + " Повторите ввод");
        return getInt();
    }

    public static int getInt(String message) {
        System.out.println(message);
        return getInt();
    }

    public static String getString() {
        return scanner.nextLine();
    }

    public static String getString(String message) {
        System.out.println(message);
        return getString();
    }

    public static Double getDouble() {
        if (scanner.hasNext()) {
            double a = scanner.nextDouble();
            return a;
        }
        System.out.println(scanner.nextDouble() + " - " + "неверные данные");
        return getDouble();
    }

    public static Double getDouble(String message) {
        System.out.println(message);
        return getDouble();
    }

    public static Boolean getBoolean() {
        System.out.println("1 - есть");
        System.out.println("2 - отсутствует");
        int a = scanner.nextInt();
        if (a == 1) {
            return true;
        } else if (a == 2) {
            return false;
        } else {
            System.out.println("Ещё раз");
        }
        return getBoolean();
    }

    public static Boolean getBoolean(String message) {
        System.out.println(message);
        return getBoolean();
    }

    public static TransportType getType(String message) {
        System.out.println("1 - Воздушный");
        System.out.println("2 - Наземный");
        System.out.println("3 - Водный");
        TransportType transportType = new TransportType();
        transportType.setId(getInt());
        return transportType;
    }
}

