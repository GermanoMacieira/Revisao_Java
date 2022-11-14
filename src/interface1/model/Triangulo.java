package interface1.model;

public class Triangulo implements FiguraGeometrica
{
    // ATRIBUTOS:

    private int ladoA;
    private int ladoB;
    private int ladoC;

    // MÉTODOS A SEREM IMPLEMENTADOS:
    @Override
    public String getNomeFigura()
    {
        return "Triangulo";
    }

    @Override
    public int getArea()
    {
        int area = 0;
        area = (ladoA * ladoB) / 2;
        return area;
    }

    @Override
    public int getPerimetro()
    {
        int perimetro = 0;
        perimetro = ladoA + ladoB + ladoC;

        return perimetro;
    }

    //GETTERS-SETTERS:
    public int getAltura()
    {
        return ladoA;
    }

    public void setAltura(int altura)
    {
        this.ladoA = altura;
    }

    public int getBase()
    {
        return ladoB;
    }

    public void setBase(int base)
    {
        this.ladoB = base;
    }

    public int getLadoA()
    {
        return ladoA;
    }

    public void setLadoA(int ladoA)
    {
        this.ladoA = ladoA;
    }

    public int getLadoB()
    {
        return ladoB;
    }

    public void setLadoB(int ladoB)
    {
        this.ladoB = ladoB;
    }

    public int getLadoC()
    {
        return ladoC;
    }

    public void setLadoC(int ladoC)
    {
        this.ladoC = ladoC;
    }

}
