package aplicativos;


public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{
	String musica;
	String numero;
	String url;
	
	
	public void tocar() {
		System.out.println("TOCANDO MÚSICA DA KATY PERRY");
	}
	
	public void pausar() {
		System.out.println("PAUSANDO MÚSICA DA KATY PERRY");
	}
	
	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO MÚSICA: " + musica);
	}
	
	public void ligar(String numero) {
		System.out.println("LIGANDO PARA O NÚMERO: " + numero);
	}
	
	public void atender() {
		System.out.println("ATENDENDO FULANO");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
	}
	
	public void exibirPagina(String url) {
		System.out.println("EXIBINDO PÁGINA: " + url);
	}
	
	public void adicionarNovaPagina() {
		System.out.println("ADICIONANDO NOVA PÁGINA");
	}
	
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA");
	}
}
