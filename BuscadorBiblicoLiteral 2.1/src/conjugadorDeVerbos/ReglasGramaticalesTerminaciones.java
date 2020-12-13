package conjugadorDeVerbos;

abstract class ReglasGramaticalesTerminaciones {	
	
	protected String conjugacionEspecial = "";
	
	protected void c_r(String verbo, Conjugaciones instancia, String tipoConjugacion) {
		if(instancia instanceof PrimeraConjugaci�n_AR) {
			String verboF = verbo.substring(0,verbo.length() - 3);
			if(tipoConjugacion.equals("pret�ritoPerfectoSimple_Indicativo")) {			
				conjugacionEspecial = verboF + "qu�\n"; 
			} else if(tipoConjugacion.equals("imperativo")) {
				conjugacionEspecial = verboF + "que\n" + verboF + "ca\n" + verboF + "que\n" + verboF + "quemos\n" + verboF + "cad\n" + verboF + "quen"; 
			} else if(tipoConjugacion.equals("presente_Subjuntivo")) {
				conjugacionEspecial = verboF + "que\n" + verboF + "ques\n" + verboF + "que\n" + verboF + "quemos\n" + verboF + "qu�is\n" + verboF + "quen";
			}
		} else if(instancia instanceof SegundaConjugaci�n_ER) {
			String verboF = verbo.substring(0,verbo.length() - 3);
			if(tipoConjugacion.equals("presente_Indicativo")) {			
				conjugacionEspecial = verboF + "zco\n"; 
			} else if(tipoConjugacion.equals("imperativo")) {
				conjugacionEspecial = verboF + "zca\n" + verboF + "ca\n" + verboF + "zca\n" + verboF + "zcamos\n" + verboF + "ced\n" + verboF + "zcan"; 
			} else if(tipoConjugacion.equals("presente_Subjuntivo")) {
				conjugacionEspecial = verboF + "zca\n" + verboF + "zcas\n" + verboF + "zca\n" + verboF + "zcamos\n" + verboF + "zc�is\n" + verboF + "zcan";
			}
		} else if(instancia instanceof TerceraConjugaci�n_IR) {
			String verboF = verbo.substring(0,verbo.length() - 3);
			if(tipoConjugacion.equals("presente_Indicativo")) {			
				conjugacionEspecial = verboF + "zco\n"; 
			} else if(tipoConjugacion.equals("pret�ritoPerfectoSimple_Indicativo")) {			
				conjugacionEspecial = verboF + "je\n" + verboF + "jiste\n" + verboF + "jo\n" + verboF + "jimos\n" + verboF + "jisteid\n" + verboF + "jeron";  
			} else if(tipoConjugacion.equals("imperativo")) {
				conjugacionEspecial = verboF + "zca\n" + verboF + "ce\n" + verboF + "zca\n" + verboF + "zcamos\n" + verboF + "cid\n" + verboF + "zcan"; 
			} else if(tipoConjugacion.equals("presente_Subjuntivo")) {
				conjugacionEspecial = verboF + "zca\n" + verboF + "zcas\n" + verboF + "zca\n" + verboF + "zcamos\n" + verboF + "zc�is\n" + verboF + "zcan";
			} else if(tipoConjugacion.equals("futuro_Subjuntivo")) { 
				conjugacionEspecial = verboF + "jere\n" + verboF + "jeres\n" + verboF + "jere\n" + verboF + "j�remos\n" + verboF + "jereis\n" + verboF + "jeren";
			}  else if(tipoConjugacion.equals("pret�ritoImperfecto_Subjuntivo")) { 
				conjugacionEspecial = verboF + "jera\n" + verboF + "jeras\n" + verboF + "jera\n" + verboF + "j�ramos\n" + verboF + "jerais\n" + verboF + "jeran";
			} else if(tipoConjugacion.equals("pret�ritoImperfecto2_Subjuntivo")) { 
				conjugacionEspecial = verboF + "jese\n" + verboF + "jeses\n" + verboF + "jese\n" + verboF + "j�semos\n" + verboF + "jeseis\n" + verboF + "jesen";
			} 
		}
	}
	
