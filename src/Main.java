public class Main {
    public static void main(String[] args) {

        int amount = 100;
        int replenish = 1100;

        int bonus;
        if (replenish > 1000) {
            bonus = replenish / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Сумма пополнения: " + replenish);

        System.out.println("Итого бонусов за пополнение: " + bonus);
    }
}