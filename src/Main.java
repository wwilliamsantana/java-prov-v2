import entities.Tarefa;
import services.TarefasServices;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);
        var tarefas = new ArrayList<Tarefa>();
        var tarefasService = new TarefasServices();

        while(true){
            System.out.println("""
                        1 - Adicionar tarefa
                        2 - Listar tarefas
                        3 - Completar uma tarefa
                        4 - Apagar uma tarefa
                        5 - Sair
                    """);

            var option = scan.nextInt();
            scan.nextLine();

            switch (option){
                case 1 -> tarefasService.AdicionarTarefa(scan, tarefas);
                case 2 -> tarefasService.ListarTarefas(tarefas);
                case 3 -> tarefasService.CompletarTarefa(scan, tarefas);
                case 4 -> tarefasService.ApagarTarefa(scan, tarefas);
                case 5 -> System.exit(0);
                default -> System.out.println("Entrada inválida");
            }



        }





    }
}