package irregurales_AR;

import conjugadorDeVerbos.PrimeraConjugaci�n_AR;

public class IrregularRogar extends PrimeraConjugaci�n_AR {
	
	@Override
	public String presente_Indicativo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 4);
		conjugacionEspecial = verboF + "uego\n"  + verboF + "uegas\n" + verboF + "uega\n" + verboF + "ogamos\n" + verboF + "og�is\n" + verboF + "uegan";
		return conjugacionEspecial;
	}

	@Override
	public String imperativo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 4);
		conjugacionEspecial = verboF + "uegue\n"  + verboF + "uega\n" + verboF + "uegue\n" + verboF + "oguemos\n" + verboF + "ogad\n" + verboF + "ueguen";
		return conjugacionEspecial;
	}
	
	@Override
	public String presente_Subjuntivo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 4);
		conjugacionEspecial = verboF + "uegue\n"  + verboF + "uegues\n" + verboF + "uegue\n" + verboF + "oguemos\n" + verboF + "ogu�is\n" + verboF + "ueguen";
		return conjugacionEspecial;
	}
}