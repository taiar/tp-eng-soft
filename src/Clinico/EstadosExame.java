package Clinico;

/**
 * Enumeração destinada a guardar o estado do exame.
 */
public enum EstadosExame {
    // O pedido de um exame foi feito e aguarda o laboratório.
    PedidoRealizado,

    // O exame foi realizado e enviado para a clínica.
    Recebido,

    // O exame se encontra arquivado na clínica.
    Arquivado,

    // O exame foi entregue ao paciente.
    EntregueAoPaciente;
}
