package interface1.model;

public class Quadrado implements FiguraGeometrica
{
    // ATRIBUTOS:
    private int lado;

    // MÉTODOS A SEREM IMPLEMENTADOS:
    @Override
    public int getArea()
    {
        int area = 0;
        area = lado * lado;

        return area;
    }

    @Override
    public int getPerimetro()
    {
        int perimetro = 0;

        perimetro = lado * 4;
        return perimetro;
    }

    @Override
    public String getNomeFigura()
    {
        return "quadrado";
    }

    //GETTERS-SETTERS:
    public int getLado()
    {
        return lado;
    }

    public void setLado(int lado)
    {
        this.lado = lado;
    }

}
