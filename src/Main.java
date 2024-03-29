public class Main {
    public static void main(String[] args) {

        int startBalance = 200; //начальный баланс клиента
        int refillSum = 1600; //сумма пополнения
        int totalBalance = startBalance + refillSum;

        if (refillSum > 1000) {
            int bonus = refillSum / 100;
            System.out.println("Начислено бонусов = " + (bonus) + ". Итоговая сумма с учетом бонусов на балансе = " + (totalBalance + bonus));
        } else {
            System.out.println("Начислено бонусов = 0 " + "Итоговая сумма на балансе = " + (totalBalance));
        }

    }
}