	protected void g_r(String verbo, Conjugaciones instancia, String tipoConjugacion) {
		if(instancia instanceof PrimeraConjugaci�n_AR) {
			String verboF = verbo.substring(0,verbo.length() - 2);
			if(tipoConjugacion.equals("pret�ritoPerfectoSimple_Indicativo")) {			
				conjugacionEspecial = verboF + "u�\n"; 
			} else if(tipoConjugacion.equals("imperativo")) {
				conjugacionEspecial = verboF + "ue\n" + verboF + "a\n" + verboF + "ue\n" + verboF + "uemos\n" + verboF + "ad\n" + verboF + "uen"; 
			} else if(tipoConjugacion.equals("presente_Subjuntivo")) {
				conjugacionEspecial = verboF + "ue\n" + verboF + "ues\n" + verboF + "ue\n" + verboF + "uemos\n" + verboF + "u�is\n" + verboF + "uen";
			}
		} else {
			String verboF = verbo.substring(0,verbo.length() - 3);
			String diferencia;
			if(instancia instanceof SegundaConjugaci�n_ER) {
				diferencia = "ged\n";
			} else {
				diferencia = "gid\n";
			}
			if(tipoConjugacion.equals("presente_Indicativo")) {			
				conjugacionEspecial = verboF + "jo\n"; 
		    } else if(tipoConjugacion.equals("imperativo")) {
				conjugacionEspecial = verboF + "ja\n" + verboF + "ge\n" + verboF + "ja\n" + verboF + "jamos\n" + verboF + diferencia + verboF + "jan"; 
			} else if(tipoConjugacion.equals("presente_Subjuntivo")) {
				conjugacionEspecial = verboF + "ja\n" + verboF + "jas\n" + verboF + "ja\n" + verboF + "jamos\n" + verboF + "j�is\n" + verboF + "jan";
			}	
		}
	}
	
	protected void zar(String verbo, String tipoConjugacion) {
		String verboF = verbo.substring(0, verbo.length() - 3);
		if (tipoConjugacion.equals("pret�ritoPerfectoSimple_Indicativo")) {
			conjugacionEspecial = verboF + "c�\n";
		} else if (tipoConjugacion.equals("imperativo")) {
			conjugacionEspecial = verboF + "ace\n" + verboF + "za\n" + verboF + "ce\n" + verboF + "cemos\n" + verboF + "zad\n" + verboF + "cen";
		} else if (tipoConjugacion.equals("presente_Subjuntivo")) {
			conjugacionEspecial = verboF + "ce\n" + verboF + "ces\n" + verboF + "ce\n" + verboF + "cemos\n" + verboF + "c�is\n" + verboF + "cen";
		}

	}
	
	protected void ostar(String verbo, String tipoConjugacion) {
		String verboF = verbo.substring(0,verbo.length() - 5);
		if(tipoConjugacion.equals("presente_Indicativo")) { 			
			conjugacionEspecial = verboF + "uesto\n" + verboF + "uestas\n" + verboF + "uesta\n" + verboF + "ostamos\n" + verboF + "ost�is\n" + verboF + "uestan";
		} else if(tipoConjugacion.equals("imperativo")) { 
			conjugacionEspecial = verboF + "ueste\n" + verboF + "uesta\n" + verboF + "ueste\n" + verboF + "ostemos\n" + verboF + "ostad\n" + verboF + "uesten";
		} else if(tipoConjugacion.equals("presente_Subjuntivo")) { 
			conjugacionEspecial = verboF + "ueste\n" + verboF + "uestes\n" + verboF + "ueste\n" + verboF + "ostemos\n" + verboF + "ost�is\n" + verboF + "uesten";
		}
	}
	
