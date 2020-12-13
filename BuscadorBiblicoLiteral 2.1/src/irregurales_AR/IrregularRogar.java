package irregurales_AR;

import conjugadorDeVerbos.PrimeraConjugación_AR;

public class IrregularRogar extends PrimeraConjugación_AR {
	
	@Override
	public String presente_Indicativo(String verbo) {
		String verboF = verbo.substring(0,verbo.length() - 4);
		conjugacionEspecial = verboF + "uego\n"  + verboF + "uegas\n" + verboF + "uega\n" + verboF + "ogamos\n" + verboF + "ogáis\n" + verboF + "uegan";
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
		conjugacionEspecial = verboF + "uegue\n"  + verboF + "uegues\n" + verboF + "uegue\n" + verboF + "oguemos\n" + verboF + "oguéis\n" + verboF + "ueguen";
		return conjugacionEspecial;
	}
}