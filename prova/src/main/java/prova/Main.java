/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        
        Medico medico = new Medico("12.45", "123.456.789.66", "15.123.546.12", "BA123", Setor.SAUDE, 12000, LocalDate.of(1995, Month.MARCH, 2), Genero.FEMININO, "Isabele", "(99)9999-1234", "isabele@gmail.com,", 
                new Endereco("Rua Pardas", "123", "Casa", "40750-987", "Salvador", UnidadeFederativa.BAHIA));
        Advogado advogado = new Advogado("123.456", "123.456.789.66", "15.123.006.12", "SP123", Setor.JURIDICO, 11000, LocalDate.of(2000, Month.DECEMBER, 6), Genero.MASCULINO, "Marcos", "(99)9999-1234", "marcos@gmail.com,", 
                new Endereco("Rua 4 de Abril", "999", "Casa", "40750-987", "São Paulo", UnidadeFederativa.SAO_PAULO));
        
        Motoboy motoboy = new Motoboy("123.465789", "000.406.009.66", "15.000.546.12", "BA999", Setor.OPERACOES, 12000, LocalDate.of(2003, Month.MAY, 2), Genero.MASCULINO, "Antonio", "(99)9999-1234", "antonio@gmail.com,", 
                new Endereco("Rua Gonzaga", "154", "Casa", "48888-987", "Camaçari", UnidadeFederativa.BAHIA));
        
        Cliente cliente = new Cliente(1, LocalDate.of(2003, Month.JULY, 18), Genero.MASCULINO, "Guilherme", "(71)9999-9999", "guilherme@gmail.com", 
                 new Endereco("Rua Pardas", "999", "Apartamento", "47788-999", "Salvador", UnidadeFederativa.BAHIA));
        
        Juridica juridica = new Juridica("123.456.789", "BA.456", "Uiran", "(71)9999-9999", "uiran@gmail.com", 
                 new Endereco("Rua Carlos", "555", "Apartamento", "17788-999", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println(medico.toString());
        System.out.println(advogado.toString());
        System.out.println(motoboy.toString());
        System.out.println(cliente.toString());
        System.out.println(juridica.toString());
        
    }
}
