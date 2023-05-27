/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciouml;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fatec
 */
public class Escola {
    private String nome;
    private String endereco;
    private List<Curso> listaCurso;
    
    public Escola(String nome, String addr)
    {
        this.nome = nome;
        this.endereco = addr;
        this.listaCurso = new ArrayList<Curso>();
    }
    
    public void addCurso(Curso c)
    {
        this.listaCurso.add(c);
    }
    
    public void exibeCursoCargaMaior()
    {
        int m = 0;
        for (int i = 0; i < listaCurso.size(); i++) {
            if (listaCurso.get(i).calcularTotalHora()> m)
            {
                m = listaCurso.get(i).calcularTotalHora();
            } 
        }
        System.out.print("Maior carga horária: ");
        System.out.println(m);
    }
    
    public void imprimir()
    {
        System.out.print("Nome da escola: ");
        System.out.println(this.nome);
        System.out.print("Endereço: ");
        System.out.println(this.endereco);
        System.out.println("Cursos:");
        for (int i = 0; i < listaCurso.size(); i++) {
           listaCurso.get(i).imprimir();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Curso> getListaCurso() {
        return listaCurso;
    }

    public void setListaCurso(List<Curso> listaCurso) {
        this.listaCurso = listaCurso;
    }
    
    
}
