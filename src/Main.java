public class Main {
    public static void main(String[] args) {
        // 1 Задача

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // 2 Задача

        int clientDeviceYear = 2015;

        if (clientDeviceYear >= 2015 && clientOS == 0) { // переменная clientOS взята из предыдущей задачи и при 0 - iOS, 1 - Android
            System.out.println("Приложение для iOS будет работать корректно");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Приложение для Android будет работать корректно");
        }

        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        // Задача 3

        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Год является високосным");
        } else {
            System.out.println(year + " Год не является високосным");
        }

        // Задача 4

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней :1");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней :2");
        }
        if (deliveryDistance > 60) {
            System.out.println("Потребуется дней :3");
        }

        // Задача 5

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " принадлежит к сезону осень");
                break;
        }
    }
}