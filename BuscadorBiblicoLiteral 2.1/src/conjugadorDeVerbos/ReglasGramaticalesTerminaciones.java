package conjugadorDeVerbos;

abstract class ReglasGramaticalesTerminaciones {	
	
	protected String conjugacionEspecial = "";
	
	protected void c_r(String verbo, Conjugaciones instancia, String tipoConjugacion) {
		if(instancia instanceof PrimeraConjugación_AR) {
			String verboF = verbo.substring(0,verbo.length() - 3);
			if(tipoConjugacion.equals("pretéritoPerfectoSimple_Indicativo")) {			
				conjugacionEspecial = verboF + "qué\n"; 
			} else if(tipoConjugacion.equals("imperativo")) {
				conjugacionEspecial = verboF + "que\n" + verboF + "ca\n" + verboF + "que\n" + verboF + "quemos\n" + verboF + "cad\n" + verboF + "quen"; 
			} else if(tipoConjugacion.equals("presente_Subjuntivo")) {
				conjugacionEspecial = verboF + "que\n" + verboF + "ques\n" + verboF + "que\n" + verboF + "quemos\n" + verboF + "quéis\n" + verboF + "quen";
			}
		} else if(instancia instanceof SegundaConjugación_ER) {
			String verboF = verbo.substring(0,verbo.length() - 3);
			if(tipoConjugacion.equals("presente_Indicativo")) {			
				conjugacionEspecial = verboF + "zco\n"; 
			} else if(tipoConjugacion.equals("imperativo")) {
				conjugacionEspecial = verboF + "zca\n" + verboF + "ca\n" + verboF + "zca\n" + verboF + "zcamos\n" + verboF + "ced\n" + verboF + "zcan"; 
			} else if(tipoConjugacion.equals("presente_Subjuntivo")) {
				conjugacionEspecial = verboF + "zca\n" + verboF + "zcas\n" + verboF + "zca\n" + verboF + "zcamos\n" + verboF + "zcáis\n" + verboF + "zcan";
			}
		} else if(instancia instanceof TerceraConjugación_IR) {
			String verboF = verbo.substring(0,verbo.length() - 3);
			if(tipoConjugacion.equals("presente_Indicativo")) {			
				conjugacionEspecial = verboF + "zco\n"; 
			} else if(tipoConjugacion.equals("pretéritoPerfectoSimple_Indicativo")) {			
				conjugacionEspecial = verboF + "je\n" + verboF + "jiste\n" + verboF + "jo\n" + verboF + "jimos\n" + verboF + "jisteid\n" + verboF + "jeron";  
			} else if(tipoConjugacion.equals("imperativo")) {
				conjugacionEspecial = verboF + "zca\n" + verboF + "ce\n" + verboF + "zca\n" + verboF + "zcamos\n" + verboF + "cid\n" + verboF + "zcan"; 
			} else if(tipoConjugacion.equals("presente_Subjuntivo")) {
				conjugacionEspecial = verboF + "zca\n" + verboF + "zcas\n" + verboF + "zca\n" + verboF + "zcamos\n" + verboF + "zcáis\n" + verboF + "zcan";
			} else if(tipoConjugacion.equals("futuro_Subjuntivo")) { 
				conjugacionEspecial = verboF + "jere\n" + verboF + "jeres\n" + verboF + "jere\n" + verboF + "jéremos\n" + verboF + "jereis\n" + verboF + "jeren";
			}  else if(tipoConjugacion.equals("pretéritoImperfecto_Subjuntivo")) { 
				conjugacionEspecial = verboF + "jera\n" + verboF + "jeras\n" + verboF + "jera\n" + verboF + "jéramos\n" + verboF + "jerais\n" + verboF + "jeran";
			} else if(tipoConjugacion.equals("pretéritoImperfecto2_Subjuntivo")) { 
				conjugacionEspecial = verboF + "jese\n" + verboF + "jeses\n" + verboF + "jese\n" + verboF + "jésemos\n" + verboF + "jeseis\n" + verboF + "jesen";
			} 
		}
	}
	
