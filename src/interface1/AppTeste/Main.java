package interface1.AppTeste;

import interface1.model.Quadrado;
import interface1.model.Triangulo;

public class Main
{
    public static void main(String[] args)
    {
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();

        quadrado.setLado(3);
        System.out.println("Perímetro do quadrado: " + quadrado.getPerimetro());
        System.out.println("Área do quadrado: " + quadrado.getArea());

        System.out.println("------------------------------------");

        triangulo.setLadoA(4);
        triangulo.setLadoB(3);
        triangulo.setLadoC(5);
        System.out.println("Perímetro do triângulo: " + triangulo.getPerimetro());
        System.out.println("Área do triangulo: " + triangulo.getArea());
    }
}
