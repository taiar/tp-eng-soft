package Atores;

import DadosGerais.Endereco;
import DadosGerais.Telefone;

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

}
