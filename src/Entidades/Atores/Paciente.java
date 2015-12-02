package Entidades.Atores;

import Entidades.Clinico.Exame;
import Entidades.Clinico.Prontuario.Prontuario;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa {

    // Chave única de acesso do paciente para visualizar seus Exames pela internet.
    private String chaveUnica;

    // Histórico do paciente armazenado na clínica.
    private Prontuario historico;

    // Exames deste paciente.
    private List<Exame> exames;

    public Paciente() {
        this.exames = new ArrayList<Exame>();
    }

    public String getChaveUnica() {
        return chaveUnica;
    }

    public void setChaveUnica(String chaveUnica) {
        this.chaveUnica = chaveUnica;
    }

    public Prontuario getHistorico() {
        return historico;
    }

    public void setHistorico(Prontuario historico) {
        this.historico = historico;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void addExame(Exame exame) {
        this.exames.add(exame);
    }
}
