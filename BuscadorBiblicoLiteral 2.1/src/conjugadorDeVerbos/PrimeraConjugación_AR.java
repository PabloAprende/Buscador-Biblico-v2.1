package conjugadorDeVerbos;

public class PrimeraConjugación_AR extends ReglasGramaticalesTerminaciones implements Conjugaciones {
	
	@Override	
	public String infinitivoCompuesto(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = "haber " + verboF + "do";
		return conjugacionEspecial;
	}	
	
	@Override
	public String pasadoParticipio(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = verboF + "do";
		return conjugacionEspecial;		
	}
	
	@Override
	public String presente_Indicativo(String verbo) {		
		if(verbo.endsWith("ostar")) {
			ostar(verbo,"presente_Indicativo");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = verboF + "o\n" + verboF + "as\n" + verboF + "a\n" + verboF + "amos\n" + verboF + "áis\n" + verboF + "an";
		}
		return conjugacionEspecial;	
	}	
	
	@Override
	public String futuro_Indicativo(String verbo) {
		conjugacionEspecial = verbo + "é\n" + verbo + "ás\n" + verbo + "á\n" + verbo + "emos\n" + verbo + "éis\n" + verbo + "án";
		return conjugacionEspecial;		
	}	
	
	@Override
	public String pretéritoImperfecto_Indicativo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = verboF + "aba\n" + verboF + "abas\n" + verboF + "aba\n" + verboF + "ábamos\n" + verboF + "abais\n" + verboF + "aban";
		return conjugacionEspecial;		
	}	
	
	@Override
	public String pretéritoPerfectoSimple_Indicativo(String verbo) {
		String verboF = verbo.substring(0, verbo.length() - 2);
		if (verbo.endsWith("car")) {
			c_r(verbo, this, "pretéritoPerfectoSimple_Indicativo");
		} else if (verbo.endsWith("gar")) {
			g_r(verbo, this, "pretéritoPerfectoSimple_Indicativo");
		} else if (verbo.endsWith("zar")) {
			zar(verbo, "pretéritoPerfectoSimple_Indicativo");
		} else {
			conjugacionEspecial = verboF + "é\n";
		}
		conjugacionEspecial += verboF + "aste\n" + verboF + "ó\n" + verboF + "amos\n" + verboF + "asteis\n" + verboF + "aron";
		return conjugacionEspecial;
	}
	
	@Override
	public String pretéritoPerfectoCompuesto_Indicativo(String verbo) {  		                                                                              
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = "he " + verboF + "do\nhas " + verboF + "do\nha " + verboF + "do\nhemos " + verboF + "do\nhabéis " + verboF + "do\nhan " + verboF + "do";
		return conjugacionEspecial;		
	}
	
	@Override
	public String pretéritoPluscuamperfecto_Indicativo(String verbo) {  	
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = "había " + verboF + "do\nhabías " + verboF + "do\nhabía " + verboF + "do\nhabíamos " + verboF + "do\nhabíais " + verboF + "do\nhabían " + verboF + "do";
		return conjugacionEspecial;		
	}
	
	@Override
	public String pretéritoAnterior_Indicativo(String verbo) {  	                                                                                                                                                                        
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = "hube " + verboF + "do\nhubiste " + verboF + "do\nhubo " + verboF + "do\nhubimos " + verboF + "do\nhubisteis " + verboF + "do\nhubieron " + verboF + "do";
		return conjugacionEspecial;		
	}
	
	@Override
	public String futuroPerfecto_Indicativo(String verbo) {  	  		                                                                                                                                     
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = "habré " + verboF + "do\nhabrás " + verboF + "do\nhabrá " + verboF + "do\nhabremos " + verboF + "do\nhabréis " + verboF + "do\nhabrán " + verboF + "do";
		return conjugacionEspecial;		
	}
	
	@Override
	public String condicionalPerfecto_Indicativo(String verbo) {  	
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = "habría " + verboF + "do\nhabrías " + verboF + "do\nhabría " + verboF + "do\nhabríamos " + verboF + "do\nhabríais " + verboF + "do\nhabrían " + verboF + "do";
		return conjugacionEspecial;		
	}
	
	@Override
	public String condicional_Indicativo(String verbo) {		                                                                                                                                 
		conjugacionEspecial = verbo + "ía\n" + verbo + "ías\n" + verbo + "ía\n" + verbo + "íamos\n" + verbo + "íais\n" + verbo + "ían";
		return conjugacionEspecial;		
	}
	
	@Override
	public String imperativo(String verbo) {
		if (verbo.endsWith("car")) {
			c_r(verbo, this, "imperativo");
		} else if (verbo.endsWith("gar")) {
			g_r(verbo, this, "imperativo");
		} else if (verbo.endsWith("zar")) {
			zar(verbo, "imperativo");
		} else if (verbo.endsWith("ostar")) {
			ostar(verbo, "imperativo");
		} else {
			String verboF = verbo.substring(0, verbo.length() - 2);			
			conjugacionEspecial = verboF + "e\n" + verboF + "a\n" + verboF + "e\n" + verboF + "emos\n" + verboF + "ad\n" + verboF + "en";			
		}
		return conjugacionEspecial;	
	}
	
	@Override
	public String presente_Subjuntivo(String verbo) {
		if (verbo.endsWith("car")) {
			c_r(verbo, this, "presente_Subjuntivo");
		} else if (verbo.endsWith("gar")) {
			g_r(verbo, this, "presente_Subjuntivo");
		} else if (verbo.endsWith("zar")) {
			zar(verbo, "presente_Subjuntivo");
		} else if (verbo.endsWith("ostar")) {
			ostar(verbo, "presente_Subjuntivo");
		} else {
			String verboF = verbo.substring(0, verbo.length() - 2);
			conjugacionEspecial = verboF + "e\n" + verboF + "es\n" + verboF + "e\n" + verboF + "emos\n" + verboF + "éis\n" + verboF + "en";
		}
		return conjugacionEspecial;
	}
	
	@Override
	public String futuro_Subjuntivo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = verboF + "are\n" + verboF + "ares\n" + verboF + "are\n" + verboF + "áremos\n" + verboF + "areis\n" + verboF + "aren";
		return conjugacionEspecial;		
	}	
	
	@Override
	public String pretéritoImperfecto_Subjuntivo(String verbo) {	
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = verboF + "ara\n" + verboF + "aras\n" + verboF + "ara\n" + verboF + "áramos\n" + verboF + "arais\n" + verboF + "aran";
		return conjugacionEspecial;		
	}	
	
	@Override
	public String pretéritoImperfecto2_Subjuntivo(String verbo) {	
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = verboF + "ase\n" + verboF + "ases\n" + verboF + "ase\n" + verboF + "ásemos\n" + verboF + "aseis\n" + verboF + "asen";
		return conjugacionEspecial;			
	}	
	
	@Override
	public String pretéritoPerfecto_Subjuntivo(String verbo) { 
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = "haya " + verboF + "do\nhayas " + verboF + "do\nhaya " + verboF + "do\nhayamos " + verboF + "do\nhayáis " + verboF + "do\nhayan " + verboF + "do";
		return conjugacionEspecial;		
	}
	
	@Override
	public String pretéritoPluscuamperfecto_Subjuntivo(String verbo) { 		                                                                                                                                                               
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = "hubiera " + verboF + "do\nhubieras " + verboF + "do\nhubiera " + verboF + "do\nhubiéramos " + verboF + "do\nhubierais " + verboF + "do\nhubieran " + verboF + "do";
		return conjugacionEspecial;		
	}
	
	@Override
	public String pretéritoPluscuamperfecto2_Subjuntivo(String verbo) { 		                                                                                         
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = "hubiese " + verboF + "do\nhubieses " + verboF + "do\nhubiese " + verboF + "do\nhubiésemos " + verboF + "do\nhubieseis " + verboF + "do\nhubiesen " + verboF + "do";
		return conjugacionEspecial;		
	}
	
	@Override
	public String futuroPerfecto_Subjuntivo(String verbo) { 		                                                                                   
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = "hubiere " + verboF + "do\nhubieres " + verboF + "do\nhubiere " + verboF + "do\nhubiéremos " + verboF + "do\nhubiereis " + verboF + "do\nhubieren " + verboF + "do";
		return conjugacionEspecial;		
	}
	
	@Override
	public String gerundio(String verbo) { 	
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = verboF + "ndo";
		return conjugacionEspecial;
	}
	
	@Override
	public String gerundioCompuesto(String verbo) { 	
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = "habiendo " + verboF + "do";
		return conjugacionEspecial;
	}
	
}