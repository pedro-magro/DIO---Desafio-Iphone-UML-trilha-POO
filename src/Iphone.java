public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public String ligar(int numero) {
        return "Ligando para: " + numero;
    }

    @Override
    public String atender() {
        return "ligação atendida";
    }

    @Override
    public String iniciarCorreioVoz() {
        return "Correio de voz Iniciado!";
    }

    @Override
    public String exibirPagina(String url) {
        return "Exibindo site: " + url;
    }

    @Override
    public String atualizarPagina(){
        return"Página atualizada!";
    }
    @Override
    public String adicionarNovaAba(){
        return"Nova aba aberta!";
    }
    @Override
    public String tocar(){
        return "Tocando música!";
    }
    @Override
    public String pausar(){
        return "Música pausada!";
    }

    @Override
    public String selecionarMusica(String musica) {
        return "A musica " + musica + " foi selecionada!";
    }
}


