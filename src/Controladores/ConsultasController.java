package Controladores;

import Entidades.Atores.Medico;
import Entidades.Atores.Paciente;
import Entidades.Atores.Recepcionista;
import Entidades.Clinico.Consulta;
import Entidades.Clinico.Exame;
import Entidades.Clinico.Prontuario.DadosProntuario;
import Entidades.Clinico.Prontuario.Prontuario;

import java.util.GregorianCalendar;

public class ConsultasController {

    public Consulta criarConsulta(Recepcionista agendador, Medico atendente, Paciente paciente, GregorianCalendar marcacao) {
        Consulta consulta = new Consulta();

        consulta.setAconteceu(false);
        consulta.setAgendador(agendador);
        consulta.setAtendente(atendente);
        consulta.setAtendido(paciente);
        consulta.setDataMarcacao(marcacao);

        return consulta;
    }

    public Consulta atenderConsulta(Consulta consulta, DadosProntuario dadosProntuario) {
        consulta.setAconteceu(true);
        consulta.setDados(dadosProntuario);
        this.associaConsultaProntuario(consulta.getAtendido().getHistorico(), consulta);
        return consulta;
    }

    private Prontuario associaConsultaProntuario(Prontuario prontuario, Consulta consulta) {
        prontuario.addConsulta(consulta);
        return prontuario;
    }

    public static DadosProntuario preencheDadosProntuario(String evolucaoMedicaDiaria, String
            evolucaoEnfermagemEOutrasEspecialidades, String raciocinioMedico, String hipotesesDiagnosticoDefinitivo,
            String condutaTerapeutica, String prescricoesMedicas, String descricoesCirurgicas, String fichasAnestesicas,
            String resumoDeAlta, String atendimentoAmbulatorialUrgencia, String observacaoBoletinsMedicos) {

        DadosProntuario dados = new DadosProntuario();

        dados.setEvolucaoMedicaDiaria(evolucaoMedicaDiaria);
        dados.setEvolucaoEnfermagemEOutrasEspecialidades(evolucaoEnfermagemEOutrasEspecialidades);
        dados.setRaciocinioMedico(raciocinioMedico);
        dados.setHipotesesDiagnosticoDefinitivo(hipotesesDiagnosticoDefinitivo);
        dados.setCondutaTerapeutica(condutaTerapeutica);
        dados.setPrescricoesMedicas(prescricoesMedicas);
        dados.setDescricoesCirurgicas(descricoesCirurgicas);
        dados.setFichasAnestesicas(fichasAnestesicas);
        dados.setResumoDeAlta(resumoDeAlta);
        dados.setAtendimentoAmbulatorialUrgencia(atendimentoAmbulatorialUrgencia);
        dados.setObservacaoBoletinsMedicos(observacaoBoletinsMedicos);

        return dados;
    }

    public static DadosProntuario adicionaExameDadosProntuario(Exame exame, DadosProntuario dados) {
        dados.getExamesGerais().add(exame);
        return dados;
    }

}
