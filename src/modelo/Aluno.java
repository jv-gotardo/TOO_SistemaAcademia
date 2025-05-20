
package modelo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
    private String matricula;
    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();
    private LocalDate datamatricula;
    private Plano plano;
    private double valormensalidade;
    
    public Aluno(LocalDate datamatricula){
        this.datamatricula = datamatricula;
    }
    
    public Aluno(){
        
    }
    
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

    public LocalDate getDatamatricula() {
        return datamatricula;
    }

    public void setDatamatricula(LocalDate datamatricula) {
        this.datamatricula = datamatricula;
    }

    public double getValormensalidade() {
        return valormensalidade;
    }

    public void setValormensalidade(double valormensalidade) {
        this.valormensalidade = valormensalidade;
    }

    public Plano getPlano() {
        return plano;
    }

    public double setPlano(Plano plano) {
        this.plano = plano;
        setValormensalidade(plano.getValor());
        verificaDesconto(getDatamatricula());
        return getValormensalidade();
    }
    
    public double verificaDesconto(LocalDate data_Matricula){
        Period p = Period.between(datamatricula, LocalDate.now());
        if(p.getMonths() >= 3){
            setValormensalidade(getValormensalidade() - (getValormensalidade() * 0.1));
        }else{
            setValormensalidade(getValormensalidade());
        }
        return getValormensalidade();
    }

    @Override
    public String exibirDados() {
        String aux = super.exibirDados();
        aux += "\nMatricula: "+matricula;
        aux += "\nPlano: "+plano.getNome();
        aux += "\nValor da Mensalidade: R$"+valormensalidade;
        aux += "\nAvaliações Físicas Realizadas: " 
                + avaliacoes.size() + "\n";
        return aux;
    }

    

    
    
    
    
    
    
}
