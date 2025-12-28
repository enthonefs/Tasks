import java.time.LocalDateTime;

public class Tarefa {

    private final int id;
    private final String descricao;
    private final Prioridade prioridade;
    private Status status;
    private final LocalDateTime dataCriacao = LocalDateTime.now();

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public Tarefa(int id, String descricao, Prioridade prioridade, Status status) {
        this.id = id;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = status;

    }
}
