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

import com.prova.ProgettoAPI.Topalbums.Album;
import com.prova.ProgettoAPI.Topalbums.Album.Artist;
import com.prova.ProgettoAPI.Toptracks.Track;
import com.prova.ProgettoAPI.classes.ApiRequests;


public class App {
	public static void main(String[] args) {

		Toptracks tracks = ApiRequests.GETArtistTopTracks("TomOdell");
		Topalbums albums = ApiRequests.GETArtistTopAlbums("PostMalone");
		Topartists artists = ApiRequests.GETCountryTopArtist("Italy");
		Tracks topTracks = ApiRequests.GETCountryTopTracks("Italy");
		
		
		for ( com.prova.ProgettoAPI.Tracks.Track t : //attenzione che ci sono classi con lo stesso nome
			topTracks.getTrack()) {
		System.out.println(t.getName()+" listeners: "+t.getListeners());
		}
		
//		for ( com.prova.ProgettoAPI.Topartists.Artist t : //attenzione che ci sono classi con lo stesso nome 
//			artists.getArtist()) {
//		System.out.println(t.getName()+" listeners: "+t.getListeners());
//		}
//		
//		for ( Track t :
//			tracks.getTrack()) {
//		System.out.println(t.getName());
//		}
//		
//		for ( Album t :
//			albums.getAlbum()) {
//		System.out.println(t.getName());
//		}

}}
