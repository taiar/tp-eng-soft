package Clinico;

import Atores.Laboratorio;
import Atores.Medico;
import Atores.Paciente;

import java.util.Date;

public class Exame {

    private Paciente paciente;
    private Medico requisitante;
    private Laboratorio laboratorio;
    private EstadosExame estado;

    // Data em que foi realizado o pedido do exame.
    private Date dataPedido;

    // Data em que o exame foi realizado.
    private Date dataRealizacao;

    // Data em que o exame foi armazenado na clinica.
    private Date dataRecebimento;

    private Date dataArquivamento;

    private Date dataEntreguePaciente;



}