	protected void g_r(String verbo, Conjugaciones instancia, String tipoConjugacion) {
		if(instancia instanceof PrimeraConjugación_AR) {
			String verboF = verbo.substring(0,verbo.length() - 2);
			if(tipoConjugacion.equals("pretéritoPerfectoSimple_Indicativo")) {			
				conjugacionEspecial = verboF + "ué\n"; 
			} else if(tipoConjugacion.equals("imperativo")) {
				conjugacionEspecial = verboF + "ue\n" + verboF + "a\n" + verboF + "ue\n" + verboF + "uemos\n" + verboF + "ad\n" + verboF + "uen"; 
			} else if(tipoConjugacion.equals("presente_Subjuntivo")) {
				conjugacionEspecial = verboF + "ue\n" + verboF + "ues\n" + verboF + "ue\n" + verboF + "uemos\n" + verboF + "uéis\n" + verboF + "uen";
			}
		} else {
			String verboF = verbo.substring(0,verbo.length() - 3);
			String diferencia;
			if(instancia instanceof SegundaConjugación_ER) {
				diferencia = "ged\n";
			} else {
				diferencia = "gid\n";
			}
			if(tipoConjugacion.equals("presente_Indicativo")) {			
				conjugacionEspecial = verboF + "jo\n"; 
		    } else if(tipoConjugacion.equals("imperativo")) {
				conjugacionEspecial = verboF + "ja\n" + verboF + "ge\n" + verboF + "ja\n" + verboF + "jamos\n" + verboF + diferencia + verboF + "jan"; 
			} else if(tipoConjugacion.equals("presente_Subjuntivo")) {
				conjugacionEspecial = verboF + "ja\n" + verboF + "jas\n" + verboF + "ja\n" + verboF + "jamos\n" + verboF + "jáis\n" + verboF + "jan";
			}	
		}
	}
	
	protected void zar(String verbo, String tipoConjugacion) {
		String verboF = verbo.substring(0, verbo.length() - 3);
		if (tipoConjugacion.equals("pretéritoPerfectoSimple_Indicativo")) {
			conjugacionEspecial = verboF + "cé\n";
		} else if (tipoConjugacion.equals("imperativo")) {
			conjugacionEspecial = verboF + "ace\n" + verboF + "za\n" + verboF + "ce\n" + verboF + "cemos\n" + verboF + "zad\n" + verboF + "cen";
		} else if (tipoConjugacion.equals("presente_Subjuntivo")) {
			conjugacionEspecial = verboF + "ce\n" + verboF + "ces\n" + verboF + "ce\n" + verboF + "cemos\n" + verboF + "céis\n" + verboF + "cen";
		}

	}
	
	protected void ostar(String verbo, String tipoConjugacion) {
		String verboF = verbo.substring(0,verbo.length() - 5);
		if(tipoConjugacion.equals("presente_Indicativo")) { 			
			conjugacionEspecial = verboF + "uesto\n" + verboF + "uestas\n" + verboF + "uesta\n" + verboF + "ostamos\n" + verboF + "ostáis\n" + verboF + "uestan";
		} else if(tipoConjugacion.equals("imperativo")) { 
			conjugacionEspecial = verboF + "ueste\n" + verboF + "uesta\n" + verboF + "ueste\n" + verboF + "ostemos\n" + verboF + "ostad\n" + verboF + "uesten";
		} else if(tipoConjugacion.equals("presente_Subjuntivo")) { 
			conjugacionEspecial = verboF + "ueste\n" + verboF + "uestes\n" + verboF + "ueste\n" + verboF + "ostemos\n" + verboF + "ostéis\n" + verboF + "uesten";
		}
	}
	
