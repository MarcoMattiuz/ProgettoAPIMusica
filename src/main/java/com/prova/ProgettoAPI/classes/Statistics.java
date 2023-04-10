package com.prova.ProgettoAPI.classes;

import java.io.Serializable;

import com.jgoodies.forms.layout.Size;
import com.prova.ProgettoAPI.Album.Tags.Tag;
import com.prova.ProgettoAPI.Topalbums.Album;
import com.prova.ProgettoAPI.Track;

public final class  Statistics {

	

	
	public static String DifferenceAlbums(Album alb1, Album alb2) {
		
		com.prova.ProgettoAPI.Album album1 = ApiRequests.GETAlbumInfo(alb1.getArtist().getName(), alb1.getName());
		com.prova.ProgettoAPI.Album album2 = ApiRequests.GETAlbumInfo(alb2.getArtist().getName(), alb2.getName());
		String ret = "";

		if(album1.getWiki() != null && album2.getWiki() != null ) {
			String Tags1 = "";
			String Tags2 = "";
			String alb1Published = album1.getWiki().getPublished();
			String alb2Published = album2.getWiki().getPublished();
			String descrAlb1 = "";
			String descrAlb2 = "";
			for (Serializable string : album1.getWiki().getSummary().getContent()) {
				descrAlb1 += string;
			}
			for (Serializable string : album2.getWiki().getSummary().getContent()) {
				descrAlb2 += string;
			}
			
			for (Tag t : album1.getTags().getTag()) {
				Tags1 += t.getName() + " ";
			}
			
			for (Tag t : album2.getTags().getTag()) {
				Tags2 += t.getName() + " ";
			}

			ret += "| " + album1.getName() + " || " + album2.getName() + " |\n" +
				   "| " + "By: " + album1.getArtist() + " || " + "By: " + album2.getArtist() + " |\n"+
				   "| " + "Listeners: "+album1.getListeners() + (album1.getListeners()>album2.getListeners() ? " > " : " < ") + album2.getListeners() + " |\n" +
				   "| " + "PlayCount: " + album1.getPlaycount() + (album1.getPlaycount()>album2.getPlaycount() ? " > " : " < ") + album2.getPlaycount() + " |\n"+
				   "| " + "Publishing date: " + alb1Published + " || " + "Publishing date: " + alb2Published + " |\n" +
				   "| " + "Tags: " + Tags1 + " || " + "Tags: " + Tags2 + " |\n" + 
				   "| =============================================================== |\n"+
				   "| " + album1.getName() +": "+ descrAlb1 + " |\n"+
				   "| " + album2.getName() +": "+ descrAlb2 + " |\n";

		}else {
			ret += "| " + album1.getName() + " || " + album2.getName() + " |\n" +
					   "| " + "By: " + album1.getArtist() + " || " + "By: " + album2.getArtist() + " |\n"+
					   "| " + "Listeners: "+album1.getListeners() + (album1.getListeners()>album2.getListeners() ? " > " : " < ") + album2.getListeners() + " |\n" +
					   "| " + "PlayCount: " + album1.getPlaycount() + (album1.getPlaycount()>album2.getPlaycount() ? " > " : " < ") + album2.getPlaycount() + " |\n"+
					   "| " + "No additional Informations found :(" + " |";
		}
		
		
		
		return ret;
		
	}
	
	
	public static String DifferenceTracks(com.prova.ProgettoAPI.Toptracks.Track track, com.prova.ProgettoAPI.Toptracks.Track track3) {
		
		Track Track1 = ApiRequests.GETTrackInfo(track.getArtist().getName(), track.getName());
		Track Track2 = ApiRequests.GETTrackInfo(track3.getArtist().getName(), track3.getName());
		String ret = "";
		
		
		if(Track1.getWiki() != null && Track2.getWiki() != null ) {
			
			String Tags1 = "";
			String Tags2 = "";
			String trk1Published = Track1.getWiki().getPublished();
			String trk2Published = Track2.getWiki().getPublished();
			String descrtrk1 = "";
			String descrtrk2 = "";
			for (Serializable string : Track1.getWiki().getSummary().getContent()) {
				descrtrk1 += string;
			}
			for (Serializable string : Track2.getWiki().getSummary().getContent()) {
				descrtrk2 += string;
			}
			
			for (com.prova.ProgettoAPI.Track.Toptags.Tag t : Track1.getToptags().getTag()) {
				Tags1 += t.getName() + " ";
			}
			
			for (com.prova.ProgettoAPI.Track.Toptags.Tag t : Track2.getToptags().getTag()) {
				Tags2 += t.getName() + " ";
			}

			ret += "| " + Track1.getName() + " || " + Track2.getName() + " |\n" +
				   "| " + "By: " + Track1.getArtist().getName() + " || " + "By: " + Track2.getArtist().getName() + " |\n"+
				   "| " + "Listeners: "+Track1.getListeners() + (Track1.getListeners()>Track2.getListeners() ? " > " : " < ") + Track2.getListeners() + " |\n" +
				   "| " + "PlayCount: " + Track1.getPlaycount() + (Track1.getPlaycount()>Track2.getPlaycount() ? " > " : " < ") + Track2.getPlaycount() + " |\n"+
				   "| " + "Duration: " + Track1.getDuration() + (Track1.getDuration()>Track2.getDuration()? " > " : " < ") + Track2.getDuration() + " |\n" + 
				   "| " + "Publishing date: " + trk1Published + " || " + "Publishing date: " + trk2Published + " |\n" +
				   "| " + "Tags: " + Tags1 + " || " + "Tags: " + Tags2 + " |\n" + 
				   "| =============================================================== |\n"+
				   "| " + Track1.getName() +": "+ descrtrk1 + " |\n"+
				   "| " + Track2.getName() +": "+ descrtrk2 + " |\n";

		}else {
			
			
			ret += "| " + Track1.getName() + " || " + Track2.getName() + " |\n" +
					   "| " + "By: " + Track1.getArtist().getName() + " || " + "By: " + Track2.getArtist().getName() + " |\n"+
					   "| " + "Listeners: "+Track1.getListeners() + (Track1.getListeners()>Track2.getListeners() ? " > " : " < ") + Track2.getListeners() + " |\n" +
					   "| " + "PlayCount: " + Track1.getPlaycount() + (Track1.getPlaycount()>Track2.getPlaycount() ? " > " : " < ") + Track2.getPlaycount() + " |\n"+
					   "| " + "Duration: " + Track1.getDuration() + (Track1.getDuration()>Track2.getDuration()? " > " : " < ") + Track2.getDuration() + " |\n" +
					   "| " + "No additional Informations found :(" + " |";
		}
		
		
		return ret;
		
	}
	
	
	
	
	
}
