package teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import modelo.Aluno;
import modelo.AvaliacaoFisica;
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
        
        ///Aluno com direito ao desconto
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
    }
}
