/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vanessalagomachado
 */
public class Aluno extends Pessoa{
    private String matricula;
    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();
    
    public void adicionarAvaliacao(AvaliacaoFisica avaliacao) {
        avaliacoes.add(avaliacao);
    }
    
    public String mostrarAvaliacoes(){
        String aux = "Histórico de Avaliações: \n";
        for(AvaliacaoFisica cadaAvaliacao: avaliacoes){
            aux += "->> "+ cadaAvaliacao+"\n";
        }
        return aux;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String exibirDados() {
        String aux = super.exibirDados();
        aux += "\nMatricula: "+matricula;
        aux += "\nAvaliações Físicas Realizadas: " 
                + avaliacoes.size() + "\n";
        return aux;
    }

    

    
    
    
    
    
    
}
