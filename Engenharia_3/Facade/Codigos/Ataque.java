public class Ataque {
    private int dano;
    private int direcao;
    private Posicao P;
    
    public void atacar(Posicao P,int dano, int direcao ){
        Posicao C = new Posicao();
        int dist = new Distancia().calcularDistancia(P, C);
        new Animacao().animar(dist);
        new Movimento().mover(P, C);
    }
    
}
