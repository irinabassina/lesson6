package ru.geekbrains.lesson6.srp2;

import ru.geekbrains.lesson6.srp1.SquareDrawer;

public class Program {

    /*
     * TO DO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        OrderReader orderReader = new OrderReader();
        Order order = orderReader.inputFromConsole();
        OrderSaver orderSaver = new OrderSaver(order);
        orderSaver.saveToJson();
    }

}
