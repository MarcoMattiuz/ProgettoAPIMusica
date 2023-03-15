package com.prova.ProgettoAPI;

import java.io.File;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpClient;
import java.sql.ClientInfoStatus;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class App {
  public static void main(String[] args) {
    
//	  private final key = 
    try {

		
    	
    	URL url = new URL("http://ws.audioscrobbler.com/2.0/?method=artist.getinfo&artist=Cher&api_key=c5144fcb4998c2d190c9b8204da76775");
    	
    	HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
    	
    	int responceCode = conn.getResponseCode();
    	
    	if(responceCode == 200) {
    		System.out.println("200: OK");
    		StringBuilder xmlInfomation = new StringBuilder();
    		Scanner scanner = new Scanner(url.openStream());
    		
    		while(scanner.hasNext()) {
    			xmlInfomation.append(scanner.nextLine());
    		}
    		
    		scanner.close();
    		
    		System.out.println(xmlInfomation);

//    		JAXBContext jaxbContext = JAXBContext.newInstance(note.class);
//
//  		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//
//    		note prova = (note) unmarshaller.unmarshal(new StringReader(xmlStr));
    	}else {
    		throw new RuntimeException("HttpoResponceCode: " + responceCode);
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	

	} catch (Exception e) {
		System.err.println(e);
	}
  }
}