	protected void aer(String verbo, String tipoConjugacion) {
		String verboF = verbo.substring(0,verbo.length() - 2);
		if(tipoConjugacion.equals("presente_Indicativo")) { 			
			conjugacionEspecial = verboF + "igo";
		} else if(tipoConjugacion.equals("pret�ritoPerfectoSimple_Indicativo")) {			
			conjugacionEspecial = verboF + "je\n" + verboF + "jiste\n" + verboF + "jo\n" + verboF + "jimos\n" + verboF + "jisteis\n" + verboF + "jeron"; 
		} else if(tipoConjugacion.equals("imperativo")) { 
			conjugacionEspecial = verboF + "igo\n" + verboF + "e\n" + verboF + "iga\n" + verboF + "igamos\n" + verboF + "ed\n" + verboF + "gan";
		} else if(tipoConjugacion.equals("presente_Subjuntivo")) { 
			conjugacionEspecial = verboF + "iga\n" + verboF + "igas\n" + verboF + "iga\n" + verboF + "igamos\n" + verboF + "ig�is\n" + verboF + "igan";
		} else if(tipoConjugacion.equals("futuro_Subjuntivo")) { 
			conjugacionEspecial = verboF + "jere\n" + verboF + "jeres\n" + verboF + "jere\n" + verboF + "j�remos\n" + verboF + "jereis\n" + verboF + "jeren";
		} else if(tipoConjugacion.equals("pret�ritoImperfecto_Subjuntivo")) { 
			conjugacionEspecial = verboF + "jera\n" + verboF + "jeras\n" + verboF + "jera\n" + verboF + "j�ramos\n" + verboF + "jerais\n" + verboF + "jeran";
		} else if(tipoConjugacion.equals("pret�ritoImperfecto2_Subjuntivo")) { 
			conjugacionEspecial = verboF + "jese\n" + verboF + "jeses\n" + verboF + "jese\n" + verboF + "j�semos\n" + verboF + "jeseis\n" + verboF + "jesen";
		} else if(tipoConjugacion.equals("gerundio")) { 
			conjugacionEspecial = verboF + "yendo";
		}
	}		
	
