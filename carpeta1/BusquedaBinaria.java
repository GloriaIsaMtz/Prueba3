public class BusquedaBinaria {
	public static int BuscarString(String v[],String palabra,int pI,int pf) {
		if(pI>pf) {
		     return 0;
	       }
		int M=(pI+pf)/2;
		String Mitad=v[M];
      
		int comparacion=palabra.compareTo(palabraMitad);
		if(comparacion==0) {
				System.out.println((M+1);
			return 0;
		}
		//derecha
		if(comparacion<0) {
			pf=M-1;
			return BuscarString(v,palabra,pI,pf);
		}
		//izquierda
		else{
			pI=M+1;
			return BuscarString(v,palabra,pI,pf);
		}
	}
}