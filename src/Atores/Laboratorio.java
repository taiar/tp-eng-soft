package Atores;

import Clinico.Exame;
import DadosGerais.Endereco;

import java.util.List;

public class Laboratorio {

    // Nome do laboratório.
    private String nome;

    // Endereço físico do laboratório.
    private Endereco endereco;

    // Exames feitos por esse laboratório.
    private List<Exame> exames;
}
