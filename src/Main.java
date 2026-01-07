
public class Main {
    public static void main(String[] args) {
        Gerenciador tarefas = new Gerenciador();
        tarefas.adicionarTarefa(1,"Estudar", Prioridade.ALTA, Status.PENDENTE);
        tarefas.adicionarTarefa(2,"Treinar", Prioridade.MEDIA, Status.PENDENTE );
        tarefas.adicionarTarefa(3,"Ler", Prioridade.BAIXA, Status.CONCLUIDA);
        tarefas.adicionarTarefa(4,"Programar", Prioridade.ALTA, Status.PENDENTE);
        tarefas.adicionarTarefa(5, "Organizar", Prioridade.ALTA, Status.CONCLUIDA);
        tarefas.removerPorId(1);
        tarefas.listarTarefas();




    }
}