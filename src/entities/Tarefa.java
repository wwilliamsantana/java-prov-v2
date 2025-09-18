package entities;

import java.time.LocalDate;

public class Tarefa {
    public String nome;
    public String descricao;

    public LocalDate created_at;
    public LocalDate completed_at;
    public Boolean isCompleted;


    @Override
    public String toString() {
        return "Tarefa{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", created_at=" + created_at +
                ", completed_at=" + completed_at +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
