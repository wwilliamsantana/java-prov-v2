import entities.Tarefa;
import services.TarefasServices;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);
        var tarefasArr = new ArrayList<Tarefa>();
        var tarefasServices = new TarefasServices();

        while(true){
            System.out.println("""
                           1 - Adicionar tarefa
                           2 - Listar tarefas
                           3 - Marcar tarefa Concluida
                           4 - Desmarcar tarefa Concluida
                           5 - Remover tarefa
                           6 - Sair
                    """);
            var option = scan.nextInt();
            scan.nextLine();

            switch (option){
                case 1 -> tarefasServices.AdicionarTarefa(scan, tarefasArr);
                case 2 -> tarefasServices.ListarTarefas(tarefasArr);
                case 3 -> tarefasServices.MarcarTarefa(scan, tarefasArr);
                case 4 -> tarefasServices.DesmarcarTarefa(scan, tarefasArr);
                case 5 -> tarefasServices.RemoveTarefa(scan, tarefasArr);
                case 6 -> System.exit(0);
                default -> System.out.println("Opção invalida");
            }
        }
    }
}