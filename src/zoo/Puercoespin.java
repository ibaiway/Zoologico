package zoo;

public class Puercoespin extends Animal {

	//hereda las funciones de la clase animal con el super
	
	public Puercoespin(String especie, int patas) {
		super.setEspecie(especie);
		super.setPatas(patas);
	}
	public void mostrar(){
		System.out.println("Soy un Puercoespin de la especie " + especie + " y tengo " + patas +" patas");
	}

}
