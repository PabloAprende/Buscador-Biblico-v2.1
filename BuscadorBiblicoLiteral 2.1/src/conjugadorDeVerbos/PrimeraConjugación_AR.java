package conjugadorDeVerbos;

public class PrimeraConjugaci�n_AR extends ReglasGramaticalesTerminaciones implements Conjugaciones {
	
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
			conjugacionEspecial = verboF + "o\n" + verboF + "as\n" + verboF + "a\n" + verboF + "amos\n" + verboF + "�is\n" + verboF + "an";
		}
		return conjugacionEspecial;	
	}	
	
	@Override
	public String futuro_Indicativo(String verbo) {
		conjugacionEspecial = verbo + "�\n" + verbo + "�s\n" + verbo + "�\n" + verbo + "emos\n" + verbo + "�is\n" + verbo + "�n";
		return conjugacionEspecial;		
	}	
	
	@Override
	public String pret�ritoImperfecto_Indicativo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = verboF + "aba\n" + verboF + "abas\n" + verboF + "aba\n" + verboF + "�bamos\n" + verboF + "abais\n" + verboF + "aban";
		return conjugacionEspecial;		
	}	
	
	@Override
	public String pret�ritoPerfectoSimple_Indicativo(String verbo) {
		String verboF = verbo.substring(0, verbo.length() - 2);
		if (verbo.endsWith("car")) {
			c_r(verbo, this, "pret�ritoPerfectoSimple_Indicativo");
		} else if (verbo.endsWith("gar")) {
			g_r(verbo, this, "pret�ritoPerfectoSimple_Indicativo");
		} else if (verbo.endsWith("zar")) {
			zar(verbo, "pret�ritoPerfectoSimple_Indicativo");
		} else {
			conjugacionEspecial = verboF + "�\n";
		}
		conjugacionEspecial += verboF + "aste\n" + verboF + "�\n" + verboF + "amos\n" + verboF + "asteis\n" + verboF + "aron";
		return conjugacionEspecial;
	}
	
	@Override
	public String pret�ritoPerfectoCompuesto_Indicativo(String verbo) {  		                                                                              
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = "he " + verboF + "do\nhas " + verboF + "do\nha " + verboF + "do\nhemos " + verboF + "do\nhab�is " + verboF + "do\nhan " + verboF + "do";
		return conjugacionEspecial;		
	}
	
	@Override
	public String pret�ritoPluscuamperfecto_Indicativo(String verbo) {  	
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = "hab�a " + verboF + "do\nhab�as " + verboF + "do\nhab�a " + verboF + "do\nhab�amos " + verboF + "do\nhab�ais " + verboF + "do\nhab�an " + verboF + "do";
		return conjugacionEspecial;		
	}
	
	@Override
	public String pret�ritoAnterior_Indicativo(String verbo) {  	                                                                                                                                                                        
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = "hube " + verboF + "do\nhubiste " + verboF + "do\nhubo " + verboF + "do\nhubimos " + verboF + "do\nhubisteis " + verboF + "do\nhubieron " + verboF + "do";
		return conjugacionEspecial;		
	}
	
	@Override
	public String futuroPerfecto_Indicativo(String verbo) {  	  		                                                                                                                                     
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = "habr� " + verboF + "do\nhabr�s " + verboF + "do\nhabr� " + verboF + "do\nhabremos " + verboF + "do\nhabr�is " + verboF + "do\nhabr�n " + verboF + "do";
		return conjugacionEspecial;		
	}
	
	@Override
	public String condicionalPerfecto_Indicativo(String verbo) {  	
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = "habr�a " + verboF + "do\nhabr�as " + verboF + "do\nhabr�a " + verboF + "do\nhabr�amos " + verboF + "do\nhabr�ais " + verboF + "do\nhabr�an " + verboF + "do";
		return conjugacionEspecial;		
	}
	
	@Override
	public String condicional_Indicativo(String verbo) {		                                                                                                                                 
		conjugacionEspecial = verbo + "�a\n" + verbo + "�as\n" + verbo + "�a\n" + verbo + "�amos\n" + verbo + "�ais\n" + verbo + "�an";
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
			conjugacionEspecial = verboF + "e\n" + verboF + "es\n" + verboF + "e\n" + verboF + "emos\n" + verboF + "�is\n" + verboF + "en";
		}
		return conjugacionEspecial;
	}
	
	@Override
	public String futuro_Subjuntivo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = verboF + "are\n" + verboF + "ares\n" + verboF + "are\n" + verboF + "�remos\n" + verboF + "areis\n" + verboF + "aren";
		return conjugacionEspecial;		
	}	
	
	@Override
	public String pret�ritoImperfecto_Subjuntivo(String verbo) {	
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = verboF + "ara\n" + verboF + "aras\n" + verboF + "ara\n" + verboF + "�ramos\n" + verboF + "arais\n" + verboF + "aran";
		return conjugacionEspecial;		
	}	
	
	@Override
	public String pret�ritoImperfecto2_Subjuntivo(String verbo) {	
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = verboF + "ase\n" + verboF + "ases\n" + verboF + "ase\n" + verboF + "�semos\n" + verboF + "aseis\n" + verboF + "asen";
		return conjugacionEspecial;			
	}	
	
	@Override
	public String pret�ritoPerfecto_Subjuntivo(String verbo) { 
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = "haya " + verboF + "do\nhayas " + verboF + "do\nhaya " + verboF + "do\nhayamos " + verboF + "do\nhay�is " + verboF + "do\nhayan " + verboF + "do";
		return conjugacionEspecial;		
	}
	
	@Override
	public String pret�ritoPluscuamperfecto_Subjuntivo(String verbo) { 		                                                                                                                                                               
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = "hubiera " + verboF + "do\nhubieras " + verboF + "do\nhubiera " + verboF + "do\nhubi�ramos " + verboF + "do\nhubierais " + verboF + "do\nhubieran " + verboF + "do";
		return conjugacionEspecial;		
	}
	
	@Override
	public String pret�ritoPluscuamperfecto2_Subjuntivo(String verbo) { 		                                                                                         
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = "hubiese " + verboF + "do\nhubieses " + verboF + "do\nhubiese " + verboF + "do\nhubi�semos " + verboF + "do\nhubieseis " + verboF + "do\nhubiesen " + verboF + "do";
		return conjugacionEspecial;		
	}
	
	@Override
	public String futuroPerfecto_Subjuntivo(String verbo) { 		                                                                                   
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = "hubiere " + verboF + "do\nhubieres " + verboF + "do\nhubiere " + verboF + "do\nhubi�remos " + verboF + "do\nhubiereis " + verboF + "do\nhubieren " + verboF + "do";
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