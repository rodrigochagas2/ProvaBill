package terceira.pergunta;

public class Classe implements Interface1,Interface2 {
	
	public void metodo(){}
	
	public void metodo1(){
		
		Interface1.super.metodo();
	}
	
	public void metodo2() {
		
		Interface2.super.metodo();
		System.out.println("");
	}

}
