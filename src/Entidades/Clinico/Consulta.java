package Entidades.Clinico;

import Entidades.Atores.Medico;
import Entidades.Atores.Paciente;
import Entidades.Atores.Recepcionista;
import Entidades.Clinico.Prontuario.DadosProntuario;

import java.util.Date;
import java.util.GregorianCalendar;

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
    private GregorianCalendar dataMarcacao;

    // Dados do paciente nesta consulta.
    private DadosProntuario dados;

    public Recepcionista getAgendador() {
        return agendador;
    }

    public void setAgendador(Recepcionista agendador) {
        this.agendador = agendador;
    }

    public Paciente getAtendido() {
        return atendido;
    }

    public void setAtendido(Paciente atendido) {
        this.atendido = atendido;
    }

    public Medico getAtendente() {
        return atendente;
    }

    public void setAtendente(Medico atendente) {
        this.atendente = atendente;
    }

    public Boolean isAconteceu() {
        return aconteceu;
    }

    public void setAconteceu(Boolean aconteceu) {
        this.aconteceu = aconteceu;
    }

    public GregorianCalendar getDataMarcacao() {
        return dataMarcacao;
    }

    public void setDataMarcacao(GregorianCalendar dataMarcacao) {
        this.dataMarcacao = dataMarcacao;
    }

    public DadosProntuario getDados() {
        return dados;
    }

    public void setDados(DadosProntuario dados) {
        this.dados = dados;
    }
}
