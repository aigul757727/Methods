public class Main {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - не високосный год");
        }
    }

    public static void checkPhone(int clientDeviceYear, int clientOS) {
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            System.out.println("Установите облегченную версию приложения для iOS по ссылкe");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void checkDelivery (int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней:" + deliveryTime);}
        else if (deliveryDistance>=20 && deliveryDistance<60) {
            deliveryTime= deliveryTime+1;
            System.out.println("Потребуется дней:" + deliveryTime);}
        else if (deliveryDistance>=60 && deliveryDistance<100) {
            deliveryTime= deliveryTime+2;
            System.out.println("Потребуется дней:" + deliveryTime);}
        else {System.out.println("Доставки нет");}
    }


    public static void task1() {
        System.out.println("Задача 1");
        checkYear(2021);
    }

    public static void task2() {
        System.out.println("Задача 2");
        checkPhone(2017, 0);
    }

    public static void task3() {
        System.out.println("Задача 3");
        checkDelivery(55);
    }
}