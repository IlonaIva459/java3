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
        int itog = amount + replenish + bonus;

        System.out.println("Итого на счете: " + itog);
        System.out.println("Начислено бонусов за пополнение: " + bonus);
    }
}