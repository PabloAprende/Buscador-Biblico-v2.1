package conjugadorDeVerbos;

import irregurales_AR.*;

final class FiltroIrregulares_AR {
	
	private String[] irregulares = {"estar","rogar"};
	private String[] listadoFinal;
	
	public FiltroIrregulares_AR() {
		this(null);
	}
	
	public FiltroIrregulares_AR(String verbo) {		
		for(int i=0 ; i<irregulares.length ; i++) {
			if(verbo.equalsIgnoreCase(irregulares[i])) {
				redirecionamiento(irregulares[i]);
			} else {
				listadoFinal = new PrimeraConjugación_AR().obtenerListadoConjugado(verbo);
				break;
			}
		}		
	}
	
	private void redirecionamiento(String verboIrregular) {
		switch (verboIrregular.toLowerCase()) {
		case "estar" : listadoFinal = new IrregularEstar().obtenerListadoConjugado(verboIrregular); break;
		case "rogar" : listadoFinal = new IrregularRogar().obtenerListadoConjugado(verboIrregular); break;				
	
		}
	}
	
	public String[] obtenerListado() {
		return listadoFinal;	
	}
}
