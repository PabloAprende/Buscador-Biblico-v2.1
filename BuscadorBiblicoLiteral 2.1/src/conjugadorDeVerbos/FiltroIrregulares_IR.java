package conjugadorDeVerbos;

final class FiltroIrregulares_IR {

	private String[] irregulares = {""};
	private String[] listadoFinal;
	
	public FiltroIrregulares_IR() {
		this(null);
	}
	
	public FiltroIrregulares_IR(String verbo) {		
		for(int i=0 ; i<irregulares.length ; i++) {
			if(verbo.equalsIgnoreCase(irregulares[i])) {
				redirecionamiento(irregulares[i]);
			} else {
				listadoFinal = new TerceraConjugación_IR().obtenerListadoConjugado(verbo);
				break;
			}
		}		
	}
	
	private void redirecionamiento(String verboIrregular) {
		switch (verboIrregular.toLowerCase()) {		
//		case "..ir" : listadoFinal = new Irregular..ir().obtenerListadoConjugado(verboIrregular); break; 
		}
	}
	
	public String[] obtenerListado() {
		return listadoFinal;	
	}
}
