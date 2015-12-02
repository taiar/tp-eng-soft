package Atores;

import Clinico.Exame;
import Clinico.Prontuario.Prontuario;

import java.util.List;

public class Paciente extends Pessoa {

    // Chave única de acesso do paciente para visualizar seus Exames pela internet.
    private String chaveUnica;

    // Histórico do paciente armazenado na clínica.
    private Prontuario historico;

    // Exames deste paciente.
    private List<Exame> exames;

}
