package teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import modelo.Aluno;
import modelo.AlunoConvenio;
import modelo.AvaliacaoFisica;
import modelo.Convenio;
import modelo.Plano;
import modelo.Professor;

public class TesteHeranca {
    public static void main(String[] args) {
        Professor p = new Professor();
        p.setNome("Juka");
        p.setCpf("123.123.123-67");
        p.setEspecializacao("Musculação");
        
        //System.out.println(p.exibirDados());
        Plano plano = new Plano("Básico", "Direito a 4 horas por semana de academia", 295.00);
        Plano plano2 = new Plano("VIP", "Direito a 20 horas por semana de academia", 450.00);
        
        ///Aluno sem convênio 
        Aluno a1 = new Aluno();
        a1.setNome("Vivente");
        a1.setMatricula("123");
        DateTimeFormatter formato = 
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        a1.setDataNascimento(LocalDate.parse("10/01/2008", 
                formato));
        a1.setDatamatricula(LocalDate.parse("25/11/2024", 
                formato));
        a1.setPlano(plano);
        
        AvaliacaoFisica av1 = new AvaliacaoFisica(a1);
        a1.adicionarAvaliacao(av1);
        av1.setProfessor(p);
        
        System.out.println(a1.exibirDados());
        System.out.println("--------------");
        
        ///Aluno com convênio
        Convenio convenio = new Convenio("IFSUL", "Convênio dos alunos do IFSUL", 0.05);
        AlunoConvenio ac = new AlunoConvenio(convenio, LocalDate.parse("20/10/2024",
                formato));
        ac.setNome("Senhor");
        ac.setMatricula("055");
        ac.setDataNascimento(LocalDate.parse("15/04/2000",
                formato));
        ac.setPlano(plano2);
        
        AvaliacaoFisica av2 = new AvaliacaoFisica(ac);
        ac.adicionarAvaliacao(av2);
        
        System.out.println(ac.exibirDados());
        System.out.println("--------------");
    }
}

/*
  //Aluno sem direito ao desconto
        Aluno a2 = new Aluno();
        a2.setNome("Indivíduo");
        a2.setMatricula("254");
        
        a2.setDataNascimento(LocalDate.parse("25/06/2003",
                formato));
        a2.setDatamatricula(LocalDate.parse("11/05/2025", 
                formato));
        a2.setPlano(plano);
        
        AvaliacaoFisica av2 = new AvaliacaoFisica(a2);
        a2.adicionarAvaliacao(av2);
        av2.setProfessor(p);
        
        System.out.println(a2.exibirDados());

*/