	protected void _er(String verbo, String tipoConjugacion) {
		String verboF = verbo.substring(0,verbo.length() - 2);
		if(tipoConjugacion.equals("pret�ritoPerfectoSimple_Indicativo")) {			
			conjugacionEspecial = verboF + "�\n" + verboF + "iste\n" + verboF + "y�\n" + verboF + "imos\n" + verboF + "isteis\n" + verboF + "yeron"; 
		} else if(tipoConjugacion.equals("futuro_Subjuntivo")) { 
			conjugacionEspecial = verboF + "yere\n" + verboF + "yeres\n" + verboF + "yere\n" + verboF + "y�remos\n" + verboF + "yereis\n" + verboF + "yeren";
		} else if(tipoConjugacion.equals("pret�ritoImperfecto_Subjuntivo")) { 
			conjugacionEspecial = verboF + "yera\n" + verboF + "yeras\n" + verboF + "yera\n" + verboF + "y�ramos\n" + verboF + "yerais\n" + verboF + "yeran";
		} else if(tipoConjugacion.equals("pret�ritoImperfecto2_Subjuntivo")) { 
			conjugacionEspecial = verboF + "yese\n" + verboF + "yeses\n" + verboF + "yese\n" + verboF + "y�semos\n" + verboF + "yeseis\n" + verboF + "yesen";
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
			} else if(tipoConjugacion.equals("pret�ritoPerfectoCompuesto_Indicativo")) {			
				conjugacionEspecial = "he " + verboF + "uesto\nhas " + verboF + "uesto\nha " + verboF + "uesto\nhemos " + verboF + "uesto\nhab�is " + verboF + "uesto\nhan " + verboF + "uesto";
			} else if(tipoConjugacion.equals("pret�ritoPluscuamperfecto_Indicativo")) {			
				conjugacionEspecial = "hab�a " + verboF + "uesto\nhab�as " + verboF + "uesto\nhab�a " + verboF + "uesto\nhab�amos " + verboF + "uesto\nhab�ais " + verboF + "uesto\nhab�an " + verboF + "uesto";
			} else if(tipoConjugacion.equals("pret�ritoAnterior_Indicativo")) {			
				conjugacionEspecial = "hube " + verboF + "uesto\nhubiste " + verboF + "uesto\nhubo " + verboF + "uesto\nhubimos " + verboF + "uesto\nhubisteis " + verboF + "uesto\nhubieron " + verboF + "uesto";
			} else if(tipoConjugacion.equals("futuroPerfecto_Indicativo")) {			
				conjugacionEspecial = "habr� " + verboF + "uesto\nhabr�s " + verboF + "uesto\nhabr� " + verboF + "uesto\nhabremos " + verboF + "uesto\nhabr�is " + verboF + "uesto\nhabr�n " + verboF + "uesto";
			} else if(tipoConjugacion.equals("condicionalPerfecto_Indicativo")) {			
				conjugacionEspecial = "habr�a " + verboF + "uesto\nhabr�as " + verboF + "uesto\nhabr�a " + verboF + "uesto\nhabr�amos " + verboF + "uesto\nhabr�ais " + verboF + "uesto\nhabr�an " + verboF + "uesto";
			} else if(tipoConjugacion.equals("pret�ritoPerfecto_Subjuntivo")) {			
				conjugacionEspecial = "haya " + verboF + "uesto\nhayas " + verboF + "uesto\nhaya " + verboF + "uesto\nhayamos " + verboF + "uesto\nhayais " + verboF + "uesto\nhayan " + verboF + "uesto";
			} else if(tipoConjugacion.equals("pret�ritoPluscuamperfecto_Subjuntivo")) {			
				conjugacionEspecial = "hubiera " + verboF + "uesto\nhubieras " + verboF + "uesto\nhubiera " + verboF + "uesto\nhubi�ramos " + verboF + "uesto\nhubierais " + verboF + "uesto\nhubieran " + verboF + "uesto";
			} else if(tipoConjugacion.equals("pret�ritoPluscuamperfecto2_Subjuntivo")) {			
				conjugacionEspecial = "hubiese " + verboF + "uesto\nhubieses " + verboF + "uesto\nhubiese " + verboF + "uesto\nhubi�semos " + verboF + "uesto\nhubieseis " + verboF + "uesto\nhubiesen " + verboF + "uesto";
			} else if(tipoConjugacion.equals("futuroPerfecto_Subjuntivo")) {			
				conjugacionEspecial = "hubiere " + verboF + "uesto\nhubieres " + verboF + "uesto\nhubiere " + verboF + "uesto\nhubi�remos " + verboF + "uesto\nhubiereis " + verboF + "uesto\nhubieren " + verboF + "uesto";
			} else if(tipoConjugacion.equals("gerundioCompuesto")) {			
				conjugacionEspecial = "habiendo " + verboF + "uesto";
			} 
		}
		
