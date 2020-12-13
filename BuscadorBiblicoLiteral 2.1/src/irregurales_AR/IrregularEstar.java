package irregurales_AR;

import conjugadorDeVerbos.PrimeraConjugación_AR;

public class IrregularEstar extends PrimeraConjugación_AR {
	
	@Override
	public String presente_Indicativo(String verbo) {				
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = verboF + "oy\n"  + verboF + "ás\n" + verboF + "á\n" + verboF + "amos\n" + verboF + "áis\n" + verboF + "án";
		return conjugacionEspecial;	
	}	

	@Override
	public String pretéritoPerfectoSimple_Indicativo(String verbo) {    
		String verboF = verbo.substring(0,verbo.length() - 2);		
		conjugacionEspecial = verboF + "uve\n" + verboF + "uviste\n" + verboF + "uvo\n" + verboF + "uvimos\n" + verboF + "uvisteis\n" + verboF + "uvieron";
		return conjugacionEspecial;	
	}
	
	@Override
	public String imperativo(String verbo) {
		String verboF = verbo.substring(0, verbo.length() - 2);
		conjugacionEspecial = verboF + "é\n" + verboF + "á\n" + verboF + "é\n" + verboF + "emos\n" + verboF + "ad\n" + verboF + "én";
		return conjugacionEspecial;	
	}
	
	@Override
	public String futuro_Subjuntivo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = verboF + "uviere\n" + verboF + "uvires\n" + verboF + "uvire\n" + verboF + "uviéremos\n" + verboF + "uviereis\n" + verboF + "uvieren";
		return conjugacionEspecial;		
	}
	
	@Override
	public String pretéritoImperfecto_Subjuntivo(String verbo) {	
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = verboF + "uviera\n" + verboF + "uviras\n" + verboF + "uvira\n" + verboF + "uviéramos\n" + verboF + "uvierais\n" + verboF + "uvieran";
		return conjugacionEspecial;		
	}	
	
	@Override
	public String pretéritoImperfecto2_Subjuntivo(String verbo) {	
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = verboF + "uviese\n" + verboF + "uvises\n" + verboF + "uvise\n" + verboF + "uviésemos\n" + verboF + "uvieseis\n" + verboF + "uviesen";
		return conjugacionEspecial;			
	}				
}

