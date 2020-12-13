package conjugadorDeVerbos;

interface Conjugaciones {
	
	default String[] obtenerListadoConjugado(String verbo) {
		String[] conjugaciones = {"Infinitivo Compuesto:\n" + infinitivoCompuesto(verbo),"\nPasado Participio:\n" + pasadoParticipio(verbo),
				                  "\nPresente - Indicativo:\n" + presente_Indicativo(verbo),"\nFuturo - Indicativo:\n" + futuro_Indicativo(verbo),
				                  "\nPretérito Imperfecto - Indicativo:\n" + pretéritoImperfecto_Indicativo(verbo),"\nPretérito Perfecto Simple - Indicativo:\n" + 
				                  pretéritoPerfectoSimple_Indicativo(verbo),"\nPretérito Perfecto Compuesto - Indicativo:\n" + pretéritoPerfectoCompuesto_Indicativo(verbo),
				                  "\nPretérito Pluscuamperfecto - Indicativo:\n" + pretéritoPluscuamperfecto_Indicativo(verbo),"\nPretérito Anterior - Indicativo:\n" + 
				                  pretéritoAnterior_Indicativo(verbo),"\nFuturo Perfecto - Indicativo:\n" + futuroPerfecto_Indicativo(verbo),"\nCondicional Perfecto - Indicativo:\n" +
				                  condicionalPerfecto_Indicativo(verbo),"\nCondicional - Indicativo:\n" + condicional_Indicativo(verbo),"\nImperativo:\n" + imperativo(verbo),
				                  "\nPresente - Subjuntivo:\n" + presente_Subjuntivo(verbo),"\nFuturo - Subjuntivo:\n" + futuro_Subjuntivo(verbo),"\nPretérito Imperfecto - Subjuntivo:\n" + 
				                  pretéritoImperfecto_Subjuntivo(verbo),"\nPretérito Imperfecto 2 - Subjuntivo:\n" + pretéritoImperfecto2_Subjuntivo(verbo),"\nPretérito Perfecto - Subjuntivo:\n" + 
				                  pretéritoPerfecto_Subjuntivo(verbo),"\nPretérito Pluscuamperfecto - Subjuntivo:\n" + pretéritoPluscuamperfecto_Subjuntivo(verbo),
				                  "\nPretérito Pluscuamperfecto 2 - Subjuntivo:\n" + pretéritoPluscuamperfecto2_Subjuntivo(verbo),"\nFuturo Perfecto - Subjuntivo:\n" + 
				                  futuroPerfecto_Subjuntivo(verbo),"\nGerundio:\n" + gerundio(verbo),"\nGerundio Compuesto:\n" + gerundioCompuesto(verbo)};		
		
		return conjugaciones;
	}
	
	abstract String infinitivoCompuesto(String verbo);
	
	abstract String pasadoParticipio(String verbo);
	
	abstract String presente_Indicativo(String verbo);
	
	abstract String futuro_Indicativo(String verbo);
	
	abstract String pretéritoImperfecto_Indicativo(String verbo);
	
	abstract String pretéritoPerfectoSimple_Indicativo(String verbo);
	
	abstract String pretéritoPerfectoCompuesto_Indicativo(String verbo);
	
	abstract String pretéritoPluscuamperfecto_Indicativo(String verbo);
	
	abstract String pretéritoAnterior_Indicativo(String verbo);
	
	abstract String futuroPerfecto_Indicativo(String verbo);
	
	abstract String condicionalPerfecto_Indicativo(String verbo);
	
	abstract String condicional_Indicativo(String verbo);
	
	abstract String imperativo(String verbo);
	
	abstract String presente_Subjuntivo(String verbo);
	
	abstract String futuro_Subjuntivo(String verbo);
	
	abstract String pretéritoImperfecto_Subjuntivo(String verbo);
	
	abstract String pretéritoImperfecto2_Subjuntivo(String verbo);
	
	abstract String pretéritoPerfecto_Subjuntivo(String verbo);
	
	abstract String pretéritoPluscuamperfecto_Subjuntivo(String verbo);
	
	abstract String pretéritoPluscuamperfecto2_Subjuntivo(String verbo);
	
	abstract String futuroPerfecto_Subjuntivo(String verbo);
	
	abstract String gerundio(String verbo);
	
	abstract String gerundioCompuesto(String verbo);
}
