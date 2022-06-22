package ua.ithillel.java;

public class CreditCardTest {
    public static void main(String[] args) {

        CreditCard client = new CreditCard();
        client.cardNumber = "0325124754117589";
        client.owner = "бункерный дед"; //Мы же знаем о какам деде идет речь)
        client.type = "МИР";

        switch (client.type) {
            case "VISA":
            case "MASTERCARD":
                System.out.println("Уважаемый " + client.owner + " поздравляем, вы используете" +
                        " нормальную карту");
                break;
            case "МИР":
                System.out.println(client.owner + " пошел ты на х#у вместе со своим русским кораблем");
                break;
            default:
                System.out.println("Неизвестный тип карты: " + client.type);
                break;
        }
    }
}
