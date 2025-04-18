import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Address russiaMoscow = new Address("Россия", "Москва");
        Address russiaRostov = new Address("Россия", "Ростов");
        Address polandWarsaw = new Address("Польша", "Варшава");

        Map<Address, Integer> costPerAddress = new HashMap();

        costPerAddress.put(russiaMoscow, 240);
        costPerAddress.put(russiaRostov, 310);
        costPerAddress.put(polandWarsaw, 670);

        int totalCost = 0;

        while (true) {
            System.out.println("Заполнение нового заказа.");
            System.out.print("Введите страну: ");
            String inputCountry = scan.next();
            if (inputCountry.equals("end")) {
                System.out.println("Программа завершена!");
                break;
            }
            System.out.print("Введите город: ");
            String inputCity = scan.next();
            if (inputCity.equals("end")) {
                System.out.println("Программа завершена!");
                break;
            }
            System.out.print("Введите вес (кг): ");
            String inputWeight = scan.next();
            if (inputWeight.equals("end")) {
                System.out.println("Программа завершена!");
                break;
            }
            Address userAddress = new Address(inputCountry, inputCity);

            Integer cost = costPerAddress.get(userAddress);
            if (cost != null) {
                int deliveryCost = cost * Integer.parseInt(inputWeight);
                System.out.println("Стоимость доставки составит: " + deliveryCost);
                totalCost += deliveryCost;
                System.out.println("Общая сумма доставок: " + totalCost);
            } else {
                System.out.println("Доставка в указанный адрес недоступна.");
            }


        }

    }
}