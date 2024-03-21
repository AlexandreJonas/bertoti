public class Notebook implements Produto{
    public String nome;
    public double peso;
    
    public Notebook(String n, double p){
        this.nome = n;
        this.peso = p;
    }
    
    public double getPeso(){
        return this.peso;
    }
}
