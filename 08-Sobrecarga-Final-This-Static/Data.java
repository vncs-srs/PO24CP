public class Data{
 private int dia, mes, ano;
 private String extenso;

 public void alterarData(int d){
    this.dia = d;
 }
 public void alterarData(int d, int m){
    this.dia = d; this.mes = m;
 }
 
 public void alterarData(int d, int m, int a){
    this.dia = d; this.mes = m; this.ano = a;
 }
 public int alterarData(int d, int m, char x ){
    this.dia = d; this.mes = m; //this.ano = a;
	return dia;
 }
 public Data clone(){
    return new Data();
 }
 
}
