public class ArryDePontos2D // declaracao da classe 
 { 
   private Pontos2D[] array; // o array encapsulado 
  
   public ArryDePonto2(int numero) 
   { array = new Pontos2D[numero]; // alocamos memoria para o array encapsulado 
   } 
   public int tamanho() 
   { return array.length; 
   } 
   public void modifica(int posicao,Pontos2D valor) 
   { if ((posicao >= 0) && (posicao < array.length)) 
               array[posicao] = valor; 
   } 
   public Ponto2D valor(int posicao) 
   { if ((posicao >= 0) && (posicao < array.length)) 
        return array[posicao]; 
     else return null; 
   }
  public String toString() { 
    String resultado = "O array tem "+array.length+" elementos:\n"; 
    for(int c=0; c < array.length;c++) 
        resultado += array[c]+" "; 
    return resultado; 
  } 
  
 } // fim da classe ArrayDeFloats
