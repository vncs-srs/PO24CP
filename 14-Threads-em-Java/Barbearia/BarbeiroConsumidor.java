public class BarbeiroConsumidor extends Thread{

    private Barbearia ca;
    private int totalDeClientesQueIreiAtender;


    public BarbeiroConsumidor(Barbearia c, int tot){
        this.ca = c;
        this.totalDeClientesQueIreiAtender = tot;
    }

    public void run(){
        // ao atingir o limite, o barbeiro vai pra casa e nao atende mais ninguém
        while(totalDeClientesQueIreiAtender > 0){
            try {
                System.out.println("Barbeiro dormindo...\n" );
                // Barbeiro dormindo por 5 segundos
                Thread.sleep((int) (5000));
                
            } catch (InterruptedException e) {
                System.err.println(e.toString());
            }
            ca.cortaCabelo();
            totalDeClientesQueIreiAtender--;
        }
        System.out.println("\n\nBarbeiro foi pra casa, chega de trabalho por hoje.\n");
    }
}
