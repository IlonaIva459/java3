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
        int total = amount + replenish + bonus;

        System.out.println("Итого на счете: " + total);
        System.out.println("Начислено бонусов за пополнение: " + bonus);
    }
}