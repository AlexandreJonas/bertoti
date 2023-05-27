/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciouml;

/**
 *
 * @author Fatec
 */
public class ExercicioUML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Disciplina d1, d2, d3;
        d1 = new Disciplina(0, 5);
        d2 = new Disciplina(1, 10);
        d3 = new Disciplina(2, 15);
        
        Curso c = new Curso(0, "ADS");
        c.addDisciplina(d1);
        c.addDisciplina(d2);
        c.addDisciplina(d3);
        System.out.println("----------------------");
        c.ExibeDisplinaCargoMaior();
        System.out.println("----------------------");
        System.out.println(c.calcularTotalHora());
        System.out.println("----------------------");
        c.imprimir();
        
        Escola e = new Escola("Fatec", "5 minutos depois do fim do mundo");
        e.addCurso(c);
        e.imprimir();
    }
    
}
