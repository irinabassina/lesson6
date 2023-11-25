package ru.geekbrains.lesson6.ocp1;

public class SquareV2 implements ShapeV2{

    private int side; // Длина стороны квадрата
    public SquareV2(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

}
