package POO;

public class animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LA ABSTTACCIÓN, PATRON, MODELO DE UN ANIMAL
		//CADA CLASE SE COMPONE DE DOS ELEMENTOS BASICOS(LLAMADOS LOS DOS JUNTOS - MIEMBROS DE LA CLASE
		//ATRIBUTO
		int edad;
		String especie;
		int cansancio;
		int altura;
		boolean mamifero;
	
		//metodo constructor, normalmente es el primero de los metodos, no es obligatorio(marca las directrices de lo que queremos crear)
		public animal() {
			mamifero = true;
			int edad= 5;
		}
		
		//METODO
		
		public void comer(){
			System.out.println("el animal esta comiendo");
		}
		public void dormir() {
			System.out.println("el animal esta durmmiendo");
		}
		public void correr() {
			System.out.println("el animal esta corriendo");
		
	}
	}
	


