package entities;

import java.time.LocalDate;

public class Tarefa {
    public int id;
    public String nome;
    public Boolean isCompleted;

    public LocalDate created_at;
    public LocalDate completed_at;

    @Override
    public String toString() {
        var isCompletedText = isCompleted ? "[X] " : "[] ";

        return  isCompletedText + id + " -  " + nome;
    }
}

