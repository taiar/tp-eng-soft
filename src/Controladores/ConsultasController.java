package Controladores;

import Entidades.Atores.Medico;
import Entidades.Atores.Paciente;
import Entidades.Atores.Recepcionista;
import Entidades.Clinico.Consulta;

import java.util.GregorianCalendar;

public class ConsultasController {

    public Consulta criarConsulta(Recepcionista agendador, Medico atendente, Paciente paciente, GregorianCalendar marcacao) {
        Consulta consulta = new Consulta();

        consulta.setAconteceu(false);
        consulta.setAgendador(agendador);
        consulta.setAtendente(atendente);
        consulta.setAtendido(paciente);
        consulta.setDataMarcacao(marcacao);

        return consulta;
    }

    public Consulta atenderConsulta(Consulta consulta) {
        consulta.setAconteceu(true);

        return consulta;
    }
}
