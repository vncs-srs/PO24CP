/*Esta classe precisa das classes que estao no pacote DataHora*/
import DataHora.*;
/*A classe DemoDataHora demonstra usos de instancias das classes que fazem parte do pacote DataHora. Esta classe declara, inicializa e usa algumas instancias das classes Data, Hora e DataHora, mas tenta acessar campos destas classes que so podem ser acessados por classes do mesmo pacote.
 ESTA CLASSE NaO PODE SER COMPILADA POR CAUSA DE ERROS INTENCIONAIS. */
class DemoDataHora
{
  public static void main(String[] argumentos)
    {
    // Criamos uma instancia da classe Hora
    Hora meiodia = new Hora((byte)12,(byte)00,(byte)00);
    // Criamos uma instancia da classe Data
    Data hoje  = new Data((byte)11,(byte)5,(short)2001);
    // Criamos uma instancia da classe DataHora
    DataHora agora = new DataHora((byte)22,(byte)35,(byte)00,
                                  (byte)11,(byte)5,(short)2001);
    // Imprimimos as instancias atraves de chamadas implicitas aos metodos toString
    System.out.println(meiodia);
    System.out.println(hoje);
    System.out.println(agora);
    // Tentamos mudar os campos das classes, que nao foram declarados como private,
    // mesmo assim causando erros pois a classe DemoDataHora nao pertence ao mesmo
    // pacote que as classes Data, Hora e DataHora.
    meiodia.segundo = 17;
    hoje.mes = 2;
    DataHora.estaData.ano = 1969;
    } // fim do metodo main
} // fim da classe DemoDataHora
