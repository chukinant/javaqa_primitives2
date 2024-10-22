public class Main {
    public static void main(String[] args) {
        System.out.println("Программа к задаче 2:");

        // Объявление переменной начального счёта
        int clientAccount = 500;
        // Объявление переменной суммы пополнения
        int addingToAccount = 1200;
        // Объявление переменной количества рублей для одного бонуса
        int earningThreshold = 100;


        // Проверка условным оператором, превысила ли сумма пополнения порог
        if (addingToAccount < 1000) {
            // Сумма бонуса при сумме ниже порога
            int bonus = 0;
            clientAccount = clientAccount + addingToAccount;
            // Вывод на экран сообщения о текущей сумме на счету и количеством добавленных бонусов
            System.out.println("You have " + clientAccount + " roubles on your account (" + bonus + " bonuses were added)");
        }
        // Расчет суммы бонуса при превышении порога
        else {
            int bonus = addingToAccount / earningThreshold;
            clientAccount = clientAccount + addingToAccount + bonus;
            // Вывод на экран сообщения о текущей сумме на счету и количеством добавленных бонусов
            System.out.println("You have " + clientAccount + " roubles on your account (" + bonus + " bonuses were added)");
        }
    }
}