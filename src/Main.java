public class Main {
    public static void main(String[] args) {

        int ticketPrice = 15_234;
        int rublesForBonusMiles = 20;
        int bonusMiles = ticketPrice / rublesForBonusMiles;

        System.out.println("Начислено бонусных миль за перелёты " + bonusMiles);

    }
}
        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран