package Clinico;

import Atores.Medico;
import Atores.Paciente;
import Atores.Recepcionista;
import Clinico.Prontuario.DadosProntuario;

import java.util.Date;

public class Consulta {

    // Recepcionista que marcou a consulta.
    private Recepcionista agendador;

    // Paciente que foi atendido na consulta.
    private Paciente atendido;

    // Médico quem realizou a consulta.
    private Medico atendente;

    // Flag indicando se a consulta realmente aconteceu
    // TODO mudar para um Enum?
    private Boolean aconteceu;

    // Data em que a consulta havia sido marcada.
    private Date dataMarcacao;

    // Dados do paciente nesta consulta.
    private DadosProntuario dados;

}
