import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso1 js");
        curso1.setDescricao("descriçao cursos js");
        curso1.setCaragaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devMaycon = new Dev();
        devMaycon.setNome("Maycon");
        devMaycon.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo inscritos Maycon:" + devMaycon.getConteudosInscritos());
        devMaycon.progredir();
        System.out.println("-");
        System.out.println("Conteúdo inscritos Maycon:" + devMaycon.getConteudosInscritos());
        System.out.println("Conteúdo Concluidos Maycon:" + devMaycon.getConteudosConcluidos());
        System.out.println("XP:" + devMaycon.calcularTotalXp());
        System.out.println("-------");

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo inscritos Matheus:" + devMatheus.getConteudosInscritos());
        devMatheus.progredir();
        devMatheus.progredir();
        devMatheus.progredir();
        System.out.println("-");
        System.out.println("Conteúdo inscritos Matheus:" + devMatheus.getConteudosInscritos());
        System.out.println("Conteúdo Concluidos Matheus:" + devMatheus.getConteudosConcluidos());
        System.out.println("XP:" + devMatheus.calcularTotalXp());
    }
}