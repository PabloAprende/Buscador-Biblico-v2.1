package conjugadorDeVerbos;

public class TerceraConjugaci�n_IR extends RaizComun_ER_IR implements Conjugaciones{

	@Override
	public String presente_Indicativo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 2);
		if(verbo.endsWith("eir")) {
			eir(verbo,"presente_Indicativo");
		} else if(verbo.endsWith("oir")) {
			oir(verbo,"presente_Indicativo");
		} else {
			if(verbo.endsWith("cir")) {
				c_r(verbo,this,"presente_Indicativo");
			} else if(verbo.endsWith("gir")) {
				g_r(verbo,this,"presente_Indicativo");
			} else if(verbo.endsWith("quir")) {
				quir(verbo,"presente_Indicativo");
			} else {
				conjugacionEspecial = verboF + "o\n";
			}
			conjugacionEspecial += verboF + "es\n" + verboF + "e\n" + verboF + "imos\n" + verboF + "�s\n" + verboF + "en";	
		}		
		return conjugacionEspecial;
	}	

	@Override //igual 
	public String pret�ritoPerfectoSimple_Indicativo(String verbo) {
		if(verbo.endsWith("cir")) {
			c_r(verbo,this,"pret�ritoPerfectoSimple_Indicativo");
		} else if(verbo.endsWith("eir")) {
			eir(verbo,"pret�ritoPerfectoSimple_Indicativo");
		} else if(verbo.endsWith("oir")) {
			oir(verbo,"pret�ritoPerfectoSimple_Indicativo");
		} else {
			String verboF = verbo.substring(0, verbo.length() - 2);
			conjugacionEspecial = verboF + "�\n" + verboF + "iste\n" + verboF + "i�\n" + verboF + "imos\n" + verboF + "isteis\n" + verboF + "ieron";	
		}
		return conjugacionEspecial;
	}
	
	@Override 
	public String imperativo(String verbo) {				
		if (verbo.endsWith("cir")) {
			c_r(verbo,this,"imperativo");
		} else if (verbo.endsWith("gir")) {
			g_r(verbo, this, "imperativo");
		} else if (verbo.endsWith("eir")) {
			eir(verbo, "imperativo");
		} else if (verbo.endsWith("oir")) {
			oir(verbo, "imperativo");
		} else if (verbo.endsWith("quir")) {
			quir(verbo, "imperativo");
		} else {
			String verboF = verbo.substring(0, verbo.length() - 2);	
			conjugacionEspecial = verboF + "a\n" + verboF + "e\n" + verboF + "a\n" + verboF + "amos\n" + verboF + "id\n" + verboF + "an";	
		}		
		return conjugacionEspecial;
	}

	@Override //igual 
	public String presente_Subjuntivo(String verbo) {
		if (verbo.endsWith("cir")) {
			c_r(verbo, this, "presente_Subjuntivo");
		} else if (verbo.endsWith("gir")) {
			g_r(verbo, this, "presente_Subjuntivo");
		} else if (verbo.endsWith("eir")) {
			eir(verbo, "presente_Subjuntivo");
		} else if (verbo.endsWith("oir")) {
			oir(verbo, "presente_Subjuntivo");
		} else if (verbo.endsWith("quir")) {
			quir(verbo, "presente_Subjuntivo");
		} else {
			String verboF = verbo.substring(0, verbo.length() - 2);
			conjugacionEspecial = verboF + "a\n" + verboF + "as\n" + verboF + "a\n" + verboF + "amos\n" + verboF + "�is\n" + verboF + "an";		
		}
		return conjugacionEspecial;
	}
	
	@Override  //igual 
	public String futuro_Subjuntivo(String verbo) {
		if (verbo.endsWith("cir")) {
			c_r(verbo, this, "futuro_Subjuntivo");
		} else if (verbo.endsWith("eir")) {
			eir(verbo, "futuro_Subjuntivo");
		} else if (verbo.endsWith("oir")) {
			oir(verbo, "futuro_Subjuntivo");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = verboF + "iere\n" + verboF + "ieres\n" + verboF + "iere\n" + verboF + "i�remos\n" + verboF + "iereis\n" + verboF + "ieren";	
		}
		return conjugacionEspecial;	
	}

	@Override //igual
	public String pret�ritoImperfecto_Subjuntivo(String verbo) {
		if (verbo.endsWith("cir")) {
			c_r(verbo, this, "pret�ritoImperfecto_Subjuntivo");
		} else if (verbo.endsWith("eir")) {
			eir(verbo, "pret�ritoImperfecto_Subjuntivo");
		} else if (verbo.endsWith("oir")) {
			oir(verbo, "pret�ritoImperfecto_Subjuntivo");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = verboF + "iera\n" + verboF + "ieras\n" + verboF + "iera\n" + verboF + "i�ramos\n" + verboF + "ierais\n" + verboF + "ieran";
		}
		return conjugacionEspecial;	
	}

	@Override  //igual 
	public String pret�ritoImperfecto2_Subjuntivo(String verbo) {
		if (verbo.endsWith("cir")) {
			c_r(verbo, this, "pret�ritoImperfecto2_Subjuntivo");
		} else if (verbo.endsWith("eir")) {
			eir(verbo, "pret�ritoImperfecto2_Subjuntivo");
		} else if (verbo.endsWith("oir")) {
			oir(verbo, "pret�ritoImperfecto2_Subjuntivo");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = verboF + "iese\n" + verboF + "ieses\n" + verboF + "iese\n" + verboF + "i�semos\n" + verboF + "ieseis\n" + verboF + "iesen";
		}
		return conjugacionEspecial;		
	}
	
	@Override //igual 
	public String gerundio(String verbo) {
		if (verbo.endsWith("eir")) {
			eir(verbo, "gerundio");
		} else if (verbo.endsWith("oir")) {
			oir(verbo, "gerundio");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = verboF + "iendo";
		}
		return conjugacionEspecial;
	}
}
