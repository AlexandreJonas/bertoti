public class Chefe {
    private Ataque ataque;
    
    public void setAtaque(Ataque atk){
        this.ataque = atk;
    }
    
    public void atacar(double x, double y){
        this.ataque.atacar(x, y);
    }
}
