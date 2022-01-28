package fox.marcelo.desafiobootcamp;

import fox.marcelo.desafiobootcamp.domain.Bootcamp;
import fox.marcelo.desafiobootcamp.domain.Curso;
import fox.marcelo.desafiobootcamp.domain.Dev;
import fox.marcelo.desafiobootcamp.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Marcelo");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + dev1.getConteudosInscritos());

        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos Inscritos " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

    }
}
