package Irregulares_ER;

import conjugadorDeVerbos.SegundaConjugación_ER;

public final class IrregularAer extends SegundaConjugación_ER {

	@Override
	public String presente_Indicativo(String verbo) {				
		aer(verbo,"presente_Indicativo");
		return conjugacionEspecial;	
	}

	@Override
	public String pretéritoPerfectoSimple_Indicativo(String verbo) {
		_er(verbo,"pretéritoPerfectoSimple_Indicativo");
		return conjugacionEspecial;
	}
	
	@Override
	public String imperativo(String verbo) {
		aer(verbo,"imperativo");
		return conjugacionEspecial;	
	}
	
	@Override
	public String presente_Subjuntivo(String verbo) {
		aer(verbo,"presente_Subjuntivo");
		return conjugacionEspecial;
	}

	@Override
	public String futuro_Subjuntivo(String verbo) {
		_er(verbo,"futuro_Subjuntivo");
		return conjugacionEspecial;	
	}

	@Override
	public String pretéritoImperfecto_Subjuntivo(String verbo) {
		_er(verbo,"pretéritoImperfecto_Subjuntivo");
		return conjugacionEspecial;	
	}

	@Override
	public String pretéritoImperfecto2_Subjuntivo(String verbo) {
		_er(verbo,"pretéritoImperfecto2_Subjuntivo");
		return conjugacionEspecial;	
	}			

	@Override
	public String gerundio(String verbo) { 	
		_er(verbo,"gerundio");
		return conjugacionEspecial;
	}	
}
