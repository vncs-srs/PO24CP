//Escreva um modelo de classe para representar uma lâmpada que está a venda em um supermercado.

//Nome da classe/objeto
public class Lampada
{
    // atributos

    private double Potencia;
    private String Marca;
    private String Modelo;
    private float Preco;
    
    // metodos

    public void vendaLampada(double Potencia,String Marca, String Modelo, float Preco)
    {
        Potencia = 15;
        Marca = "Generica";
        Modelo = "Led";
        Preco = 14;
    }

}