		if(tipoConjugacion.equals("presente_Indicativo")) { 			
			conjugacionEspecial = verboF + letraEspecial1 +"ngo\n"; 
		} else if(tipoConjugacion.equals("futuro_Indicativo")) { 			
			conjugacionEspecial = verboF + letraEspecial1 + "ndr�\n" + verboF +  letraEspecial1 + "ndr�s\n" + verboF +  letraEspecial1 + "ndr�\n" + verboF + letraEspecial1 + "ndremos\n" + verboF + letraEspecial1 + "ndr�is\n" + verboF + letraEspecial1 + "ndr�n"; 
		} else if(tipoConjugacion.equals("pret�ritoPerfectoSimple_Indicativo")) {			
			conjugacionEspecial = verboF + "u" + letraEspecial2 +  "e\n" + verboF + "u" + letraEspecial2 + "iste\n" + verboF + "u" + letraEspecial2 + "o\n" + verboF + "u" + letraEspecial2 + "imos\n" + verboF + "u" + letraEspecial2 + "isteis\n" + verboF + "u" + letraEspecial2 + "ieron"; 
		} else if(tipoConjugacion.equals("condicional_Indicativo")) {			
			conjugacionEspecial = verbo + letraEspecial1 + "ndr�a\n" + verbo + letraEspecial1 + "ndr�as\n" + verbo + letraEspecial1 + "ndr�a\n" + verbo + letraEspecial1 + "ndr�amos\n" + verbo + letraEspecial1 + "ndr�ais\n" + verbo + letraEspecial1 + "ndr�an";
		} else if(tipoConjugacion.equals("imperativo")) {			
			conjugacionEspecial = verbo +  letraEspecial1 + "nga\n" + verbo + letraEspecial1 + "n\n" + verbo + letraEspecial1 + "nga\n" + verbo + letraEspecial1 + "ngamos\n" + verbo + letraEspecial1 + "ned\n" + verbo + letraEspecial1 + "ngan";
		} else if(tipoConjugacion.equals("presente_Subjuntivo")) {			
			conjugacionEspecial = verbo + letraEspecial1 + "nga\n" + verbo + letraEspecial1 + "ngas\n" + verbo + letraEspecial1 + "nga\n" + verbo + letraEspecial1 + "ngamos\n" + verbo + letraEspecial1 + "ng�is\n" + verbo + letraEspecial1 + "ngan";
		} else if(tipoConjugacion.equals("futuro_Subjuntivo")) {			
			conjugacionEspecial = verbo + "u" + letraEspecial2 + "iere\n" + verbo + "u" + letraEspecial2 + "ieres\n" + verbo + "u" + letraEspecial2 + "iere\n" + verbo + "u" + letraEspecial2 + "i�remos\n" + verbo + "u" + letraEspecial2 + "iereis\n" + verbo + "u" + letraEspecial2 + "ieren";
		} else if(tipoConjugacion.equals("pret�ritoImperfecto_Subjuntivo")) {			
			conjugacionEspecial = verbo + "u" + letraEspecial2 + "iera\n" + verbo + "u" + letraEspecial2 + "ieras\n" + verbo + "u" + letraEspecial2 + "iera\n" + verbo + "u" + letraEspecial2 + "i�ramos\n" + verbo + "u" + letraEspecial2 + "ierais\n" + verbo + "u" + letraEspecial2 + "ieran";
		} else if(tipoConjugacion.equals("pret�ritoImperfecto2_Subjuntivo")) {			
			conjugacionEspecial = verbo + "u" + letraEspecial2 + "iese\n" + verbo + "u" + letraEspecial2 + "ieses\n" + verbo + "u" + letraEspecial2 + "iese\n" + verbo + "u" + letraEspecial2 + "i�semos\n" + verbo + "u" + letraEspecial2 + "ieseis\n" + verbo + "u" + letraEspecial2 + "iesen";
		} 	
	}
	
	protected void eir(String verbo, String tipoConjugacion) { 
		String verboF = verbo.substring(0,verbo.length() - 3);
		if(tipoConjugacion.equals("presente_Indicativo")) { 			
			conjugacionEspecial = verboF + "�o\n" + verboF + "�es\n" + verboF + "�e\n" + verboF + "e�mos\n" + verboF + "e�s\n" + verboF + "�en"; 
		} else if(tipoConjugacion.equals("pret�ritoPerfectoSimple_Indicativo")) {			
			conjugacionEspecial = verboF + "e�\n" + verboF + "e�ste\n" + verboF + "io\n" + verboF + "e�mos\n" + verboF + "e�steis\n" + verboF + "ieron"; 
		} else if(tipoConjugacion.equals("imperativo")) { 
			conjugacionEspecial = verboF + "�a\n" + verboF + "�e\n" + verboF + "�a\n" + verboF + "iamos\n" + verboF + "e�d\n" + verboF + "�an";
		} else if(tipoConjugacion.equals("presente_Subjuntivo")) { 
			conjugacionEspecial = verboF + "�a\n" + verboF + "�as\n" + verboF + "�a\n" + verboF + "iamos\n" + verboF + "iais\n" + verboF + "�an";
		} else if(tipoConjugacion.equals("futuro_Subjuntivo")) { 
			conjugacionEspecial = verboF + "iere\n" + verboF + "ieres\n" + verboF + "iere\n" + verboF + "i�remos\n" + verboF + "iereis\n" + verboF + "ieren";
		} else if(tipoConjugacion.equals("pret�ritoImperfecto_Subjuntivo")) { 
			conjugacionEspecial = verboF + "iera\n" + verboF + "ieras\n" + verboF + "iera\n" + verboF + "i�ramos\n" + verboF + "ierais\n" + verboF + "ieran";
		} else if(tipoConjugacion.equals("pret�ritoImperfecto2_Subjuntivo")) { 
			conjugacionEspecial = verboF + "iese\n" + verboF + "ieses\n" + verboF + "iese\n" + verboF + "i�semos\n" + verboF + "ieseis\n" + verboF + "iesen";
		} else if(tipoConjugacion.equals("gerundio")) { 
			conjugacionEspecial = verboF + "iendo";
		}
	}
	
	protected void oir(String verbo, String tipoConjugacion) { 
		String verboF = verbo.substring(0,verbo.length() - 2);
		if(tipoConjugacion.equals("presente_Indicativo")) { 			
			conjugacionEspecial = verboF + "igo\n" + verboF + "yes\n" + verboF + "ye\n" + verboF + "�mos\n" + verboF + "�s\n" + verboF + "yen"; 
		} else if(tipoConjugacion.equals("pret�ritoPerfectoSimple_Indicativo")) {			
			conjugacionEspecial = verboF + "�\n" + verboF + "�ste\n" + verboF + "y�\n" + verboF + "�mos\n" + verboF + "�steis\n" + verboF + "yeron"; 
		} else if(tipoConjugacion.equals("imperativo")) { 
			conjugacionEspecial = verboF + "iga\n" + verboF + "ye\n" + verboF + "iga\n" + verboF + "igamos\n" + verboF + "�d\n" + verboF + "igan";
		} else if(tipoConjugacion.equals("presente_Subjuntivo")) { 
			conjugacionEspecial = verboF + "iga\n" + verboF + "igas\n" + verboF + "iga\n" + verboF + "igamos\n" + verboF + "ig�is\n" + verboF + "igan";
		} else if(tipoConjugacion.equals("futuro_Subjuntivo")) { 
			conjugacionEspecial = verboF + "yere\n" + verboF + "yeres\n" + verboF + "yere\n" + verboF + "y�remos\n" + verboF + "yereis\n" + verboF + "yeren";
		} else if(tipoConjugacion.equals("pret�ritoImperfecto_Subjuntivo")) { 
			conjugacionEspecial = verboF + "yera\n" + verboF + "yeras\n" + verboF + "yera\n" + verboF + "y�ramos\n" + verboF + "yerais\n" + verboF + "yeran";
		} else if(tipoConjugacion.equals("pret�ritoImperfecto2_Subjuntivo")) { 
			conjugacionEspecial = verboF + "yese\n" + verboF + "yeses\n" + verboF + "yese\n" + verboF + "y�semos\n" + verboF + "yeseis\n" + verboF + "yesen";
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
			conjugacionEspecial = verboF + "ca\n" + verboF + "cas\n" + verboF + "ca\n" + verboF + "camos\n" + verboF + "c�is\n" + verboF + "can";
		}
	}
}