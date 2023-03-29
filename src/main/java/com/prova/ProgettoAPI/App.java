package com.prova.ProgettoAPI;

import java.io.File;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
//import java.net.http.HttpClient;
import java.sql.ClientInfoStatus;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.prova.ProgettoAPI.Toptracks.Track;



public class App {
	public static void main(String[] args) {

		try {

//		URL url = new URL("http://ws.audioscrobbler.com/2.0/?method=artist.getTopAlbums&artist=postmalone&raw=true&api_key="
//					+ System.getenv("LASTFM_KEY"));
			
			
			URL url = new URL("https://ws.audioscrobbler.com/2.0/?method=artist.gettoptracks&artist=PostMalone&api_key="
					+ System.getenv("LASTFM_KEY"));

			System.out.println(url);

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();

			int responceCode = conn.getResponseCode();

			if (responceCode == 200) {
				System.out.println("200: OK");
				StringBuilder xmlInfomation = new StringBuilder();
				Scanner scanner = new Scanner(url.openStream());

				while (scanner.hasNext()) {
					xmlInfomation.append(scanner.nextLine());
				}

				scanner.close();

				String xmlOk = xmlInfomation.toString().replaceAll("<lfm status=\\\"ok\\\">", ""); 
				xmlOk = xmlOk.toString().replaceAll("</lfm>", "");
				System.out.println(xmlOk);

    		JAXBContext jaxbContext = JAXBContext.newInstance(Toptracks.class);

    		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//    		new StringReader(xmlInfomation.toString())
    		Toptracks prova = (Toptracks) unmarshaller.unmarshal(new StringReader(xmlOk.toString()));
    		for ( Track t : prova.getTrack()) {
				System.out.print(t.getName()+t.getPlaycount()+"\n");
			}
    		
    		System.out.println();
			} else {
				throw new RuntimeException("HttpoResponceCode: " + responceCode);
			}

		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
