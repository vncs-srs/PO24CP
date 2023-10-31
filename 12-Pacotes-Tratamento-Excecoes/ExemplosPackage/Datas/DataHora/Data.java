package DataHora;

public class Data
{
  protected byte dia;
  byte mes;
  short ano;

  public Data(byte d,byte m,short a)
  {
    dia = d; mes = m; ano = a;
  }

  public String toString()
  {
    return dia+"/"+mes+"/"+ano;
  }

  } // fim da classe Data
