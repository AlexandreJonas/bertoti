/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fatec
 */
public class Curso {
    private int numero;
    private String nome;
    private List<Disciplina> lista;
    
    public Curso(int n, String c)
    {
        this.numero = n;
        this.nome = c;
        this.lista = new ArrayList<Disciplina>();
    }
    
    public void addDisciplina(Disciplina d)
    {
        this.lista.add(d);
    }
    
    public void imprimir()
    {
        System.out.print("Número: ");
        System.out.println(this.numero);
        System.out.print("Nome: ");
        System.out.println(this.nome);
        System.out.println("Itens:");
        for (int i = 0; i < lista.size(); i++) {
           lista.get(i).imprimir();
        }
    }
    
     public void ExibeDisplinaCargoMaior()
    {
        int m = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCargahoraria() > m)
            {
                m = lista.get(i).getCargahoraria();
            } 
        }
        System.out.print("Maior carga horária: ");
        System.out.println(m);
    }
     
     
    public int calcularTotalHora()
    {
        int s = 0;
        for (int i = 0; i < lista.size(); i++) {
            s += lista.get(i).getCargahoraria();
        }
        return s;
    }
    
}
