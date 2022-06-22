package aprendendo.stream;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Ana", 9.5, 'F');
        Aluno aluno02 = new Aluno("Bia", 4.75, 'F');
        Aluno aluno03 = new Aluno("João", 8, 'M');
        Aluno aluno04 = new Aluno("Carlos", 9.5, 'M');
        Aluno aluno05 = new Aluno("Nina", 7.75, 'F');
        Aluno aluno06 = new Aluno("José", 5.25, 'M');
        Aluno aluno07 = new Aluno("Mara", 10, 'F');
        Aluno aluno08 = new Aluno("Paulo", 5.5, 'M');
        Aluno aluno09 = new Aluno("Carlos", 8.5, 'M');
        Aluno aluno10 = new Aluno("Carla", 8, 'F');

        List<Aluno> alunos = new ArrayList<>(List.of(
                aluno01,
                aluno02,
                aluno03,
                aluno04,
                aluno05,
                aluno06,
                aluno07,
                aluno08,
                aluno09,
                aluno10
        ));

        //Implementar com streams como imprimir as alunas da lista
        Stream<Aluno> alunas = alunos.stream();
        alunas
                .filter(aluno -> aluno.getGenero() == 'F')
                .forEach(System.out::println);

        //Implementar com streams como passar as alunas para uma lista
        List<Aluno> alunas2 = alunos.stream()
                .filter(aluno -> aluno.getGenero() == 'F')
                .collect(Collectors.toList());

        //Crie um método e utilize streams para somar todas notas de cada gênero
        //Crie um método e utilize streams para calcular a média das notas de cada gênero
        DoubleSummaryStatistics notasAlunas = alunos.stream()
                .filter(aluno -> aluno.getGenero() == 'F')
                .mapToDouble(Aluno::getNota)
                .summaryStatistics();

        double somaNotaAlunas = notasAlunas.getSum();
        double mediaNotaAlunas = notasAlunas.getAverage();
        System.out.println("A soma das notas das alunas é " + somaNotaAlunas);
        System.out.println("A média das notas das alunas é " + mediaNotaAlunas);


        DoubleSummaryStatistics notasAlunos = alunos.stream()
                .filter(aluno -> aluno.getGenero() == 'M')
                .mapToDouble(Aluno::getNota)
                .summaryStatistics();

        double somaNotaAlunos = notasAlunos.getSum();
        double mediaNotaAlunos = notasAlunos.getAverage();
        System.out.println("A soma das notas dos alunos é " + somaNotaAlunos);
        System.out.println("A média das notas dos alunos é " + mediaNotaAlunos);

        //Crie um metodo que filtre todos os alunos de cada genero que foram reprovados (reprovado: nota menor que 6)
        System.out.println("Alunas reprovadas:");
        final double NOTA_MIN_AAPROVACAO = 6;
        Stream<Aluno> reprovadas = alunos.stream();
        reprovadas
                .filter(aluno -> aluno.getGenero() == 'F' && aluno.getNota() < NOTA_MIN_AAPROVACAO)
                .forEach(System.out::println);

        System.out.println("Alunos reprovados:");
        Stream<Aluno> reprovados = alunos.stream();
        reprovados
                .filter(aluno -> aluno.getGenero() == 'M' && aluno.getNota() < NOTA_MIN_AAPROVACAO)
                .forEach(System.out::println);
    }
}