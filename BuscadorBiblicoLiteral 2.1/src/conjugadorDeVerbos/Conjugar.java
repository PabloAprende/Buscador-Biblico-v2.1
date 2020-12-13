package conjugadorDeVerbos;

public class Conjugar {

	private String[] listadoFinal;

	public String[] obtenerListadoConjugado(String verbo) {
		
		verbo = verbo.toLowerCase();
		if(verbo.endsWith("ar")) {
			listadoFinal = new FiltroIrregulares_AR(verbo).obtenerListado();			
		} else if(verbo.endsWith("er")){
			listadoFinal = new FiltroIrregulares_ER(verbo).obtenerListado();	
		} else if(verbo.endsWith("ir")){
			listadoFinal = new FiltroIrregulares_IR(verbo).obtenerListado();
		}
		
		return listadoFinal;
	}
}
