public class Agendamento {

    private String codigo;
    private String data;
    private String horario;
    private String statusAtendimento;

    private Cliente cliente;
    private Barbeiro barbeiro;

    private static int totalAgendamentos = 0;

    public Agendamento() {

        totalAgendamentos++;

        this.codigo = "" + totalAgendamentos;
        this.statusAtendimento = "Agendado";
    }

    public void cancelar() {

        if (statusAtendimento.equals("Finalizado")) {
            System.out.println("Nao pode cancelar atendimento finalizado");
        } else {
            statusAtendimento = "Cancelado";
        }
    }

    public void finalizarAtendimento() {

        if (statusAtendimento.equals("Cancelado")) {
            System.out.println("Nao pode finalizar atendimento cancelado");
        } else {
            statusAtendimento = "Finalizado";
        }
    }

    public void mostrarDados() {

        System.out.println("\nCodigo: " + codigo);
        System.out.println("Data: " + data);
        System.out.println("Horario: " + horario);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Barbeiro: " + barbeiro.getNome());
        System.out.println("Especialidade: " + barbeiro.getEspecialidade());
        System.out.println("Status: " + statusAtendimento);
    }

    public static int getTotalAgendamentos() {
        return totalAgendamentos;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getStatusAtendimento() {
        return statusAtendimento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Barbeiro getBarbeiro() {
        return barbeiro;
    }

    public void setBarbeiro(Barbeiro barbeiro) {
        this.barbeiro = barbeiro;
    }
}