public class Main {
    public static void main(String[] args) {

        int StartBalance = 200; //начальный баланс клиента
        int RefillSum = 1600; //сумма пополнения
        int TotalBalance = StartBalance + RefillSum;

        if (RefillSum > 1000) {
            int Bonus = RefillSum / 100;
            System.out.println("Начислено бонусов = " + (Bonus) + ". Итоговая сумма с учетом бонусов на балансе = " + (TotalBalance + Bonus));
        } else {
            System.out.println("Начислено бонусов = 0 " + "Итоговая сумма на балансе = " + (TotalBalance));
        }

    }
}
