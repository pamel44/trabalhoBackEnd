public class SistemaBarbearia {

    public static void main(String[] args) {

        Barbeiro barbeiro1 = new Barbeiro();
        barbeiro1.setNome("Pedro");
        barbeiro1.setEspecialidade("Corte masculino");

        Barbeiro barbeiro2 = new Barbeiro();
        barbeiro2.setNome("Kauan");
        barbeiro2.setEspecialidade("Barba");

        Barbeiro barbeiro3 = new Barbeiro();
        barbeiro3.setNome("Bryan");
        barbeiro3.setEspecialidade("Degrade");

        Barbeiro barbeiro4 = new Barbeiro();
        barbeiro4.setNome("Saymon");
        barbeiro4.setEspecialidade("Infantil");


        Cliente cliente1 = new Cliente();
        cliente1.setNome("Kauan Stipp");
        cliente1.setTelefone("43 99999999");
        cliente1.setCpf("777.777.777-99");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Pamela");
        cliente2.setTelefone("43 777777777");
        cliente2.setCpf("777.777.777-95");

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Andreia");
        cliente3.setTelefone("43 3333399");
        cliente3.setCpf("777.731.909-93");


        Agendamento agendamento1 = new Agendamento();

        agendamento1.setData("05/05/2026");
        agendamento1.setHorario("13:30");
        agendamento1.setCliente(cliente1);
        agendamento1.setBarbeiro(barbeiro1);


        Agendamento agendamento2 = new Agendamento();

        agendamento2.setData("13/09/2026");
        agendamento2.setHorario("15:30");
        agendamento2.setCliente(cliente2);
        agendamento2.setBarbeiro(barbeiro2);


        Agendamento agendamento3 = new Agendamento();

        agendamento3.setData("13/09/2026");
        agendamento3.setHorario("17:30");
        agendamento3.setCliente(cliente3);
        agendamento3.setBarbeiro(barbeiro3);


        agendamento1.finalizarAtendimento();

        agendamento2.cancelar();


        agendamento1.mostrarDados();

        agendamento2.mostrarDados();

        agendamento3.mostrarDados();


        System.out.println("\nTotal de agendamentos: "
                + Agendamento.getTotalAgendamentos());
    }
}