package Entidades.Atores;

import Entidades.DadosGerais.Endereco;
import Entidades.DadosGerais.Telefone;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {

    // Nome de uma pessoa.
    private String nome;

    // Idade de uma pessoa.
    private int idade;

    // Endereço físico da residência da pessoa.
    private Endereco endereco;

    // Telefones que a pessoa tem.
    private List<Telefone> telefones;

    public Pessoa() {
        this.telefones = new ArrayList<Telefone>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
}
