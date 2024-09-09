package aparelho;

import aplicativos.*;

public class Aparelho {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		AparelhoTelefonico aparelhoTelefonico = iphone;
		NavegadorInternet navegadorInternet = iphone;
		ReprodutorMusical reprodutoMusical = iphone;
		
		aparelhoTelefonico.ligar("61991937357");
	}
}
