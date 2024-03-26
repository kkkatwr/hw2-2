public class Main {
    public static void main(String[] args) {

        int a = 200; //начальный баланс клиента
        int b = 1600; //сумма пополнения
        int d = a + b;

        if (b > 1000) {
            int f = b / 100;
            System.out.println("Начислено бонусов = " + (f) + ". Итоговая сумма с учетом бонусов на балансе = " + (d + f));
        } else {
            System.out.println("Начислено бонусов = 0 " + "Итоговая сумма на балансе = " + (d));
        }

    }
}
