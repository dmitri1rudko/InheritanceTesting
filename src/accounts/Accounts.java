package accounts;

public class Accounts {

    private static int arraySize;
    private static Account[] accounts = new Account[arraySize];

    private static final class Account {
        private float money;
        private String name;

        public Account(String name, float money) {
            setName(name);
            setMoney(money);
        }

        public float getMoney() {
            return money;
        }

        private void setMoney(float money) {
            this.money = money;
        }

        public String getName() {
            return name;
        }

        private void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        createNewClient("Dmitrii", 300f);

        for (Account value : accounts) {
            float currentMoney = value.getMoney();
            currentMoney = currentMoney + currentMoney * 0.1f;
            value.setMoney(currentMoney);
        }

        for (Account value : accounts) {
            System.out.println("Name: " + value.getName() + " Money: " + value.getMoney());
        }
    }

    public static void createNewClient(String name, float money) {

    }
}

