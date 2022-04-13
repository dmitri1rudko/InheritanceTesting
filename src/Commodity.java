public class Commodity {

    public static void main(String[] args) {

        String command = "Покупка";
        int balance = 550;
        int quantity = 42;

        switch (command) {
            case "Покупка":
                quantity += 5;
                balance -= 20;
                break;
            case "Продажа":
                quantity -= 5;
                balance += 15;
        }

        System.out.println("Баланс: $" + balance + "\n" +
                "Количество: " + quantity);

    }

}
