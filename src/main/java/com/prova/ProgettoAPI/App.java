package com.prova.ProgettoAPI;

import java.io.File;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.ClientInfoStatus;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.prova.ProgettoAPI.Toptracks.Track;
import com.prova.ProgettoAPI.classes.ApiRequests;


public class App {
	public static void main(String[] args) {

		Toptracks tracks = ApiRequests.GETArtistTopTracks("TomOdell");

		for ( Track t :
				tracks.getTrack()) {
			System.out.println(t.getName());
		}

}}
