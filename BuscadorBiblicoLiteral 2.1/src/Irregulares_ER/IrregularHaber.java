package Irregulares_ER;

import conjugadorDeVerbos.SegundaConjugación_ER;

public final class IrregularHaber extends SegundaConjugación_ER {
	
	@Override
	public String presente_Indicativo(String verbo) {				
		String verboF = verbo.substring(0,verbo.length() - 4);
		conjugacionEspecial = verboF + "e\n" + verboF + "as\n" + verboF + "a\n" + verboF + "emos\n" + verboF + "abéis\n" + verboF + "an";
		return conjugacionEspecial;	
	}

	@Override
	public String pretéritoPerfectoSimple_Indicativo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 4);
		conjugacionEspecial = verboF + "ube\n" + verboF + "ubiste\n" + verboF + "ubo\n" + verboF + "ubimos\n" + verboF + "ubisteis\n" + verboF + "ubieron";
		return conjugacionEspecial;
	}
	
	@Override
	public String condicional_Indicativo(String verbo) {	
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = verboF + "ría\n" + verboF + "rías\n" + verboF + "ría\n" + verboF + "ríamos\n" + verboF + "ríais\n" + verboF + "rían";
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
		conjugacionEspecial = verboF + "ya\n" + verboF + "yas\n" + verboF + "ya\n" + verboF + "yamos\n" + verboF + "yáis\n" + verboF + "yan";	
		return conjugacionEspecial;
	}

	@Override
	public String futuro_Subjuntivo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 4);
		conjugacionEspecial = verboF + "ubiere\n" + verboF + "ubieres\n" + verboF + "ubiere\n" + verboF + "ubiéremos\n" + verboF + "ubiereis\n" + verboF + "ubieren";
		return conjugacionEspecial;	
	}

	@Override
	public String pretéritoImperfecto_Subjuntivo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 4);
		conjugacionEspecial = verboF + "ubiera\n" + verboF + "ubieras\n" + verboF + "ubiera\n" + verboF + "ubiéramos\n" + verboF + "ubierais\n" + verboF + "ubieran";
		return conjugacionEspecial;	
	}

	@Override
	public String pretéritoImperfecto2_Subjuntivo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 4);
		conjugacionEspecial = verboF + "ubiese\n" + verboF + "ubieses\n" + verboF + "ubiese\n" + verboF + "ubiésemos\n" + verboF + "ubieseis\n" + verboF + "ubiesen";
		return conjugacionEspecial;	
	}				
}
