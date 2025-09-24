package services;

import entities.Tarefa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TarefasServices {

    public int index = 1;

    public void AdicionarTarefa(Scanner scan, ArrayList<Tarefa> tarefas){
        var tarefa = new Tarefa();

        while(true){
            System.out.println("Digite o nome do tarefa para adicionar:");
            var nomeTarefa =  scan.nextLine();

            if(nomeTarefa.trim().isEmpty()){
                System.out.println("Informe um nome válido!");
            }else{
                tarefa.nome = nomeTarefa;
                tarefa.isCompleted = false;
                tarefa.created_at = LocalDate.now();
                tarefa.id = index;

                index++;

                tarefas.add(tarefa);

                System.out.println("Tarefa adicionado com sucesso!");
                break;
            }
        }



    }

    public void ListarTarefas(ArrayList<Tarefa> tarefas){
        System.out.println("-----------------------");
        System.out.println("Listagem de tarefas: ");

        for (var tarefa : tarefas) {
            System.out.println(tarefa);
        }
        System.out.println("-----------------------");


    }

    public void MarcarTarefa(Scanner scan, ArrayList<Tarefa> tarefas){
        ListarTarefas(tarefas);

        System.out.println("Digite qual tarefa deseja marcar como concluida?");
        var option = scan.nextInt();

        var tamanhoList  = tarefas.size();

        if(option <=  tamanhoList) {
            var tarefa = tarefas.get(option - 1);

            if (!tarefa.isCompleted) {
                tarefa.isCompleted = true;
                tarefa.completed_at = LocalDate.now();
                System.out.println("Tarefa marcada como concluida!");
            } else {
                System.out.println("Tarefa já está concluida!");
            }
        }else {
            System.out.println("Valor invalido!");
        }
    }

    public void DesmarcarTarefa(Scanner scan, ArrayList<Tarefa> tarefas){
        ListarTarefas(tarefas);

        System.out.println("Digite qual tarefa deseja desmarcar?");
        var option = scan.nextInt();

        var tamanhoList  = tarefas.size();

        if(option <=  tamanhoList) {
            var tarefa = tarefas.get(option - 1);

            if (tarefa.isCompleted) {
                tarefa.isCompleted = false;
                tarefa.completed_at = null;
                System.out.println("Tarefa desmarcada com sucesso!");
            } else {
                System.out.println("Tarefa já está desmarcada!");
            }
        }else {
            System.out.println("Valor invalido!");
        }
    }

    public void RemoveTarefa(Scanner scan, ArrayList<Tarefa> tarefas){
        ListarTarefas(tarefas);

        System.out.println("Digite a opção da tarefa que deseja remover:");
        var optionRemove = scan.nextInt();

        tarefas.remove(optionRemove - 1);

        System.out.println("Tarefa removido com sucesso!");

    }

}
