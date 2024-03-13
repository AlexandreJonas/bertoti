/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manhã
 */
public class Chefe {
    private Ataque ataque;
    
    public void setAtaque(Ataque atk){
        this.ataque = atk;
    }
    
    public void atacar(double x, double y){
        this.ataque.atacar(x, y);
    }
}
