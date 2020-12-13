package modelo;

public class Formatear {

	public String formatear(String linea) {
		// Eliminamos los espacios que tenga al princio o al final.
		linea = linea.trim();

		// Si coinside algun caracter de "palabra" con algun caracter de la cadena
		// "caracterNoValido", se reemplazara por el caracter de la cadena "ascii" de
		// igual indice.
		String caracterNoValido = "AÁáBCDEÉéFGHIÍíJKMNÑOÓóPQRSTUÚúüVWXYZ";
		String ascii =            "aaabcdeeefghiiijkmnñooopqrstuuuuvwxyz";
		for (int i = 0; i < caracterNoValido.length(); i++) {
			linea = linea.replace(caracterNoValido.charAt(i), ascii.charAt(i));
		}
		return linea;
	}
	
	public boolean validar(String cadena, String expresionBuscada) {
		boolean continuar = true;
		boolean validacion = false;

		loop: while (continuar) {
			int aparicion = cadena.indexOf(expresionBuscada);

			int unicPri;
			if (aparicion + expresionBuscada.length() <= cadena.length() && aparicion != -1) {
				if (aparicion != 0) {
					char antesPri = new Character(cadena.charAt(aparicion - 1));
					unicPri = Character.toString(antesPri).codePointAt(0);
				} else {
					unicPri = 32;
				}

				int unicUlt;
				if (aparicion + expresionBuscada.length() <= cadena.length() - 1) {
					char despuesUlt = new Character(cadena.charAt(aparicion + expresionBuscada.length()));
					unicUlt = Character.toString(despuesUlt).codePointAt(0);
				} else {
					unicUlt = 32;
				}

				if ((unicPri == 32 || unicPri == 33 || unicPri == 34 ||  unicPri == 39 || unicPri == 40 ||  unicPri == 41 || unicPri == 44 || unicPri == 45
						|| unicPri == 46 || unicPri == 58 || unicPri == 59 || unicPri == 63 ||unicPri == 91 || unicPri == 93 || unicPri == 161 || unicPri == 191 
						|| unicPri == 8212 || unicPri == 8216 || unicPri == 8217|| unicPri == 8218|| unicPri == 8219|| unicPri == 8220|| unicPri == 8221)
						&& (unicUlt == 32 || unicUlt == 33 || unicUlt == 34 || unicUlt == 39 ||unicUlt == 40 ||unicUlt == 41 || unicUlt == 44 | unicUlt == 45
						|| unicUlt == 46 || unicUlt == 58 || unicUlt == 59 || unicUlt == 63 || unicUlt == 91|| unicUlt == 93 || unicUlt == 161 || unicUlt == 191 
						|| unicUlt == 8212 || unicUlt == 8216|| unicUlt == 8217|| unicUlt == 8218|| unicUlt == 8219|| unicUlt == 8220|| unicUlt == 8221)) {
					validacion = true;
					break loop;
				}

				if (aparicion + expresionBuscada.length() < cadena.length()) {
					cadena = cadena.substring(aparicion + expresionBuscada.length());
				} else {
					continuar = false;
				}

			} else {
				continuar = false;
			}
		}
		return validacion;
	}
}
