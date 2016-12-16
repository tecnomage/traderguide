package br.com.traderguide.pavones;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class PapelFactory {

	private static String URI_BASE_YAHOO = "http://finance.yahoo.com/quote/";

	public static String contruirPapel(String codAcao) throws IOException {

		StringBuffer retorno = new StringBuffer();
		retorno.append(codAcao.toUpperCase() + "\n");

		Document doc = getDocument(codAcao);

		preecheString(retorno, doc);

		return retorno.toString();
	}

	private static void setProxy() {
		System.setProperty("java.net.useSystemProxies", "true");
	}

	private static Document getDocument(String codAcao) throws IOException {
		setProxy();
		return Jsoup.connect(URI_BASE_YAHOO + codAcao + ".SA").get();
	}

	private static void preecheString(StringBuffer retorno, Document doc) {

		for (AtributosPapelYho atriPapel : AtributosPapelYho.values()) {
			retorno.append(atriPapel.getLabel() +": " + doc.getElementsByAttributeValue(atriPapel.getChave(), atriPapel.getValor()).text() + "\n");
		}
	}
}
