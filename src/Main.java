public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        int deposit = 2200;
        int bonus;

        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }

        System.out.println(("Итоговый счет: " + (startBalance + deposit) + "\nБонусные рубли: " + bonus));
    }
}
