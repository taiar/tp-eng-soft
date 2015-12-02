package Clinico;

import Atores.Medico;
import Atores.Paciente;
import Atores.Recepcionista;
import Clinico.Prontuario.DadosProntuario;

import java.util.Date;

public class Consulta {

    private Recepcionista agendador;
    private Paciente atendido;
    private Medico atendente;

    private Boolean aconteceu;

    private Date dataMarcacao;

    private DadosProntuario dados;

}
