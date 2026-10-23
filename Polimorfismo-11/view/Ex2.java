package view;
import model.ex2.*;

public class Ex2 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("================SOMA (2)================");
        calc.somar(1,1);
        calc.somar(2,3);
        System.out.println("================SOMA (3)================");
        calc.somar(3,2,2);
        calc.somar(2,3,2);
        calc.somar(2,2,3);
        System.out.println("================SOMA (D)================");
        calc.somar(1.5,4.5);
        calc.somar(2.5,3.5);
    }
}