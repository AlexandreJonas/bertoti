public class Monitor implements Produto{
    public String nome;
    public double peso;
    
    public Monitor(String n, double p){
        this.nome = n;
        this.peso = p;
    }
    
    public double getPeso(){
        return this.peso;
    }
}
