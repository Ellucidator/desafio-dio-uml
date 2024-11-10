public class Main {

    public static void main(String[] args) {
        Iphone celular = new Iphone("7","Branca",32,"IOS");

        celular.aparelhoTelefonico.ligar("...");
        celular.aparelhoTelefonico.atender();
        celular.aparelhoTelefonico.iniciarCorreioVoz();

        celular.navegadorInternet.exibirPagina("...");
        celular.navegadorInternet.adicionarNovaAba();
        celular.navegadorInternet.atualizarPagina();

        celular.reprodutorMusical.tocar();
        celular.reprodutorMusical.selecionarMusica("...");
        celular.reprodutorMusical.pausar();

    }
}
