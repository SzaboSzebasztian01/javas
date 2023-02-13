/*
 * File:MainConsole.java
 * Author:Szebasztián
 * Copyright:2023, Szebi:)
 * Group:SZOFT-I-1-N
 * Date:2023-02-06
 * Github:
 * Licenc: GNU GPL
 */

import java.util.Scanner;

public class MainConsole {

    public MainConsole() {
        about();
        task();
        Doit();
    }
    private void task(){
        System.out.println("Feladat 0251 meg.");
        System.out.println("Paralelogramma");
    }
    private void about(){
        System.out.println("Szabó Szebasztián");
        System.out.println("Szoft I-1-N");
        System.out.println("2023.01.06.");
    }
    private String input(String msg){
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        scanner.close();
        return value;
    }
    private void Doit(){
        String strsideA = input("A oldal:");
        String strsideB = input("B oldal:");
        String strgamma = input("Gamma:");

        double sideA = Double.parseDouble(strsideA);
        double sideB = Double.parseDouble(strsideB);
        double gamma = Double.parseDouble(strgamma);

        Paralelogramma para = new Paralelogramma();
        double area = para.calcArea(sideA, sideB, gamma);
        System.out.printf("%.2f\n", area);
    }
}
