package iphone;

public class Iphone implements ReprodutorMusical, NavegadorNaInternet, AparelhoTelefonico {

    private String modelo;

    public Iphone(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String tocar() {
        return "Começando a tocar";
    }

    @Override
    public String pausar() {
        return "Pausando musica";
    }

    @Override
    public String selecionarMusica(String nomeMusica) {
        return String.format("Selecionando musica: %s", nomeMusica);
    }

    @Override
    public String ligar(String numero) {
        return String.format("Ligando para: %s", numero);
    }

    @Override
    public String atender() {
        return "Atendendo telefone";
    }

    @Override
    public String iniciarCorreioVoz() {
        return "Iniciando correio de voz";
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adc nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

}