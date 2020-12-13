package Irregulares_ER;

import conjugadorDeVerbos.SegundaConjugaci�n_ER;

public final class IrregularAer extends SegundaConjugaci�n_ER {

	@Override
	public String presente_Indicativo(String verbo) {				
		aer(verbo,"presente_Indicativo");
		return conjugacionEspecial;	
	}

	@Override
	public String pret�ritoPerfectoSimple_Indicativo(String verbo) {
		_er(verbo,"pret�ritoPerfectoSimple_Indicativo");
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
	public String pret�ritoImperfecto_Subjuntivo(String verbo) {
		_er(verbo,"pret�ritoImperfecto_Subjuntivo");
		return conjugacionEspecial;	
	}

	@Override
	public String pret�ritoImperfecto2_Subjuntivo(String verbo) {
		_er(verbo,"pret�ritoImperfecto2_Subjuntivo");
		return conjugacionEspecial;	
	}			

	@Override
	public String gerundio(String verbo) { 	
		_er(verbo,"gerundio");
		return conjugacionEspecial;
	}	
}
