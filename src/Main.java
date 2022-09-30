public class Main {
    public static void main(String[] args) {

        int amountOnAccount = 30;    // сумма на счету
        int deposit = 1001;            // сумма поплнения
        int bonus;
        if (deposit > 1000) {
            bonus = (deposit / 100);
        } else {
            bonus = 0;
        }
        int finalAmount= (amountOnAccount + deposit + bonus);
        System.out.println("Начисленно бонусов - " + bonus);
        System.out.println("Итоговая сумма на счету - " + finalAmount);
    }
}
