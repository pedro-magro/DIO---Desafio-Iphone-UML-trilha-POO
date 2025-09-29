//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String musica = "firework";
        String url = " https://www.google.com.br";
        int numero = 1140028922;

        Iphone iphone15 = new Iphone();

        System.out.println(iphone15.ligar(numero));

        System.out.println(iphone15.iniciarCorreioVoz());

        System.out.println(iphone15.adicionarNovaAba());

        System.out.println(iphone15.exibirPagina(url));

        System.out.println(iphone15.selecionarMusica(musica));

        System.out.println(iphone15.pausar());


    }
}