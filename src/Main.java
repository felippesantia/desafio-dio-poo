import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Python");
        curso2.setDescricao("descrição curso Python");
        curso2.setCargaHoraria(7);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFelippe = new Dev();
        devFelippe.setNome("Felippe");
        devFelippe.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de Felippe" + devFelippe.getConteudosInscritos());
        devFelippe.progredir();
        System.out.println("Conteudos Concluidos de Felippe" + devFelippe.getConteudosConcluidos());
        System.out.println("XP:" + devFelippe.calcularTotalXp());

        System.out.println("--------------------------------------------------");



        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteudos Concluidos de Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("---------------------------------------------------");






    }
}