	protected void aer(String verbo, String tipoConjugacion) {
		String verboF = verbo.substring(0,verbo.length() - 2);
		if(tipoConjugacion.equals("presente_Indicativo")) { 			
			conjugacionEspecial = verboF + "igo";
		} else if(tipoConjugacion.equals("pretéritoPerfectoSimple_Indicativo")) {			
			conjugacionEspecial = verboF + "je\n" + verboF + "jiste\n" + verboF + "jo\n" + verboF + "jimos\n" + verboF + "jisteis\n" + verboF + "jeron"; 
		} else if(tipoConjugacion.equals("imperativo")) { 
			conjugacionEspecial = verboF + "igo\n" + verboF + "e\n" + verboF + "iga\n" + verboF + "igamos\n" + verboF + "ed\n" + verboF + "gan";
		} else if(tipoConjugacion.equals("presente_Subjuntivo")) { 
			conjugacionEspecial = verboF + "iga\n" + verboF + "igas\n" + verboF + "iga\n" + verboF + "igamos\n" + verboF + "igáis\n" + verboF + "igan";
		} else if(tipoConjugacion.equals("futuro_Subjuntivo")) { 
			conjugacionEspecial = verboF + "jere\n" + verboF + "jeres\n" + verboF + "jere\n" + verboF + "jéremos\n" + verboF + "jereis\n" + verboF + "jeren";
		} else if(tipoConjugacion.equals("pretéritoImperfecto_Subjuntivo")) { 
			conjugacionEspecial = verboF + "jera\n" + verboF + "jeras\n" + verboF + "jera\n" + verboF + "jéramos\n" + verboF + "jerais\n" + verboF + "jeran";
		} else if(tipoConjugacion.equals("pretéritoImperfecto2_Subjuntivo")) { 
			conjugacionEspecial = verboF + "jese\n" + verboF + "jeses\n" + verboF + "jese\n" + verboF + "jésemos\n" + verboF + "jeseis\n" + verboF + "jesen";
		} else if(tipoConjugacion.equals("gerundio")) { 
			conjugacionEspecial = verboF + "yendo";
		}
	}		
	
	protected void _er(String verbo, String tipoConjugacion) {
		String verboF = verbo.substring(0,verbo.length() - 2);
		if(tipoConjugacion.equals("pretéritoPerfectoSimple_Indicativo")) {			
			conjugacionEspecial = verboF + "í\n" + verboF + "iste\n" + verboF + "yó\n" + verboF + "imos\n" + verboF + "isteis\n" + verboF + "yeron"; 
		} else if(tipoConjugacion.equals("futuro_Subjuntivo")) { 
			conjugacionEspecial = verboF + "yere\n" + verboF + "yeres\n" + verboF + "yere\n" + verboF + "yéremos\n" + verboF + "yereis\n" + verboF + "yeren";
		} else if(tipoConjugacion.equals("pretéritoImperfecto_Subjuntivo")) { 
			conjugacionEspecial = verboF + "yera\n" + verboF + "yeras\n" + verboF + "yera\n" + verboF + "yéramos\n" + verboF + "yerais\n" + verboF + "yeran";
		} else if(tipoConjugacion.equals("pretéritoImperfecto2_Subjuntivo")) { 
			conjugacionEspecial = verboF + "yese\n" + verboF + "yeses\n" + verboF + "yese\n" + verboF + "yésemos\n" + verboF + "yeseis\n" + verboF + "yesen";
		} else if(tipoConjugacion.equals("gerundio")) { 
			conjugacionEspecial = verboF + "yendo";
		}
	}
	
