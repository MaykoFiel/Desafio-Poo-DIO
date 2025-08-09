import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso() {
            @Override
            public double calularXP() {
                return 0;
            }
        };
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso() {
            @Override
            public double calularXP() {
                return 0;
            }
        };

        curso2.setTitulo("Curso Java");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria() {
            @Override
            public double calularXP() {
                return 0;
            }
        };

        Conteudo conteudo = new Curso() {
            @Override
            public double calularXP() {
                return 0;
            }
        };
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("Descrição mentoria");
        mentoria.setData(LocalDate.now());

      /* System.out.println(curso1);
       System.out.println(curso2);
        System.out.println();*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devMayko = new Dev();
        devMayko.setName("Mayko");
        devMayko.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Mayko" + devMayko.getConteudosInscritos());
        devMayko.progredir();
        devMayko.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Mayko" + devMayko.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Mayko" + devMayko.getConteudosConcluidos());
        System.out.println("XP: " + devMayko.calcularTotalXp());


        System.out.println("-------------");

        Dev devMateus = new Dev();
        devMateus.setName("Mateus");
        devMateus.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Mateus" + devMateus.getConteudosInscritos());
        devMateus.progredir();
        devMateus.progredir();
        devMateus.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Mateus" + devMateus.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Mateus" + devMateus.getConteudosConcluidos());
        System.out.println("XP: " + devMateus.calcularTotalXp());




    }
}