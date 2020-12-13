package conjugadorDeVerbos;

import Irregulares_ER.*;

final class FiltroIrregulares_ER {

	private String[] irregulares = {"caer","decaer","haber","raer","saber","ser"};
	private String[] listadoFinal;
	
	public FiltroIrregulares_ER() {
		this(null);
	}
	
	public FiltroIrregulares_ER(String verbo) {		
		for(int i=0 ; i<irregulares.length ; i++) {
			if(verbo.equalsIgnoreCase(irregulares[i])) {
				redirecionamiento(irregulares[i]);
			} else {
				listadoFinal = new SegundaConjugación_ER().obtenerListadoConjugado(verbo);
				break;
			}
		}		
	}
	
	private void redirecionamiento(String verboIrregular) {
		switch (verboIrregular.toLowerCase()) {		
		case "caer" : listadoFinal = new IrregularAer().obtenerListadoConjugado(verboIrregular); break; 
		case "decaer" : listadoFinal = new IrregularAer().obtenerListadoConjugado(verboIrregular); break; 
		case "haber" : listadoFinal = new IrregularHaber().obtenerListadoConjugado(verboIrregular); break;
		case "raer" : listadoFinal = new IrregularAer().obtenerListadoConjugado(verboIrregular); break; 
//		case "saber" : listadoFinal = new IrregularSaber().obtenerListadoConjugado(verboIrregular); break; 
		case "ser" : listadoFinal = new IrregularSer().obtenerListadoConjugado(verboIrregular); break; 
		}
	}
	
	public String[] obtenerListado() {
		return listadoFinal;	
	}
}
