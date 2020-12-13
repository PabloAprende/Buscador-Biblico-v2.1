package conjugadorDeVerbos;

interface Conjugaciones {
	
	default String[] obtenerListadoConjugado(String verbo) {
		String[] conjugaciones = {"Infinitivo Compuesto:\n" + infinitivoCompuesto(verbo),"\nPasado Participio:\n" + pasadoParticipio(verbo),
				                  "\nPresente - Indicativo:\n" + presente_Indicativo(verbo),"\nFuturo - Indicativo:\n" + futuro_Indicativo(verbo),
				                  "\nPret�rito Imperfecto - Indicativo:\n" + pret�ritoImperfecto_Indicativo(verbo),"\nPret�rito Perfecto Simple - Indicativo:\n" + 
				                  pret�ritoPerfectoSimple_Indicativo(verbo),"\nPret�rito Perfecto Compuesto - Indicativo:\n" + pret�ritoPerfectoCompuesto_Indicativo(verbo),
				                  "\nPret�rito Pluscuamperfecto - Indicativo:\n" + pret�ritoPluscuamperfecto_Indicativo(verbo),"\nPret�rito Anterior - Indicativo:\n" + 
				                  pret�ritoAnterior_Indicativo(verbo),"\nFuturo Perfecto - Indicativo:\n" + futuroPerfecto_Indicativo(verbo),"\nCondicional Perfecto - Indicativo:\n" +
				                  condicionalPerfecto_Indicativo(verbo),"\nCondicional - Indicativo:\n" + condicional_Indicativo(verbo),"\nImperativo:\n" + imperativo(verbo),
				                  "\nPresente - Subjuntivo:\n" + presente_Subjuntivo(verbo),"\nFuturo - Subjuntivo:\n" + futuro_Subjuntivo(verbo),"\nPret�rito Imperfecto - Subjuntivo:\n" + 
				                  pret�ritoImperfecto_Subjuntivo(verbo),"\nPret�rito Imperfecto 2 - Subjuntivo:\n" + pret�ritoImperfecto2_Subjuntivo(verbo),"\nPret�rito Perfecto - Subjuntivo:\n" + 
				                  pret�ritoPerfecto_Subjuntivo(verbo),"\nPret�rito Pluscuamperfecto - Subjuntivo:\n" + pret�ritoPluscuamperfecto_Subjuntivo(verbo),
				                  "\nPret�rito Pluscuamperfecto 2 - Subjuntivo:\n" + pret�ritoPluscuamperfecto2_Subjuntivo(verbo),"\nFuturo Perfecto - Subjuntivo:\n" + 
				                  futuroPerfecto_Subjuntivo(verbo),"\nGerundio:\n" + gerundio(verbo),"\nGerundio Compuesto:\n" + gerundioCompuesto(verbo)};		
		
		return conjugaciones;
	}
	
	abstract String infinitivoCompuesto(String verbo);
	
	abstract String pasadoParticipio(String verbo);
	
	abstract String presente_Indicativo(String verbo);
	
	abstract String futuro_Indicativo(String verbo);
	
	abstract String pret�ritoImperfecto_Indicativo(String verbo);
	
	abstract String pret�ritoPerfectoSimple_Indicativo(String verbo);
	
	abstract String pret�ritoPerfectoCompuesto_Indicativo(String verbo);
	
	abstract String pret�ritoPluscuamperfecto_Indicativo(String verbo);
	
	abstract String pret�ritoAnterior_Indicativo(String verbo);
	
	abstract String futuroPerfecto_Indicativo(String verbo);
	
	abstract String condicionalPerfecto_Indicativo(String verbo);
	
	abstract String condicional_Indicativo(String verbo);
	
	abstract String imperativo(String verbo);
	
	abstract String presente_Subjuntivo(String verbo);
	
	abstract String futuro_Subjuntivo(String verbo);
	
	abstract String pret�ritoImperfecto_Subjuntivo(String verbo);
	
	abstract String pret�ritoImperfecto2_Subjuntivo(String verbo);
	
	abstract String pret�ritoPerfecto_Subjuntivo(String verbo);
	
	abstract String pret�ritoPluscuamperfecto_Subjuntivo(String verbo);
	
	abstract String pret�ritoPluscuamperfecto2_Subjuntivo(String verbo);
	
	abstract String futuroPerfecto_Subjuntivo(String verbo);
	
	abstract String gerundio(String verbo);
	
	abstract String gerundioCompuesto(String verbo);
}