	protected void _ner(String verbo, String tipoConjugacion) { //ener o oner revisar
		String verboF = verbo.substring(0,verbo.length() - 4);
		String letraEspecial1="", letraEspecial2="";
		if(verbo.endsWith("ener")) {
			letraEspecial1 = "e";
			letraEspecial2 = "v";
		} else if (verbo.endsWith("oner")) {
			letraEspecial1 = "o";
			letraEspecial2 = "s";
			
			if(tipoConjugacion.equals("infinitivoCompuesto")) { 
				conjugacionEspecial = verboF + "uesto\n"; 
			} else if (tipoConjugacion.equals("pasadoParticipio")) { 
				conjugacionEspecial = verboF + "uesto\n"; 
			} else if(tipoConjugacion.equals("pretéritoPerfectoCompuesto_Indicativo")) {			
				conjugacionEspecial = "he " + verboF + "uesto\nhas " + verboF + "uesto\nha " + verboF + "uesto\nhemos " + verboF + "uesto\nhabéis " + verboF + "uesto\nhan " + verboF + "uesto";
			} else if(tipoConjugacion.equals("pretéritoPluscuamperfecto_Indicativo")) {			
				conjugacionEspecial = "había " + verboF + "uesto\nhabías " + verboF + "uesto\nhabía " + verboF + "uesto\nhabíamos " + verboF + "uesto\nhabíais " + verboF + "uesto\nhabían " + verboF + "uesto";
			} else if(tipoConjugacion.equals("pretéritoAnterior_Indicativo")) {			
				conjugacionEspecial = "hube " + verboF + "uesto\nhubiste " + verboF + "uesto\nhubo " + verboF + "uesto\nhubimos " + verboF + "uesto\nhubisteis " + verboF + "uesto\nhubieron " + verboF + "uesto";
			} else if(tipoConjugacion.equals("futuroPerfecto_Indicativo")) {			
				conjugacionEspecial = "habré " + verboF + "uesto\nhabrás " + verboF + "uesto\nhabrá " + verboF + "uesto\nhabremos " + verboF + "uesto\nhabréis " + verboF + "uesto\nhabrán " + verboF + "uesto";
			} else if(tipoConjugacion.equals("condicionalPerfecto_Indicativo")) {			
				conjugacionEspecial = "habría " + verboF + "uesto\nhabrías " + verboF + "uesto\nhabría " + verboF + "uesto\nhabríamos " + verboF + "uesto\nhabríais " + verboF + "uesto\nhabrían " + verboF + "uesto";
			} else if(tipoConjugacion.equals("pretéritoPerfecto_Subjuntivo")) {			
				conjugacionEspecial = "haya " + verboF + "uesto\nhayas " + verboF + "uesto\nhaya " + verboF + "uesto\nhayamos " + verboF + "uesto\nhayais " + verboF + "uesto\nhayan " + verboF + "uesto";
			} else if(tipoConjugacion.equals("pretéritoPluscuamperfecto_Subjuntivo")) {			
				conjugacionEspecial = "hubiera " + verboF + "uesto\nhubieras " + verboF + "uesto\nhubiera " + verboF + "uesto\nhubiéramos " + verboF + "uesto\nhubierais " + verboF + "uesto\nhubieran " + verboF + "uesto";
			} else if(tipoConjugacion.equals("pretéritoPluscuamperfecto2_Subjuntivo")) {			
				conjugacionEspecial = "hubiese " + verboF + "uesto\nhubieses " + verboF + "uesto\nhubiese " + verboF + "uesto\nhubiésemos " + verboF + "uesto\nhubieseis " + verboF + "uesto\nhubiesen " + verboF + "uesto";
			} else if(tipoConjugacion.equals("futuroPerfecto_Subjuntivo")) {			
				conjugacionEspecial = "hubiere " + verboF + "uesto\nhubieres " + verboF + "uesto\nhubiere " + verboF + "uesto\nhubiéremos " + verboF + "uesto\nhubiereis " + verboF + "uesto\nhubieren " + verboF + "uesto";
			} else if(tipoConjugacion.equals("gerundioCompuesto")) {			
				conjugacionEspecial = "habiendo " + verboF + "uesto";
			} 
		}
		
		if(tipoConjugacion.equals("presente_Indicativo")) { 			
			conjugacionEspecial = verboF + letraEspecial1 +"ngo\n"; 
		} else if(tipoConjugacion.equals("futuro_Indicativo")) { 			
			conjugacionEspecial = verboF + letraEspecial1 + "ndré\n" + verboF +  letraEspecial1 + "ndrás\n" + verboF +  letraEspecial1 + "ndrá\n" + verboF + letraEspecial1 + "ndremos\n" + verboF + letraEspecial1 + "ndréis\n" + verboF + letraEspecial1 + "ndrán"; 
		} else if(tipoConjugacion.equals("pretéritoPerfectoSimple_Indicativo")) {			
			conjugacionEspecial = verboF + "u" + letraEspecial2 +  "e\n" + verboF + "u" + letraEspecial2 + "iste\n" + verboF + "u" + letraEspecial2 + "o\n" + verboF + "u" + letraEspecial2 + "imos\n" + verboF + "u" + letraEspecial2 + "isteis\n" + verboF + "u" + letraEspecial2 + "ieron"; 
		} else if(tipoConjugacion.equals("condicional_Indicativo")) {			
			conjugacionEspecial = verbo + letraEspecial1 + "ndría\n" + verbo + letraEspecial1 + "ndrías\n" + verbo + letraEspecial1 + "ndría\n" + verbo + letraEspecial1 + "ndríamos\n" + verbo + letraEspecial1 + "ndríais\n" + verbo + letraEspecial1 + "ndrían";
		} else if(tipoConjugacion.equals("imperativo")) {			
			conjugacionEspecial = verbo +  letraEspecial1 + "nga\n" + verbo + letraEspecial1 + "n\n" + verbo + letraEspecial1 + "nga\n" + verbo + letraEspecial1 + "ngamos\n" + verbo + letraEspecial1 + "ned\n" + verbo + letraEspecial1 + "ngan";
		} else if(tipoConjugacion.equals("presente_Subjuntivo")) {			
			conjugacionEspecial = verbo + letraEspecial1 + "nga\n" + verbo + letraEspecial1 + "ngas\n" + verbo + letraEspecial1 + "nga\n" + verbo + letraEspecial1 + "ngamos\n" + verbo + letraEspecial1 + "ngáis\n" + verbo + letraEspecial1 + "ngan";
		} else if(tipoConjugacion.equals("futuro_Subjuntivo")) {			
			conjugacionEspecial = verbo + "u" + letraEspecial2 + "iere\n" + verbo + "u" + letraEspecial2 + "ieres\n" + verbo + "u" + letraEspecial2 + "iere\n" + verbo + "u" + letraEspecial2 + "iéremos\n" + verbo + "u" + letraEspecial2 + "iereis\n" + verbo + "u" + letraEspecial2 + "ieren";
		} else if(tipoConjugacion.equals("pretéritoImperfecto_Subjuntivo")) {			
			conjugacionEspecial = verbo + "u" + letraEspecial2 + "iera\n" + verbo + "u" + letraEspecial2 + "ieras\n" + verbo + "u" + letraEspecial2 + "iera\n" + verbo + "u" + letraEspecial2 + "iéramos\n" + verbo + "u" + letraEspecial2 + "ierais\n" + verbo + "u" + letraEspecial2 + "ieran";
		} else if(tipoConjugacion.equals("pretéritoImperfecto2_Subjuntivo")) {			
			conjugacionEspecial = verbo + "u" + letraEspecial2 + "iese\n" + verbo + "u" + letraEspecial2 + "ieses\n" + verbo + "u" + letraEspecial2 + "iese\n" + verbo + "u" + letraEspecial2 + "iésemos\n" + verbo + "u" + letraEspecial2 + "ieseis\n" + verbo + "u" + letraEspecial2 + "iesen";
		} 	
	}
	
