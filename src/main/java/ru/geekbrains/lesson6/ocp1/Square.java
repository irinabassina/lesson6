package ru.geekbrains.lesson6.ocp1;

public class Square implements Shape {

    private int side;
    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

}
