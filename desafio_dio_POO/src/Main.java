import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
    
        Dev devLuan = new Dev();
        devLuan.setNome("Luan");
        devLuan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Luan: " + devLuan.getConteudosIncritos());
        System.out.println("Conteúdos concluídos Luan: " + devLuan.getConteudosConcluidos());
        devLuan.progredir();
        devLuan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Luan: " + devLuan.getConteudosIncritos());
        System.out.println("Conteúdos concluídos Luan: " + devLuan.getConteudosConcluidos());
        System.out.println("XP: " + devLuan.calcularTotalXp());

        
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosIncritos());
        System.out.println("Conteúdos concluídos Camila: " + devCamila.getConteudosConcluidos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosIncritos());
        System.out.println("Conteúdos concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
    }
}
