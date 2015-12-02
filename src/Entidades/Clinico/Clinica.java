package Entidades.Clinico;

import Entidades.Atores.Pessoa;
import Entidades.DadosGerais.Endereco;

import java.util.ArrayList;
import java.util.List;

public class Clinica {

    // Endereço da clínica.
    private Endereco endereco;

    // Equipe da clínica.
    private List<Pessoa> equipe;

    public Clinica() {
        this.equipe = new ArrayList<Pessoa>();
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Pessoa> getEquipe() {
        return equipe;
    }

    public void setEquipe(List<Pessoa> equipe) {
        this.equipe = equipe;
    }
}
