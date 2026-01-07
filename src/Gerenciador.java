import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Gerenciador {
    List<Tarefa> list = new ArrayList<>();

    public void adicionarTarefa(int id, String descricao, Prioridade prioridade, Status status){
        Tarefa tarefa = new Tarefa(id, descricao, prioridade, status);
        list.add(tarefa);

    }

    public void listarTarefas(){
        for (Tarefa tarefa : list){
            System.out.printf("ID: %d\n", tarefa.getId());
            System.out.printf("Descrição: %s\n", tarefa.getDescricao());
            System.out.println("Prioridade: " + tarefa.getPrioridade());
            System.out.println("Status: " + tarefa.getStatus());
            System.out.println("Data: " + tarefa.getDataCriacao());
            System.out.println("=======================");
        }
    }

    public void filtrarPorStatus(Status status){
        for (Tarefa tarefa : list){
            if (tarefa.getStatus() == status){
                System.out.printf("ID: %d\n", tarefa.getId());
                System.out.printf("Descrição: %s\n", tarefa.getDescricao());
                System.out.println("Prioridade: " + tarefa.getPrioridade());
                System.out.println("Status: " + tarefa.getStatus());
                System.out.println("Data: " + tarefa.getDataCriacao());
                System.out.println("=======================");

            }
        }
    }

    public void filtrarPorPrioridade(Prioridade prioridade){
        for (Tarefa tarefa : list){
            if (tarefa.getPrioridade() == prioridade){
                System.out.printf("ID: %d\n", tarefa.getId());
                System.out.printf("Descrição: %s\n", tarefa.getDescricao());
                System.out.println("Prioridade: " + tarefa.getPrioridade());
                System.out.println("Status: " + tarefa.getStatus());
                System.out.println("Data: " + tarefa.getDataCriacao());
                System.out.println("=======================");
            }
        }


    }

    public void ordenarPorPrioridade(){
        list.stream()
                .sorted(Comparator.comparing(Tarefa::getPrioridade))
                .forEach(tarefa -> {
                    System.out.printf("ID: %d\n", tarefa.getId());
                    System.out.printf("Descrição: %s\n", tarefa.getDescricao());
                    System.out.println("Prioridade: " + tarefa.getPrioridade());
                    System.out.println("=======================");
                });


    }

    public void removerPorId(int id){
        if (list.isEmpty()) return;
        list.removeIf(tarefa -> tarefa.getId() == id);
        System.out.println("Tarefa removida com sucesso!");
    }

    public void concluirTarefa(int id){
        for (Tarefa tarefa : list){
            if (tarefa.getId() == id){
                tarefa.setStatus(Status.CONCLUIDA);
            }
        }
    }
}
