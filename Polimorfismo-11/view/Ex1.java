package view;
import model.ex1.*;

public class Ex1 {
    public static void main(String[] args) {
        Carro fiat = new Carro();
        Bicicleta monark = new Bicicleta();

        fiat.mover();
        monark.mover();
    }
}