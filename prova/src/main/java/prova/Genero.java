/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package prova;

/**
 *
 * @author Aluno
 */
public enum Genero {
    MASCULINO ('M',"Masculino"),
    FEMININO ('F', "Feminino");
    
    protected char caractere;
    protected String texto;

    private Genero(char caractere, String texto) {
        this.caractere = caractere;
        this.texto = texto;
    }

    public char getCaractere() {
        return caractere;
    }

    public String getTexto() {
        return texto;
    }
    
    
    
    
    
}
