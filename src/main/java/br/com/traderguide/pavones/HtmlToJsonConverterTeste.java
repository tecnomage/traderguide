package br.com.traderguide.pavones;

import java.io.IOException;

public class HtmlToJsonConverterTeste {

	public static void main(String[] args) throws IOException {
		
		String papel = PapelFactory.contruirPapel("petr4");
		
		System.out.println(papel);
	}

}
