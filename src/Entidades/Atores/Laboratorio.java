package Entidades.Atores;

import Entidades.Clinico.Exame;
import Entidades.DadosGerais.Endereco;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio {

    // Nome do laboratório.
    private String nome;

    // Endereço físico do laboratório.
    private Endereco endereco;

    // Exames feitos por esse laboratório.
    private List<Exame> exames;

    public Laboratorio() {
        this.exames = new ArrayList<Exame>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void addExame(Exame exame) {
        this.exames.add(exame);
    }
}
