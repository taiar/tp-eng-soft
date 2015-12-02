package Entidades.Clinico.Prontuario;

import Entidades.Atores.Paciente;
import Entidades.Clinico.Consulta;

import java.util.ArrayList;
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

    public Prontuario() {
        this.consultas = new ArrayList<Consulta>();
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void addConsulta(Consulta consulta) {
        this.consultas.add(consulta);
    }
}
