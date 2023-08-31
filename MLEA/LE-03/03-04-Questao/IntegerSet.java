/*
Crie uma classe chamada  IntegerSet. Cada objeto IntegerSet pode armazenar inteiros no intervalo de 0 a 100.
O conjunto é representado por um array de booleans. O elemento de array a[i] é true se o inteiro i estiver 
no conjunto. O elemento do array a[j] é false se o inteiro j não estiver no conjunto. 

O construtor sem argumento inicializa o array Java como "conjunto vazio'' (isto é, um conjunto cuja representação 
de array contém todos os valores false).

Forneça os seguintes métodos:

O método union cria um terceiro conjunto que é a união teórica de dois conjuntos existentes (isto é, um elemento 
do terceiro array do conjunto é configurado como true se esse elemento for true em qualquer um dos conjuntos 
existentes ou em ambos; caso contrário, o elemento do terceiro conjunto é configurado como false).
O método intersection cria um terceiro conjunto que é a interseção teórica de dois conjuntos existentes (isto é, um 
elemento do array do terceiro conjunto é configurado como false se esse elemento for false em qualquer um ou em ambos 
os conjuntos existentes - caso contrário, o elemento do terceiro conjunto é configurado como true).
O método insertElement insere um novo inteiro k em um conjunto (configurando a[k] como true). 
O método deleteElement exclui o inteiro m (configurando a[m] como false). 
O método toSetString retorna uma string contendo um conjunto como uma lista de números separados por espaços. Inclua 
somente os elementos que estão presentes no conjunto. Utilize -- para representar um conjunto vazio. 
O método isEqualTo determina se dois conjuntos são iguais.
*/

public class IntegerSet{
    private boolean[] a;

    public IntegerSet(){
        a = new boolean[101];
    }
    public IntegerSet union(IntegerSet x){
        IntegerSet z = new IntegerSet();
        for(int i=0; i < 101; i++)
            if(a[i] == true || x.a[i] == true)
                z.a[i]=true;
            else
                z.a[i] = false;
        return z;
    }
    public IntegerSet intersection(IntegerSet y){
        IntegerSet z = new IntegerSet();
        for(int i=0; i < 101; i++)
            if(a[i] == true && y.a[i] == true)
                z.a[i]=true;
            else
                z.a[i] = false;
        return z;
    }
    public void insertElement(int k){
        a[k] = true;
    }
    public void deleteElement(int k){
        a[k] = false;
    } 
    public String toSetString(){
        String str = "";
        for(int i=0; i < 101; i++)
            if(a[i] == true)
                str = str + i + " ";
            
        if(str.equals(""))
            str = "--";
        return str;
    }
    public void isEqualTo(int c1,int c2){
        
    }
}