	protected void eir(String verbo, String tipoConjugacion) { 
		String verboF = verbo.substring(0,verbo.length() - 3);
		if(tipoConjugacion.equals("presente_Indicativo")) { 			
			conjugacionEspecial = verboF + "ío\n" + verboF + "íes\n" + verboF + "íe\n" + verboF + "eímos\n" + verboF + "eís\n" + verboF + "íen"; 
		} else if(tipoConjugacion.equals("pretéritoPerfectoSimple_Indicativo")) {			
			conjugacionEspecial = verboF + "eí\n" + verboF + "eíste\n" + verboF + "io\n" + verboF + "eímos\n" + verboF + "eísteis\n" + verboF + "ieron"; 
		} else if(tipoConjugacion.equals("imperativo")) { 
			conjugacionEspecial = verboF + "ía\n" + verboF + "íe\n" + verboF + "ía\n" + verboF + "iamos\n" + verboF + "eíd\n" + verboF + "ían";
		} else if(tipoConjugacion.equals("presente_Subjuntivo")) { 
			conjugacionEspecial = verboF + "ía\n" + verboF + "ías\n" + verboF + "ía\n" + verboF + "iamos\n" + verboF + "iais\n" + verboF + "ían";
		} else if(tipoConjugacion.equals("futuro_Subjuntivo")) { 
			conjugacionEspecial = verboF + "iere\n" + verboF + "ieres\n" + verboF + "iere\n" + verboF + "iéremos\n" + verboF + "iereis\n" + verboF + "ieren";
		} else if(tipoConjugacion.equals("pretéritoImperfecto_Subjuntivo")) { 
			conjugacionEspecial = verboF + "iera\n" + verboF + "ieras\n" + verboF + "iera\n" + verboF + "iéramos\n" + verboF + "ierais\n" + verboF + "ieran";
		} else if(tipoConjugacion.equals("pretéritoImperfecto2_Subjuntivo")) { 
			conjugacionEspecial = verboF + "iese\n" + verboF + "ieses\n" + verboF + "iese\n" + verboF + "iésemos\n" + verboF + "ieseis\n" + verboF + "iesen";
		} else if(tipoConjugacion.equals("gerundio")) { 
			conjugacionEspecial = verboF + "iendo";
		}
	}
	
