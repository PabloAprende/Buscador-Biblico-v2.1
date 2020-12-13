package Irregulares_ER;

import conjugadorDeVerbos.SegundaConjugaci�n_ER;

public final class IrregularSer extends SegundaConjugaci�n_ER {

	@Override
	public String presente_Indicativo(String verbo) {				
		String verboF = verbo.substring(0,verbo.length() - 3);
		conjugacionEspecial = verboF + "soy\n" + verboF + "eres\n" + verboF + "es\n" + verboF + "somos\n" + verboF + "sois\n" + verboF + "son";
		return conjugacionEspecial;	
	}

	@Override
	public String pret�ritoImperfecto_Indicativo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 3);
		conjugacionEspecial = verboF + "era\n" + verboF + "eras\n" + verboF + "era\n" + verboF + "�ramos\n" + verboF + "erais\n" + verboF + "eran";
		return conjugacionEspecial;
	}
	
	@Override
	public String pret�ritoPerfectoSimple_Indicativo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 3);
		conjugacionEspecial = verboF + "fui\n" + verboF + "fuiste\n" + verboF + "fue\n" + verboF + "fuimos\n" + verboF + "fuisteis\n" + verboF + "fueron";
		return conjugacionEspecial;
	}
	
	@Override
	public String imperativo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 1);
		conjugacionEspecial = verboF + "a\n" + verboF + "e\n" + verboF + "a\n" + verboF + "amos\n" + verboF + "ed\n" + verboF + "an";		
		return conjugacionEspecial;	
	}
	
	@Override
	public String presente_Subjuntivo(String verbo) {
		String verboF = verbo.substring(0, verbo.length() - 1);
		conjugacionEspecial = verboF + "a\n" + verboF + "as\n" + verboF + "a\n" + verboF + "amos\n" + verboF + "�is\n" + verboF + "an";	
		return conjugacionEspecial;
	}

	@Override
	public String futuro_Subjuntivo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 3);
		conjugacionEspecial = verboF + "fuere\n" + verboF + "fueres\n" + verboF + "fuere\n" + verboF + "fu�remos\n" + verboF + "fuereis\n" + verboF + "fueren";
		return conjugacionEspecial;	
	}

	@Override
	public String pret�ritoImperfecto_Subjuntivo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 3);
		conjugacionEspecial = verboF + "fuera\n" + verboF + "fueras\n" + verboF + "fuera\n" + verboF + "fu�ramos\n" + verboF + "fuerais\n" + verboF + "fueran";
		return conjugacionEspecial;	
	}

	@Override
	public String pret�ritoImperfecto2_Subjuntivo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 3);
		conjugacionEspecial = verboF + "fuese\n" + verboF + "fueses\n" + verboF + "fuese\n" + verboF + "fu�semos\n" + verboF + "fueseis\n" + verboF + "fuesen";
		return conjugacionEspecial;	
	}			
}
