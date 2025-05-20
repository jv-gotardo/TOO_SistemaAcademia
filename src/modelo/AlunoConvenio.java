/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author jvito
 */
public class AlunoConvenio extends Aluno {
    private Convenio convenio;

    public AlunoConvenio(Convenio convenio, LocalDate datamatricula){
        super(datamatricula);
        this.convenio = convenio;
    }
    
    public Convenio getConvenio() {
        return convenio;
    }
    
    @Override
    public double setPlano(Plano plano){
        double vinicial = super.setPlano(plano);
        return vinicial - (vinicial * getConvenio().getValor());
    }
    
    @Override 
    public String exibirDados(){
        String aux = super.exibirDados();
        aux += "\nConvênio: "+getConvenio().getNome()+" - "+(getConvenio().getValor()*100) + "%";
        return aux;
    }
}
