import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ControleCandidatos {
    public static void main(String[] args) {
        List<Candidato> candidatos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos candidatos serão chamados para entrevista? ");
        Integer quantidadeEntrevistados = sc.nextInt();
        sc.close();

        candidatos.add(new Candidato("FELIPE"));
        candidatos.add(new Candidato("MÁRCIA"));
        candidatos.add(new Candidato("JULIA"));
        candidatos.add(new Candidato("PAULO"));
        candidatos.add(new Candidato("AUGUSTO"));
        candidatos.add(new Candidato("MÔNICA"));
        candidatos.add(new Candidato("FABRÍCIO"));
        candidatos.add(new Candidato("MIRELA"));
        candidatos.add(new Candidato("DANIELA"));
        candidatos.add(new Candidato("JORGE"));

        EscolhaCandidatos.avaliarPretensaoSalario(candidatos);
        System.out.println("\nCANDIDATOS SELECIONADOS PARA ENTREVISTA: ");
        EscolhaCandidatos.selecionarCandidatos(candidatos, quantidadeEntrevistados);

    }

    class EscolhaCandidatos {
        EscolhaCandidatos() {
        }

        static final Double SALARIOBASE = 2000.00;

        static void selecionarCandidatos(List<Candidato> candidatos, Integer quantidadeEntrevistados) {
            Integer contCandidatosAprovados = 0;

            for (Candidato candidato : candidatos) {
                if (contCandidatosAprovados.equals(quantidadeEntrevistados)) {
                    break;
                } else {
                    if (candidato.getSalarioPretendido() <= SALARIOBASE) {
                        ligarCandidato(candidato);
                        contCandidatosAprovados++;
                    }
                }
            }

        }

        static void avaliarPretensaoSalario(List<Candidato> candidatos) {
            String mensagem = "";

            for (Candidato candidato : candidatos) {
                if (candidato.getSalarioPretendido() < SALARIOBASE) {
                    mensagem = "LIGAR PARA O CANDIDATO";
                } else if (candidato.getSalarioPretendido().equals(SALARIOBASE)) {
                    mensagem = "LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA";
                } else {
                    mensagem = "AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS";
                }
                System.out.println("CANDIDATO " + candidato.getNomeCandidato() + ", " + mensagem);
            }

        }

        static void ligarCandidato(Candidato candidato) {
            System.out.println("\nLIGANDO PARA O CANDIDATO " + candidato.getNomeCandidato() + "...");

            Boolean atender = ThreadLocalRandom.current().nextInt(3) == 1;

            Integer tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;

            do {
                atendeu = atender;
                continuarTentando = !atendeu;
                if (continuarTentando)
                    tentativasRealizadas++;
                else
                    System.out.println("CONTATO REALIZADO COM SUCESSO");

            } while ((continuarTentando) && (tentativasRealizadas < 3));

            if (atendeu)
                System.out
                        .println("CONSEGUIMOS CONTATO COM " + candidato.getNomeCandidato() + " NA "
                                + tentativasRealizadas + " TENTATIVA");
            else
                System.out.println(
                        "NÃO CONSEGUIMOS CONTATO COM " + candidato.getNomeCandidato() + ", NÚMERO MAXIMO TENTATIVAS "
                                + tentativasRealizadas + " REALIZADA");

        }
    }

    static class Candidato {
        private Double salarioPretendido = 0.0;
        private String nomeCandidato;

        public Candidato(String nomeCandidato) {
            this.nomeCandidato = nomeCandidato;
            this.salarioPretendido = salarioPretendido();
        }

        Double salarioPretendido() {
            return ThreadLocalRandom.current().nextDouble(1800, 2200);
        }

        public Double getSalarioPretendido() {
            return this.salarioPretendido;
        }

        public String getNomeCandidato() {
            return this.nomeCandidato;
        }
    }

}
