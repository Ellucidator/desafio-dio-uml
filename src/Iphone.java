public class Iphone {
    protected String modelo;
    protected String cor;
    protected Integer capacidade;
    protected String sistemaOperacional;
    public ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
    public NavegadorInternet navegadorInternet = new NavegadorInternet();
    public AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();

    public Iphone(String modelo, String cor, Integer capacidade, String sistemaOperacional) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidade = capacidade;
        this.sistemaOperacional = sistemaOperacional;
    }
}
