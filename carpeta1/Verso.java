import java.io.InputStreamReader;
public class Verso {
	public static void main(String[] args)throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String Verso[]= new String[] {
				"te","apartaras","para","que","la","luz",
				"combinada","de","la","plata","cera","y",
				"el","vidrio","dibuje","esa","cofia","de",
				"seda","que","debe","recoger","un","pelo",
				"muy","blanco","y","enmarcar","ese","rostro",
				"casi","infantil","de","tan","viejo"
			};
		Ordenamiento.imprimirVector(Verso);
		Ordenamiento.OrdenarSeleccionMenorNombre(Verso);
		Ordenamiento.imprimirVector(Verso);
		String palabra;
		System.out.println("¿Que palabra?");
		palabra=teclado.readLine();
		BusquedaBinaria.BuscarString(Verso, palabra, 0,Verso.length-1);
		
	}

}