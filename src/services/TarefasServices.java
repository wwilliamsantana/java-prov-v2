package services;

import entities.Tarefa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TarefasServices {


    public void AdicionarTarefa(Scanner scan, ArrayList<Tarefa> tarefas){

        System.out.println("Digite o nome do tarefa: ");
        var  name = scan.nextLine();

        System.out.println("Digite a descrição do tarefa: ");
        var description = scan.nextLine();

        var tarefa = new Tarefa();
        tarefa.nome = name;
        tarefa.descricao = description;
        tarefa.created_at = LocalDate.now();
        tarefa.isCompleted = false;
        tarefa.completed_at = null;

        tarefas.add(tarefa);

        System.out.println("Tarefa adicionada com sucesso!");


    }

    public void ListarTarefas(ArrayList<Tarefa> tarefas){
        System.out.println("------------------------------");
        System.out.println("Listagem de tarefas");

        var index = 1;

        for (var tarefa : tarefas){

            System.out.println(index + " - " + tarefa);
            index++;
        }
        System.out.println("------------------------------");
    }

    public void CompletarTarefa(Scanner scan, ArrayList<Tarefa> tarefas){
        System.out.println("--------------------------");

        System.out.println("Qual tarefa você deseja completar");
        var option = scan.nextInt();

        var tarefa = tarefas.get(option -1);

        tarefa.completed_at = LocalDate.now();
        tarefa.isCompleted = true;


        System.out.println("Tarefa completada com sucesso!");

    }

    public void ApagarTarefa(Scanner scan, ArrayList<Tarefa> tarefas){
        System.out.println("-----------------------------");
        System.out.println("Informe o número da tarefa que deseja apagar: ");
        var option = scan.nextInt();

        tarefas.remove(option -1);

        System.out.println("Tarefa apagada com sucesso!");
    }

}


