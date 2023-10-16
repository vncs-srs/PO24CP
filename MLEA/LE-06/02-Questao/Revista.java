/*+-------------------------------------+

|           Revista                     |

+---------------------------------------+

| - nome: String                        |

| - numeroEdicao: int                   |

| - mes: int                            |

| - ano: int                            |

+---------------------------------------+

| + constructor(nome: String,    n      |

|                numeroEdicao:          |

|                int, mes: int,         |

|                ano: int)              |

+---------------------------------------+



+-----------------------------------------------+

|        PilhaDeRevistas                        |

+-----------------------------------------------+

| - revistas: Revista[50]                       |

| - tamanho: int                                |

+-----------------------------------------------+

| + adicionarRevista(r: Revista): void          |

| + removerRevista(): Revista                   |

| + estaCheia(): boolean                        |

+-----------------------------------------------+*/



class Revista {

    private String nome;

    private int numeroEdicao;

    private int mes;

    private int ano;



    public Revista(String nome, int numeroEdicao, int mes, int ano) {

        this.nome = nome;

        this.numeroEdicao = numeroEdicao;

        this.mes = mes;

        this.ano = ano;

    }

}



class PilhaDeRevistas {

    private Revista[] revistas;

    private int tamanho;



    public PilhaDeRevistas() {

        this.revistas = new Revista[50];

        this.tamanho = 0;

    }



    public void adicionarRevista(Revista r) {

        if (tamanho < 50) {

            revistas[tamanho] = r;

            tamanho++;

        } else {

            System.out.println("A pilha de revistas está cheia.");

        }

    }



    public Revista removerRevista() {

        if (tamanho > 0) {

            tamanho--;

            Revista removida = revistas[tamanho];

            revistas[tamanho] = null;

            return removida;

        } else {

            System.out.println("A pilha de revistas está vazia.");

            return null;

        }

    }



    public boolean estaCheia() {

        return tamanho == 50;

    }

}



