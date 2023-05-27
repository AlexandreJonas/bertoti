/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciouml;

/**
 *
 * @author Fatec
 */
public class Disciplina {
    private int codigo;
    private int cargahoraria;
    
    public Disciplina (int c, int h)
    {
        this.codigo = c;
        this.cargahoraria = h;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }
    
    public void imprimir()
    {
        System.out.print("Código: ");
        System.out.println(this.codigo);
        System.out.print("Carga Horária: ");
        System.out.println(this.cargahoraria);
    }
}
