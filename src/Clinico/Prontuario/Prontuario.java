package Clinico.Prontuario;

import Atores.Paciente;
import Clinico.Consulta;

import java.util.List;

/**
 * Esta classe trata de todos os históricos de um paciente. A cada consulta são registrados todos os dados que podem
 * existir em um prontuário médico e tais dados são colecionados e reunidos nesta classe.
 */
public class Prontuario {

    // Paciente ao qua o prontuário pertence.
    private Paciente paciente;

    // Todos os registros de consulta deste paciente.
    private List<Consulta> consultas;

}
