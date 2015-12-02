package Entidades.Clinico.Prontuario;

import Entidades.Clinico.Exame;

import java.util.GregorianCalendar;
import java.util.List;

public class DadosProntuario {

    // Data em que estes dados foram preenchidos.
    private GregorianCalendar dataOcorrencia;

    // Ligação com o prontuário e o paciente.
    private Prontuario prontuario;

    // Exames associados à esta ocorrência do prontuário.
    private List<Exame> examesGerais;

    /** Campos específicos de um prontuário médico. */
    private String evolucaoMedicaDiaria;
    private String evolucaoEnfermagemEOutrasEspecialidades;
    private String raciocinioMedico;
    private String hipotesesDiagnosticoDefinitivo;
    private String condutaTerapeutica;
    private String prescricoesMedicas;
    private String descricoesCirurgicas;
    private String fichasAnestesicas;
    private String resumoDeAlta;
    private String atendimentoAmbulatorialUrgencia;
    private String observacaoBoletinsMedicos;

    /**
     * Campos de um prontuário médico:
     * evolução médica diária (no caso de internação);
     * evoluções de enfermagem e de outros profissionais assistentes;
     * exames laboratoriais, radiológicos e outros;
     * raciocínio médico,
     * hipóteses diagnósticas e diagnóstico definitivo;
     * conduta terapêutica,
     * prescrições médicas,
     * descrições cirúrgicas,
     * fichas anestésicas,
     * resumo de alta,
     * fichas de atendimento ambulatorial e/ou atendimento de urgência,
     * folhas de observação médica e boletins médicos.
     */

    public GregorianCalendar getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(GregorianCalendar dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    public List<Exame> getExamesGerais() {
        return examesGerais;
    }

    public void setExamesGerais(List<Exame> examesGerais) {
        this.examesGerais = examesGerais;
    }

    public String getEvolucaoMedicaDiaria() {
        return evolucaoMedicaDiaria;
    }

    public void setEvolucaoMedicaDiaria(String evolucaoMedicaDiaria) {
        this.evolucaoMedicaDiaria = evolucaoMedicaDiaria;
    }

    public String getEvolucaoEnfermagemEOutrasEspecialidades() {
        return evolucaoEnfermagemEOutrasEspecialidades;
    }

    public void setEvolucaoEnfermagemEOutrasEspecialidades(String evolucaoEnfermagemEOutrasEspecialidades) {
        this.evolucaoEnfermagemEOutrasEspecialidades = evolucaoEnfermagemEOutrasEspecialidades;
    }

    public String getRaciocinioMedico() {
        return raciocinioMedico;
    }

    public void setRaciocinioMedico(String raciocinioMedico) {
        this.raciocinioMedico = raciocinioMedico;
    }

    public String getHipotesesDiagnosticoDefinitivo() {
        return hipotesesDiagnosticoDefinitivo;
    }

    public void setHipotesesDiagnosticoDefinitivo(String hipotesesDiagnosticoDefinitivo) {
        this.hipotesesDiagnosticoDefinitivo = hipotesesDiagnosticoDefinitivo;
    }

    public String getCondutaTerapeutica() {
        return condutaTerapeutica;
    }

    public void setCondutaTerapeutica(String condutaTerapeutica) {
        this.condutaTerapeutica = condutaTerapeutica;
    }

    public String getPrescricoesMedicas() {
        return prescricoesMedicas;
    }

    public void setPrescricoesMedicas(String prescricoesMedicas) {
        this.prescricoesMedicas = prescricoesMedicas;
    }

    public String getDescricoesCirurgicas() {
        return descricoesCirurgicas;
    }

    public void setDescricoesCirurgicas(String descricoesCirurgicas) {
        this.descricoesCirurgicas = descricoesCirurgicas;
    }

    public String getFichasAnestesicas() {
        return fichasAnestesicas;
    }

    public void setFichasAnestesicas(String fichasAnestesicas) {
        this.fichasAnestesicas = fichasAnestesicas;
    }

    public String getResumoDeAlta() {
        return resumoDeAlta;
    }

    public void setResumoDeAlta(String resumoDeAlta) {
        this.resumoDeAlta = resumoDeAlta;
    }

    public String getAtendimentoAmbulatorialUrgencia() {
        return atendimentoAmbulatorialUrgencia;
    }

    public void setAtendimentoAmbulatorialUrgencia(String atendimentoAmbulatorialUrgencia) {
        this.atendimentoAmbulatorialUrgencia = atendimentoAmbulatorialUrgencia;
    }

    public String getObservacaoBoletinsMedicos() {
        return observacaoBoletinsMedicos;
    }

    public void setObservacaoBoletinsMedicos(String observacaoBoletinsMedicos) {
        this.observacaoBoletinsMedicos = observacaoBoletinsMedicos;
    }
}
