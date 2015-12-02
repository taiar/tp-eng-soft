package Controladores;

import Controladores.Excessoes.AcessoNegadoException;
import Entidades.Atores.Laboratorio;
import Entidades.Atores.Medico;
import Entidades.Atores.Paciente;
import Entidades.Clinico.EstadosExame;
import Entidades.Clinico.Exame;

import java.nio.file.AccessDeniedException;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Classe que implementa ações no sistema relativas aos exames.
 */
public class ExamesController {

    /**
     * Registra um exame recebido de um laboratório, à pedido de um médico para um paciente na data atual.
     * @param paciente Paciente
     * @param medico Medico
     * @param laboratorio Laboratorio
     * @param estadoExame EstadosExame
     * @return Exame
     */
    public Exame registarExame(Paciente paciente, Medico medico, Laboratorio laboratorio, EstadosExame estadoExame) {
        Exame e = new Exame();
        e.setPaciente(paciente);
        e.setRequisitante(medico);
        e.setLaboratorio(laboratorio);
        e.setEstado(estadoExame);
        this.receberExame(e);
        return e;
    }

    /**
     * Recebe exame na data corrente.
     * @param exame Exame
     */
    public void receberExame(Exame exame) {
        exame.setEstado(EstadosExame.Recebido);
        exame.setDataRecebimento(new GregorianCalendar());
    }

    /**
     * Arquiva o exame na data corrente.
     * @param exame Exame
     */
    public void arquivarExame(Exame exame) {
        exame.setEstado(EstadosExame.Arquivado);
        exame.setDataArquivamento(new GregorianCalendar());
    }

    /**
     * Arquiva o exame em uma data definida.
     * @param exame Exame
     * @param calendario GregorianCalendar
     */
    public void arquivarExame(Exame exame, GregorianCalendar calendario) {
        exame.setEstado(EstadosExame.Arquivado);
        exame.setDataArquivamento(calendario);
    }

    /**
     * Entrega o exame ao paciente na data corrente.
     * @param exame Exame
     */
    public void entregarExameAoPaciente(Exame exame) {
        exame.setEstado(EstadosExame.EntregueAoPaciente);
        exame.setDataEntreguePaciente(new GregorianCalendar());
    }

    /**
     * Entrega o exame ao paciente em uma data definida.
     * @param exame Exame
     * @param calendario GregorianCalendar
     */
    public void entregarExameAoPaciente(Exame exame, GregorianCalendar calendario) {
        exame.setEstado(EstadosExame.EntregueAoPaciente);
        exame.setDataEntreguePaciente(calendario);
    }

    /**
     * Médico pode disponibilizar o exame de um paciente para consulta online.
     * @param exame Exame
     */
    public void dispobibilizaExameOnline(Exame exame) {
        exame.setDisponibilizadoOnLine(true);
    }

    /**
     * Paciente pode consultar um exame disponível online.
     * @param paciente Paciente
     * @param exame Exame
     * @param chaveFornecida String
     * @return Exame
     * @throws AcessoNegadoException
     */
    public Exame consultaExameOnLine(Paciente paciente, Exame exame, String chaveFornecida) throws AcessoNegadoException {
        if(exame.isDisponibilizadoOnLine()) {
            if(paciente.getChaveUnica().equals(chaveFornecida)) {
                return exame;
            } else {
                throw new AcessoNegadoException("A chave fornecida não corresponde.");
            }
        } else {
            throw new AcessoNegadoException("Este exame não está autorizado para visualização online");
        }
    }

}
