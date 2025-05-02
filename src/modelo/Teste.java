/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author vanessalagomachado
 */
public class Teste {
    public static void main(String[] args) {
        //Scanner sc = new Scanner();
        Pessoa p1 = new Pessoa();
        //p1.nome = "Juka";
        p1.setNome("Juka");
        
        System.out.println("Bem-vindo(a) "+p1.exibirDados());
        
        Pessoa p2 = new Pessoa("Maria", "123.132.132-99");
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        p2.setDataNascimento(LocalDate.parse("10/01/2008", formato));
        
        System.out.println("Bem-vindo(a) "+p2.exibirDados());    
        
        System.out.println("----");
        System.out.println(p1);
        System.out.println("----");
        
        AvaliacaoFisica a1 = new AvaliacaoFisica(p2);
        a1.setPeso(80);
        a1.setAltura(1.7);
        System.out.println(a1.exibirDados());
        
        
        AvaliacaoFisica a2 = new AvaliacaoFisica(p2);
        a2.setPeso(78);
        a2.setAltura(1.7);
        System.out.println(a2.exibirDados());
        
        p2.adicionarAvaliacao(a1);
        p2.adicionarAvaliacao(a2);
        
        System.out.println("Bem-vindo(a) "+p2.exibirDados());  
        System.out.println(p2.mostrarAvaliacoes());
        
        
    }
}
