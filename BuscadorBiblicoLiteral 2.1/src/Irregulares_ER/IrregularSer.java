package Irregulares_ER;

import conjugadorDeVerbos.SegundaConjugación_ER;

public final class IrregularSer extends SegundaConjugación_ER {

	@Override
	public String presente_Indicativo(String verbo) {				
		String verboF = verbo.substring(0,verbo.length() - 3);
		conjugacionEspecial = verboF + "soy\n" + verboF + "eres\n" + verboF + "es\n" + verboF + "somos\n" + verboF + "sois\n" + verboF + "son";
		return conjugacionEspecial;	
	}

	@Override
	public String pretéritoImperfecto_Indicativo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 3);
		conjugacionEspecial = verboF + "era\n" + verboF + "eras\n" + verboF + "era\n" + verboF + "éramos\n" + verboF + "erais\n" + verboF + "eran";
		return conjugacionEspecial;
	}
	
	@Override
	public String pretéritoPerfectoSimple_Indicativo(String verbo) {
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
		conjugacionEspecial = verboF + "a\n" + verboF + "as\n" + verboF + "a\n" + verboF + "amos\n" + verboF + "áis\n" + verboF + "an";	
		return conjugacionEspecial;
	}

	@Override
	public String futuro_Subjuntivo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 3);
		conjugacionEspecial = verboF + "fuere\n" + verboF + "fueres\n" + verboF + "fuere\n" + verboF + "fuéremos\n" + verboF + "fuereis\n" + verboF + "fueren";
		return conjugacionEspecial;	
	}

	@Override
	public String pretéritoImperfecto_Subjuntivo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 3);
		conjugacionEspecial = verboF + "fuera\n" + verboF + "fueras\n" + verboF + "fuera\n" + verboF + "fuéramos\n" + verboF + "fuerais\n" + verboF + "fueran";
		return conjugacionEspecial;	
	}

	@Override
	public String pretéritoImperfecto2_Subjuntivo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 3);
		conjugacionEspecial = verboF + "fuese\n" + verboF + "fueses\n" + verboF + "fuese\n" + verboF + "fuésemos\n" + verboF + "fueseis\n" + verboF + "fuesen";
		return conjugacionEspecial;	
	}			
}
