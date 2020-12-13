package modelo;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class CopiarYPegar {

	public static void copiar(StringSelection ss) {
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		cb.setContents(ss, null);
	}

	public static String pegar() {
		String texto = "";
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		Transferable contenido = cb.getContents(null);
		if (contenido.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				texto = (String) contenido.getTransferData(DataFlavor.stringFlavor);
			} catch (UnsupportedFlavorException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		return texto;
	}
}
