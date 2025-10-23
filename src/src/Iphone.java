public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    //Atributos
    private String modelo;
    private int armazenamento;
    private String cor;

    // Construtor
    public Iphone(String modelo, int armazenamento, String cor) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.cor = cor;
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    // Métodos da Interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Método principal para testar
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone 14", 128, "Preto");

        iphone.selecionarMusica("Imagine Dragons - Believer");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("(11) 99999-9999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("www.apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
