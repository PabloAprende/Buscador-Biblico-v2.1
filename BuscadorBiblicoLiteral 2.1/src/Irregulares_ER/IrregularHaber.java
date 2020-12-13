package Irregulares_ER;

import conjugadorDeVerbos.SegundaConjugaci�n_ER;

public final class IrregularHaber extends SegundaConjugaci�n_ER {
	
	@Override
	public String presente_Indicativo(String verbo) {				
		String verboF = verbo.substring(0,verbo.length() - 4);
		conjugacionEspecial = verboF + "e\n" + verboF + "as\n" + verboF + "a\n" + verboF + "emos\n" + verboF + "ab�is\n" + verboF + "an";
		return conjugacionEspecial;	
	}

	@Override
	public String pret�ritoPerfectoSimple_Indicativo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 4);
		conjugacionEspecial = verboF + "ube\n" + verboF + "ubiste\n" + verboF + "ubo\n" + verboF + "ubimos\n" + verboF + "ubisteis\n" + verboF + "ubieron";
		return conjugacionEspecial;
	}
	
	@Override
	public String condicional_Indicativo(String verbo) {	
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = verboF + "r�a\n" + verboF + "r�as\n" + verboF + "r�a\n" + verboF + "r�amos\n" + verboF + "r�ais\n" + verboF + "r�an";
		return conjugacionEspecial;		
	}
	
	@Override
	public String imperativo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 4);
		conjugacionEspecial = verboF + "aya\n" + verboF + "e\n" + verboF + "aya\n" + verboF + "ayamos\n" + verboF + "abed\n" + verboF + "ayan";
		return conjugacionEspecial;	
	}
	
	@Override
	public String presente_Subjuntivo(String verbo) {
		String verboF = verbo.substring(0, verbo.length() - 3);
		conjugacionEspecial = verboF + "ya\n" + verboF + "yas\n" + verboF + "ya\n" + verboF + "yamos\n" + verboF + "y�is\n" + verboF + "yan";	
		return conjugacionEspecial;
	}

	@Override
	public String futuro_Subjuntivo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 4);
		conjugacionEspecial = verboF + "ubiere\n" + verboF + "ubieres\n" + verboF + "ubiere\n" + verboF + "ubi�remos\n" + verboF + "ubiereis\n" + verboF + "ubieren";
		return conjugacionEspecial;	
	}

	@Override
	public String pret�ritoImperfecto_Subjuntivo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 4);
		conjugacionEspecial = verboF + "ubiera\n" + verboF + "ubieras\n" + verboF + "ubiera\n" + verboF + "ubi�ramos\n" + verboF + "ubierais\n" + verboF + "ubieran";
		return conjugacionEspecial;	
	}

	@Override
	public String pret�ritoImperfecto2_Subjuntivo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 4);
		conjugacionEspecial = verboF + "ubiese\n" + verboF + "ubieses\n" + verboF + "ubiese\n" + verboF + "ubi�semos\n" + verboF + "ubieseis\n" + verboF + "ubiesen";
		return conjugacionEspecial;	
	}				
}
