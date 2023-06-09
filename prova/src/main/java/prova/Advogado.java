/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Advogado extends Funcionario{
    private String oab;

    public Advogado(String oab, String cpf, String rg, String matricula, Setor setor, double salario, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, dataNascimento, genero, nome, telefone, email, endereco);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return "\nAdvogado" +
                super.toString() +
                "\nOAB: " + oab;
    }
    
    
    
    
}
