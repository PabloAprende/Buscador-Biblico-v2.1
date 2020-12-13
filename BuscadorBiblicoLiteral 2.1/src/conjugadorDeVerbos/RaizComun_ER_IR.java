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
			conjugacionEspecial = verbo + "é\n" + verbo + "ás\n" + verbo + "á\n" + verbo + "emos\n" + verbo + "éis\n" + verbo + "án";
		}
		return conjugacionEspecial;	
	}
	
	@Override
	public String pretéritoImperfecto_Indicativo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = verboF + "ía\n" + verboF + "ías\n" + verboF + "ía\n" + verboF + "íamos\n" + verboF + "íais\n" + verboF + "ían";
		return conjugacionEspecial;
	}
	
	@Override 
	public String pretéritoPerfectoCompuesto_Indicativo(String verbo) {
		if(verbo.endsWith("oner")) {
			_ner(verbo,"pretéritoPerfectoCompuesto_Indicativo");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = "he " + verboF + "ido\nhas " + verboF + "ido\nha " + verboF + "ido\nhemos " + verboF + "ido\nhabéis " + verboF + "ido\nhan " + verboF + "ido";
		}
		return conjugacionEspecial;	
	}

	@Override
	public String pretéritoPluscuamperfecto_Indicativo(String verbo) {
		if(verbo.endsWith("oner")) {
			_ner(verbo,"pretéritoPluscuamperfecto_Indicativo");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = "había " + verboF + "ido\nhabías " + verboF + "ido\nhabía " + verboF + "ido\nhabíamos " + verboF + "ido\nhabíais " + verboF + "ido\nhabían " + verboF + "ido";
		}	
		return conjugacionEspecial;	
	}

	@Override
	public String pretéritoAnterior_Indicativo(String verbo) {
		if(verbo.endsWith("oner")) {
			_ner(verbo,"pretéritoAnterior_Indicativo");
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
			conjugacionEspecial = "habré " + verboF + "ido\nhabrás " + verboF + "ido\nhabrá " + verboF + "ido\nhabremos " + verboF + "ido\nhabréis " + verboF + "ido\nhabrán " + verboF + "ido";
		}
		return conjugacionEspecial;		
	}

	@Override
	public String condicionalPerfecto_Indicativo(String verbo) {
		if(verbo.endsWith("oner")) {
			_ner(verbo,"condicionalPerfecto_Indicativo");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = "habría " + verboF + "ido\nhabrías " + verboF + "ido\nhabría " + verboF + "ido\nhabríamos " + verboF + "ido\nhabríais " + verboF + "ido\nhabrían " + verboF + "ido";
		}
		return conjugacionEspecial;		
	}

	@Override 
	public String condicional_Indicativo(String verbo) {
		if(verbo.endsWith("ener") || verbo.endsWith("oner")) {
			_ner(verbo,"condicional_Indicativo");
		} else {
			conjugacionEspecial = verbo + "ía\n" + verbo + "ías\n" + verbo + "ía\n" + verbo + "íamos\n" + verbo + "íais\n" + verbo + "ían";
		}
		return conjugacionEspecial;	
	}

	@Override
	public String pretéritoPerfecto_Subjuntivo(String verbo) {
		if(verbo.endsWith("oner")) {
			_ner(verbo,"pretéritoPerfecto_Subjuntivo");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = "haya " + verboF + "ido\nhayas " + verboF + "ido\nhaya " + verboF + "ido\nhayamos " + verboF + "ido\nhayáis " + verboF + "ido\nhayan " + verboF + "ido";
		}
		return conjugacionEspecial;		
	}

	@Override
	public String pretéritoPluscuamperfecto_Subjuntivo(String verbo) { 		                                                                                                                                                               
		if(verbo.endsWith("oner")) {
			_ner(verbo,"pretéritoPluscuamperfecto_Subjuntivo");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = "hubiera " + verboF + "ido\nhubieras " + verboF + "ido\nhubiera " + verboF + "ido\nhubiéramos " + verboF + "ido\nhubierais " + verboF + "ido\nhubieran " + verboF + "ido";
		}	
		return conjugacionEspecial;		
	}
	
	@Override
	public String pretéritoPluscuamperfecto2_Subjuntivo(String verbo) { 		                                                                                         
		if(verbo.endsWith("oner")) {
			_ner(verbo,"pretéritoPluscuamperfecto2_Subjuntivo");
		} else {
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = "hubiese " + verboF + "ido\nhubieses " + verboF + "ido\nhubiese " + verboF + "ido\nhubiésemos " + verboF + "ido\nhubieseis " + verboF + "ido\nhubiesen " + verboF + "ido";
		}
		return conjugacionEspecial;		
	}
	
	@Override
	public String futuroPerfecto_Subjuntivo(String verbo) { 		                                                                                   
		if(verbo.endsWith("oner")) {
			_ner(verbo,"futuroPerfecto_Subjuntivo");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = "hubiere " + verboF + "ido\nhubieres " + verboF + "ido\nhubiere " + verboF + "ido\nhubiéremos " + verboF + "ido\nhubiereis " + verboF + "ido\nhubieren " + verboF + "ido";
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
