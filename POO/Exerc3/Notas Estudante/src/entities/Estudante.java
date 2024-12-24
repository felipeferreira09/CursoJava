package entities;


public class Estudante {
public String nome;
public int nota1;
public int nota2;
public int nota3;


public int notaFinal() {
    return (nota1 + nota2 + nota3);
}

public int faltaFinal() {
    return (notaFinal() - 60);
}
}
