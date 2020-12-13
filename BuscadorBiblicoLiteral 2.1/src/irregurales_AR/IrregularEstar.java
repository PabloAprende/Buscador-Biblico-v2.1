package irregurales_AR;

import conjugadorDeVerbos.PrimeraConjugaci�n_AR;

public class IrregularEstar extends PrimeraConjugaci�n_AR {
	
	@Override
	public String presente_Indicativo(String verbo) {				
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = verboF + "oy\n"  + verboF + "�s\n" + verboF + "�\n" + verboF + "amos\n" + verboF + "�is\n" + verboF + "�n";
		return conjugacionEspecial;	
	}	

	@Override
	public String pret�ritoPerfectoSimple_Indicativo(String verbo) {    
		String verboF = verbo.substring(0,verbo.length() - 2);		
		conjugacionEspecial = verboF + "uve\n" + verboF + "uviste\n" + verboF + "uvo\n" + verboF + "uvimos\n" + verboF + "uvisteis\n" + verboF + "uvieron";
		return conjugacionEspecial;	
	}
	
	@Override
	public String imperativo(String verbo) {
		String verboF = verbo.substring(0, verbo.length() - 2);
		conjugacionEspecial = verboF + "�\n" + verboF + "�\n" + verboF + "�\n" + verboF + "emos\n" + verboF + "ad\n" + verboF + "�n";
		return conjugacionEspecial;	
	}
	
	@Override
	public String futuro_Subjuntivo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = verboF + "uviere\n" + verboF + "uvires\n" + verboF + "uvire\n" + verboF + "uvi�remos\n" + verboF + "uviereis\n" + verboF + "uvieren";
		return conjugacionEspecial;		
	}
	
	@Override
	public String pret�ritoImperfecto_Subjuntivo(String verbo) {	
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = verboF + "uviera\n" + verboF + "uviras\n" + verboF + "uvira\n" + verboF + "uvi�ramos\n" + verboF + "uvierais\n" + verboF + "uvieran";
		return conjugacionEspecial;		
	}	
	
	@Override
	public String pret�ritoImperfecto2_Subjuntivo(String verbo) {	
		String verboF = verbo.substring(0,verbo.length() - 2);
		conjugacionEspecial = verboF + "uviese\n" + verboF + "uvises\n" + verboF + "uvise\n" + verboF + "uvi�semos\n" + verboF + "uvieseis\n" + verboF + "uviesen";
		return conjugacionEspecial;			
	}				
}

