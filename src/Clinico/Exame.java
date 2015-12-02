package Clinico;

import Atores.Laboratorio;
import Atores.Medico;
import Atores.Paciente;

import java.util.Date;

public class Exame {

    // Paciente examinado.
    private Paciente paciente;

    // Médico quem requisitou o exame.
    private Medico requisitante;

    // Laboratório que efetuou o exame.
    private Laboratorio laboratorio;

    /**
     * Estado em que o exame se encontra.
     *
     * @see EstadosExame
     */
    private EstadosExame estado;

    // Data em que foi realizado o pedido do exame.
    private Date dataPedido;

    // Data em que o exame foi realizado.
    private Date dataRealizacao;

    // Data em que o exame foi recebido na clínica.
    private Date dataRecebimento;

    // Data em que o exame fora arquivado na clínica (caso tenha sido).
    private Date dataArquivamento;

    // Data em que o exame fora entregue ao paciente (caso tenha sido).
    private Date dataEntreguePaciente;

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

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Date getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(Date dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public Date getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(Date dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public Date getDataArquivamento() {
        return dataArquivamento;
    }

    public void setDataArquivamento(Date dataArquivamento) {
        this.dataArquivamento = dataArquivamento;
    }

    public Date getDataEntreguePaciente() {
        return dataEntreguePaciente;
    }

    public void setDataEntreguePaciente(Date dataEntreguePaciente) {
        this.dataEntreguePaciente = dataEntreguePaciente;
    }
}
