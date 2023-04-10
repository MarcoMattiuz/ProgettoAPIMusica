package com.prova.ProgettoAPI;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.ClientInfoStatus;
import java.util.Base64;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.prova.ProgettoAPI.Topalbums.Album;
import com.prova.ProgettoAPI.Topalbums.Album.Artist;
import com.prova.ProgettoAPI.Toptracks.Track;
import com.prova.ProgettoAPI.classes.ApiRequests;
import com.prova.ProgettoAPI.classes.Statistics;

import GUI.Controller;
import GUI.Jframe_Principale;


public class App {
	

	public static void main(String[] args) throws IOException {

		Jframe_Principale fin = new Jframe_Principale();
		Controller con = new Controller(fin);
		
		Toptracks tracks = ApiRequests.GETArtistTopTracks("Cher");
		Topalbums albums = ApiRequests.GETArtistTopAlbums("Beatles");
		Topartists artists = ApiRequests.GETCountryTopArtist("Italy");
		Tracks topTracks = ApiRequests.GETCountryTopTracks("Italy");
		
		System.out.println(tracks.getTrack().get(0).getArtist().getName());
		System.out.println(tracks.getTrack().get(1).getName());
		
		com.prova.ProgettoAPI.Track track = ApiRequests.GETTrackInfo("Cher", "Believe");
		
//		com.prova.ProgettoAPI.Album alb = ApiRequests.GETAlbumInfo("Cher", "Believe");
//		
		

//		for ( Album t :
//			albums.getAlbum()) {
//		System.out.println(t.getName());
//		}
		
//		for ( com.prova.ProgettoAPI.Tracks.Track t : //attenzione che ci sono classi con lo stesso nome
//			topTracks.getTrack()) {
//		System.out.println(t.getName()+" listeners: "+t.getListeners());
//		}
//		
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

}}
