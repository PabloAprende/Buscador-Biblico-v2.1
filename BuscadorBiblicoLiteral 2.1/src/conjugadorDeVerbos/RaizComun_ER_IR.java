package conjugadorDeVerbos;

abstract class RaizComun_ER_IR extends ReglasGramaticalesTerminaciones implements Conjugaciones {

	@Override 
	public String infinitivoCompuesto(String verbo) {
		if(verbo.endsWith("oner")) {
			_ner(verbo,"infinitivoCompuesto");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = "haber " + verboF + "ido";
		}
		return conjugacionEspecial;
	}

	@Override 
	public String pasadoParticipio(String verbo) { 
		if(verbo.endsWith("oner")) {
			_ner(verbo,"pasadoParticipio");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = verboF + "ido";
		}
		return conjugacionEspecial;	
	}
	
	@Override 
	public String futuro_Indicativo(String verbo) {
		if(verbo.endsWith("ener") || verbo.endsWith("oner")) {
			_ner(verbo,"futuro_Indicativo");
		} else {
			conjugacionEspecial = verbo + "�\n" + verbo + "�s\n" + verbo + "�\n" + verbo + "emos\n" + verbo + "�is\n" + verbo + "�n";
		}
		return conjugacionEspecial;	
	}
	
	@Override
	public String pret�ritoImperfecto_Indicativo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = verboF + "�a\n" + verboF + "�as\n" + verboF + "�a\n" + verboF + "�amos\n" + verboF + "�ais\n" + verboF + "�an";
		return conjugacionEspecial;
	}
	
	@Override 
	public String pret�ritoPerfectoCompuesto_Indicativo(String verbo) {
		if(verbo.endsWith("oner")) {
			_ner(verbo,"pret�ritoPerfectoCompuesto_Indicativo");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = "he " + verboF + "ido\nhas " + verboF + "ido\nha " + verboF + "ido\nhemos " + verboF + "ido\nhab�is " + verboF + "ido\nhan " + verboF + "ido";
		}
		return conjugacionEspecial;	
	}

	@Override
	public String pret�ritoPluscuamperfecto_Indicativo(String verbo) {
		if(verbo.endsWith("oner")) {
			_ner(verbo,"pret�ritoPluscuamperfecto_Indicativo");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = "hab�a " + verboF + "ido\nhab�as " + verboF + "ido\nhab�a " + verboF + "ido\nhab�amos " + verboF + "ido\nhab�ais " + verboF + "ido\nhab�an " + verboF + "ido";
		}	
		return conjugacionEspecial;	
	}

	@Override
	public String pret�ritoAnterior_Indicativo(String verbo) {
		if(verbo.endsWith("oner")) {
			_ner(verbo,"pret�ritoAnterior_Indicativo");
		} else {
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = "hube " + verboF + "ido\nhubiste " + verboF + "ido\nhubo " + verboF + "ido\nhubimos " + verboF + "ido\nhubisteis " + verboF + "ido\nhubieron " + verboF + "ido";
		}
		return conjugacionEspecial;
	}

	@Override
	public String futuroPerfecto_Indicativo(String verbo) {
		if(verbo.endsWith("oner")) {
			_ner(verbo,"futuroPerfecto_Indicativo");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = "habr� " + verboF + "ido\nhabr�s " + verboF + "ido\nhabr� " + verboF + "ido\nhabremos " + verboF + "ido\nhabr�is " + verboF + "ido\nhabr�n " + verboF + "ido";
		}
		return conjugacionEspecial;		
	}

	@Override
	public String condicionalPerfecto_Indicativo(String verbo) {
		if(verbo.endsWith("oner")) {
			_ner(verbo,"condicionalPerfecto_Indicativo");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = "habr�a " + verboF + "ido\nhabr�as " + verboF + "ido\nhabr�a " + verboF + "ido\nhabr�amos " + verboF + "ido\nhabr�ais " + verboF + "ido\nhabr�an " + verboF + "ido";
		}
		return conjugacionEspecial;		
	}

	@Override 
	public String condicional_Indicativo(String verbo) {
		if(verbo.endsWith("ener") || verbo.endsWith("oner")) {
			_ner(verbo,"condicional_Indicativo");
		} else {
			conjugacionEspecial = verbo + "�a\n" + verbo + "�as\n" + verbo + "�a\n" + verbo + "�amos\n" + verbo + "�ais\n" + verbo + "�an";
		}
		return conjugacionEspecial;	
	}

	@Override
	public String pret�ritoPerfecto_Subjuntivo(String verbo) {
		if(verbo.endsWith("oner")) {
			_ner(verbo,"pret�ritoPerfecto_Subjuntivo");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = "haya " + verboF + "ido\nhayas " + verboF + "ido\nhaya " + verboF + "ido\nhayamos " + verboF + "ido\nhay�is " + verboF + "ido\nhayan " + verboF + "ido";
		}
		return conjugacionEspecial;		
	}

	@Override
	public String pret�ritoPluscuamperfecto_Subjuntivo(String verbo) { 		                                                                                                                                                               
		if(verbo.endsWith("oner")) {
			_ner(verbo,"pret�ritoPluscuamperfecto_Subjuntivo");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = "hubiera " + verboF + "ido\nhubieras " + verboF + "ido\nhubiera " + verboF + "ido\nhubi�ramos " + verboF + "ido\nhubierais " + verboF + "ido\nhubieran " + verboF + "ido";
		}	
		return conjugacionEspecial;		
	}
	
	@Override
	public String pret�ritoPluscuamperfecto2_Subjuntivo(String verbo) { 		                                                                                         
		if(verbo.endsWith("oner")) {
			_ner(verbo,"pret�ritoPluscuamperfecto2_Subjuntivo");
		} else {
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = "hubiese " + verboF + "ido\nhubieses " + verboF + "ido\nhubiese " + verboF + "ido\nhubi�semos " + verboF + "ido\nhubieseis " + verboF + "ido\nhubiesen " + verboF + "ido";
		}
		return conjugacionEspecial;		
	}
	
	@Override
	public String futuroPerfecto_Subjuntivo(String verbo) { 		                                                                                   
		if(verbo.endsWith("oner")) {
			_ner(verbo,"futuroPerfecto_Subjuntivo");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = "hubiere " + verboF + "ido\nhubieres " + verboF + "ido\nhubiere " + verboF + "ido\nhubi�remos " + verboF + "ido\nhubiereis " + verboF + "ido\nhubieren " + verboF + "ido";
		}
		return conjugacionEspecial;		
	}

	@Override
	public String gerundioCompuesto(String verbo) { 	
		if(verbo.endsWith("oner")) {
			_ner(verbo,"gerundioCompuesto");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = "habiendo " + verboF + "ido";
		}
		return conjugacionEspecial;
	}
}
