package Entidades.Clinico;

import Entidades.Atores.Laboratorio;
import Entidades.Atores.Medico;
import Entidades.Atores.Paciente;

import java.util.Date;
import java.util.GregorianCalendar;

public class Exame {

    // Paciente examinado.
    private Paciente paciente;

    // Médico quem requisitou o exame.
    private Medico requisitante;

    // Laboratório que efetuou o exame.
    private Laboratorio laboratorio;

    // Médico pode decidir se o exame pode ser disponibilizado online para paciente.
    private Boolean disponibilizadoOnLine;

    /**
     * Estado em que o exame se encontra.
     * @see EstadosExame
     */
    private EstadosExame estado;

    // Data em que foi realizado o pedido do exame.
    private GregorianCalendar dataPedido;

    // Data em que o exame foi realizado.
    private GregorianCalendar dataRealizacao;

    // Data em que o exame foi recebido na clínica.
    private GregorianCalendar dataRecebimento;

    // Data em que o exame fora arquivado na clínica (caso tenha sido).
    private GregorianCalendar dataArquivamento;

    // Data em que o exame fora entregue ao paciente (caso tenha sido).
    private GregorianCalendar dataEntreguePaciente;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getRequisitante() {
        return requisitante;
    }

    public void setRequisitante(Medico requisitante) {
        this.requisitante = requisitante;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public EstadosExame getEstado() {
        return estado;
    }

    public void setEstado(EstadosExame estado) {
        this.estado = estado;
    }

    public GregorianCalendar getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(GregorianCalendar dataPedido) {
        this.dataPedido = dataPedido;
    }

    public GregorianCalendar getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(GregorianCalendar dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public GregorianCalendar getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(GregorianCalendar dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public GregorianCalendar getDataArquivamento() {
        return dataArquivamento;
    }

    public void setDataArquivamento(GregorianCalendar dataArquivamento) {
        this.dataArquivamento = dataArquivamento;
    }

    public GregorianCalendar getDataEntreguePaciente() {
        return dataEntreguePaciente;
    }

    public void setDataEntreguePaciente(GregorianCalendar dataEntreguePaciente) {
        this.dataEntreguePaciente = dataEntreguePaciente;
    }

    public Boolean isDisponibilizadoOnLine() {
        return disponibilizadoOnLine;
    }

    public void setDisponibilizadoOnLine(Boolean disponibilizadoOnLine) {
        this.disponibilizadoOnLine = disponibilizadoOnLine;
    }
}
