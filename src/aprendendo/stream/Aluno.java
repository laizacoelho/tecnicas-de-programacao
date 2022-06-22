package aprendendo.stream;

public class Aluno {
    private String name;
    private double nota;
    private char genero;

    public Aluno(String name, double nota, char genero) {
        this.name = name;
        this.nota = nota;
        this.genero = genero;
    }

    public String getName() {
        return name;
    }

    public double getNota() {
        return nota;
    }

    public char getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                ", nota=" + nota +
                ", genero=" + genero +
                '}';
    }
}
