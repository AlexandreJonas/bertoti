/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Conta {
    private static Conta instance;
    private double conta;
    
    private Conta(){
        this.conta = 0;
    }
    
    public static Conta getInstance()
    {
        if (instance == null)
        {
            instance = new Conta();
        }
        return instance;
    }
    
    public void setConta(double c)
    {
        this.conta = c;
    }
    
    public double getConta(){
        return this.conta;
    }
}
