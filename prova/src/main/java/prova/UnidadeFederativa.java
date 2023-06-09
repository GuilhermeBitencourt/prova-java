/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package prova;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
    BAHIA ("Bahia","BA"),
    SAO_PAULO ("São Paulo","SP"),
    RIO_DE_JANEIRO("Rio de janeiro", "RJ");
    
    protected String nome;
    protected String sigla;

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    
    
    
    
}
