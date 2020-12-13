package conjugadorDeVerbos;

public class SegundaConjugaci�n_ER extends RaizComun_ER_IR implements Conjugaciones{
	
	@Override
	public String presente_Indicativo(String verbo) {		
		String verboF = verbo.substring(0,verbo.length() - 2);
		if(verbo.endsWith("ger")) {
			g_r(verbo,this,"presente_Indicativo");
		} else if(verbo.endsWith("aer")) {
			aer(verbo,"presente_Indicativo");
		} else if(verbo.endsWith("ener") || verbo.endsWith("oner")) {
			_ner(verbo,"presente_Indicativo");
		} else {
			conjugacionEspecial = verboF + "o\n";
		}
		conjugacionEspecial += verboF + "es\n" + verboF + "e\n" + verboF + "emos\n" + verboF + "�is\n" + verboF + "en";
		return conjugacionEspecial;	
	}

	@Override
	public String pret�ritoPerfectoSimple_Indicativo(String verbo) {
		String verboF = verbo.substring(0, verbo.length() - 2);
		if (verbo.endsWith("cer")) {
			c_r(verbo,this,"pret�ritoPerfectoSimple_Indicativo");
		} else if (verbo.endsWith("aer")) {
			aer(verbo,"pret�ritoPerfectoSimple_Indicativo");
		} else if (verbo.endsWith("eer") || verbo.endsWith("oer")) {
			_er(verbo,"pret�ritoPerfectoSimple_Indicativo");
		} else if(verbo.endsWith("ener") || verbo.endsWith("oner")) {
			_ner(verbo,"pret�ritoPerfectoSimple_Indicativo");
		} else {
			conjugacionEspecial = verboF + "�\n";
		}
		conjugacionEspecial += verboF + "iste\n" + verboF + "io\n" + verboF + "imos\n" + verboF + "isteis\n" + verboF + "ieron";
		return conjugacionEspecial;
	}
	
	@Override
	public String imperativo(String verbo) {
		if (verbo.endsWith("cer")) {
			c_r(verbo, this, "imperativo");
		} else if (verbo.endsWith("ger")) {
			g_r(verbo,this,"imperativo");
		} else if (verbo.endsWith("aer")) {
			aer(verbo,"imperativo");
		} else if(verbo.endsWith("ener") || verbo.endsWith("oner")) {
			_ner(verbo,"imperativo");
		} else {
			String verboF = verbo.substring(0, verbo.length() - 2);			
			conjugacionEspecial = verboF + "a\n" + verboF + "e\n" + verboF + "a\n" + verboF + "amos\n" + verboF + "ed\n" + verboF + "an";		
		}
		return conjugacionEspecial;	
	}
	
	@Override
	public String presente_Subjuntivo(String verbo) {
		if (verbo.endsWith("cer")) {
			c_r(verbo, this, "presente_Subjuntivo");
		} else if(verbo.endsWith("ger")) {
			g_r(verbo, this, "presente_Subjuntivo");
		} else if(verbo.endsWith("aer")) {
			aer(verbo, "presente_Subjuntivo");
		} else if(verbo.endsWith("ener") || verbo.endsWith("oner")) {
			_ner(verbo,"presente_Subjuntivo");
		} else {
			String verboF = verbo.substring(0, verbo.length() - 2);
			conjugacionEspecial = verboF + "a\n" + verboF + "as\n" + verboF + "a\n" + verboF + "amos\n" + verboF + "�is\n" + verboF + "an";	
		}
		return conjugacionEspecial;
	}

	@Override
	public String futuro_Subjuntivo(String verbo) {
		if(verbo.endsWith("aer")) {
			aer(verbo, "futuro_Subjuntivo");
		} else if(verbo.endsWith("eer") || verbo.endsWith("oer")) {
			_er(verbo, "futuro_Subjuntivo");
		} else if(verbo.endsWith("ener") || verbo.endsWith("oner")) {
			_ner(verbo,"futuro_Subjuntivo");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = verboF + "iere\n" + verboF + "ieres\n" + verboF + "iere\n" + verboF + "i�remos\n" + verboF + "iereis\n" + verboF + "ieren";
		}
		return conjugacionEspecial;	
	}

	@Override
	public String pret�ritoImperfecto_Subjuntivo(String verbo) {
		if(verbo.endsWith("aer")) {
			aer(verbo, "pret�ritoImperfecto_Subjuntivo");
		} else if(verbo.endsWith("eer") || verbo.endsWith("oer")) {
			_er(verbo, "pret�ritoImperfecto_Subjuntivo");
		} else if(verbo.endsWith("ener") || verbo.endsWith("oner")) {
			_ner(verbo,"pret�ritoImperfecto_Subjuntivo");
		}  else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = verboF + "iera\n" + verboF + "ieras\n" + verboF + "iera\n" + verboF + "i�ramos\n" + verboF + "ierais\n" + verboF + "ieran";
		}
		return conjugacionEspecial;	
	}

	@Override
	public String pret�ritoImperfecto2_Subjuntivo(String verbo) {
		if(verbo.endsWith("aer")) {
			aer(verbo, "pret�ritoImperfecto2_Subjuntivo");
		} else if(verbo.endsWith("eer") || verbo.endsWith("oer")) {
			_er(verbo, "pret�ritoImperfecto2_Subjuntivo");
		} else if(verbo.endsWith("ener") || verbo.endsWith("oner")) {
			_ner(verbo,"pret�ritoImperfecto2_Subjuntivo");
		} else {
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = verboF + "iese\n" + verboF + "ieses\n" + verboF + "iese\n" + verboF + "i�semos\n" + verboF + "ieseis\n" + verboF + "iesen";
		}
		return conjugacionEspecial;	
	}			

	@Override
	public String gerundio(String verbo) { 	
		if(verbo.endsWith("aer")) {
			aer(verbo, "gerundio");
		} else if(verbo.endsWith("eer") || verbo.endsWith("oer")) {
			_er(verbo, "gerundio");
		}  else {		
			String verboF = verbo.substring(0,verbo.length() - 2);
			conjugacionEspecial = verboF + "iendo";
		}
		return conjugacionEspecial;
	}
}