	protected void oir(String verbo, String tipoConjugacion) { 
		String verboF = verbo.substring(0,verbo.length() - 2);
		if(tipoConjugacion.equals("presente_Indicativo")) { 			
			conjugacionEspecial = verboF + "igo\n" + verboF + "yes\n" + verboF + "ye\n" + verboF + "ímos\n" + verboF + "ís\n" + verboF + "yen"; 
		} else if(tipoConjugacion.equals("pretéritoPerfectoSimple_Indicativo")) {			
			conjugacionEspecial = verboF + "í\n" + verboF + "íste\n" + verboF + "yó\n" + verboF + "ímos\n" + verboF + "ísteis\n" + verboF + "yeron"; 
		} else if(tipoConjugacion.equals("imperativo")) { 
			conjugacionEspecial = verboF + "iga\n" + verboF + "ye\n" + verboF + "iga\n" + verboF + "igamos\n" + verboF + "íd\n" + verboF + "igan";
		} else if(tipoConjugacion.equals("presente_Subjuntivo")) { 
			conjugacionEspecial = verboF + "iga\n" + verboF + "igas\n" + verboF + "iga\n" + verboF + "igamos\n" + verboF + "igáis\n" + verboF + "igan";
		} else if(tipoConjugacion.equals("futuro_Subjuntivo")) { 
			conjugacionEspecial = verboF + "yere\n" + verboF + "yeres\n" + verboF + "yere\n" + verboF + "yéremos\n" + verboF + "yereis\n" + verboF + "yeren";
		} else if(tipoConjugacion.equals("pretéritoImperfecto_Subjuntivo")) { 
			conjugacionEspecial = verboF + "yera\n" + verboF + "yeras\n" + verboF + "yera\n" + verboF + "yéramos\n" + verboF + "yerais\n" + verboF + "yeran";
		} else if(tipoConjugacion.equals("pretéritoImperfecto2_Subjuntivo")) { 
			conjugacionEspecial = verboF + "yese\n" + verboF + "yeses\n" + verboF + "yese\n" + verboF + "yésemos\n" + verboF + "yeseis\n" + verboF + "yesen";
		} else if(tipoConjugacion.equals("gerundio")) { 
			conjugacionEspecial = verboF + "yendo";
		}
	}
		
	protected void quir(String verbo, String tipoConjugacion) {
		String verboF = verbo.substring(0,verbo.length() - 4);
		if(tipoConjugacion.equals("presente_Indicativo")) { 			
			conjugacionEspecial = verboF + "co\n";
		}  else if(tipoConjugacion.equals("imperativo")) { 
			conjugacionEspecial = verboF + "ca\n" + verboF + "que\n" + verboF + "ca\n" + verboF + "camos\n" + verboF + "quid\n" + verboF + "can";
		} else if(tipoConjugacion.equals("presente_Subjuntivo")) { 
			conjugacionEspecial = verboF + "ca\n" + verboF + "cas\n" + verboF + "ca\n" + verboF + "camos\n" + verboF + "cáis\n" + verboF + "can";
		}
	}
}