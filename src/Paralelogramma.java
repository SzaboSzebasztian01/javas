/*
 * File:Paralelogramma.java
 * Author:Szebasztián
 * Copyright:2023, Szebi:)
 * Group:SZOFT-I-1-N
 * Date:2023-02-06
 * Github:
 * Licenc: GNU GPL
 */

public class Paralelogramma {

    public double calcArea(double sideA, double sideB, double gamma){
        double rad = gamma * Math.PI / 180;
        double area = sideA * sideB * Math.sin(rad);
        return area;
    }
}