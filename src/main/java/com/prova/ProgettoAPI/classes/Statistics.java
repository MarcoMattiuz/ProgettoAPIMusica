package com.prova.ProgettoAPI.classes;

import java.io.Serializable;

import com.jgoodies.forms.layout.Size;
import com.prova.ProgettoAPI.Album.Tags.Tag;
import com.prova.ProgettoAPI.Topalbums.Album;
import com.prova.ProgettoAPI.Track;

public final class  Statistics {

	

	
	public static String DifferenceAlbums(com.prova.ProgettoAPI.Album albumDX,com.prova.ProgettoAPI.Album albumSX) {
		
		String ret = "";

		if(albumDX.getWiki() != null && albumSX.getWiki() != null ) {
			String Tags1 = "";
			String Tags2 = "";
			String alb1Published = albumDX.getWiki().getPublished();
			String alb2Published = albumSX.getWiki().getPublished();
			String descrAlb1 = "";
			String descrAlb2 = "";
			for (Serializable string : albumDX.getWiki().getSummary().getContent()) {
				descrAlb1 += string;
			}
			for (Serializable string : albumSX.getWiki().getSummary().getContent()) {
				descrAlb2 += string;
			}
			
			for (Tag t : albumDX.getTags().getTag()) {
				Tags1 += t.getName() + " ";
			}
			
			for (Tag t : albumSX.getTags().getTag()) {
				Tags2 += t.getName() + " ";
			}

			ret += "| " + albumDX.getName() + " || " + albumSX.getName() + " |\n" +
				   "| " + "By: " + albumDX.getArtist() + " || " + "By: " + albumSX.getArtist() + " |\n"+
				   "| " + "Listeners: "+albumDX.getListeners() + (albumDX.getListeners()>albumSX.getListeners() ? " > " : " < ") + albumSX.getListeners() + " |\n" +
				   "| " + "PlayCount: " + albumDX.getPlaycount() + (albumDX.getPlaycount()>albumSX.getPlaycount() ? " > " : " < ") + albumSX.getPlaycount() + " |\n"+
				   "| " + "Publishing date: " + alb1Published + " || " + "Publishing date: " + alb2Published + " |\n" +
				   "| " + "Tags: " + Tags1 + " || " + "Tags: " + Tags2 + " |\n" + 
				   "| =============================================================== |\n"+
				   "| " + albumDX.getName() +": "+ descrAlb1 + " |\n"+
				   "| " + albumSX.getName() +": "+ descrAlb2 + " |\n";

		}else {
			ret += "| " + albumDX.getName() + " || " + albumSX.getName() + " |\n" +
					   "| " + "By: " + albumDX.getArtist() + " || " + "By: " + albumSX.getArtist() + " |\n"+
					   "| " + "Listeners: "+albumDX.getListeners() + (albumDX.getListeners()>albumSX.getListeners() ? " > " : " < ") + albumSX.getListeners() + " |\n" +
					   "| " + "PlayCount: " + albumDX.getPlaycount() + (albumDX.getPlaycount()>albumSX.getPlaycount() ? " > " : " < ") + albumSX.getPlaycount() + " |\n"+
					   "| " + "No additional Informations found :(" + " |";
		}
		
		
		
		return ret;
		
	}
	
	
	public static String DifferenceTracks(Track Track1, Track Track2) {
		
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
