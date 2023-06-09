package com.prova.ProgettoAPI.classes;



import com.prova.ProgettoAPI.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public final class ApiRequests {

    private static final String ARTIST_TOP_TRACKS =
            "https://ws.audioscrobbler.com/2.0/?method=artist.gettoptracks&artist="; //ok
    private static final String ARTIST_TOP_ALBUMS =
            "http://ws.audioscrobbler.com/2.0/?method=artist.gettopalbums&artist="; //ok
    private static String COUNTRY_TOP_ARTIST =
            "http://ws.audioscrobbler.com/2.0/?method=geo.gettopartists&country="; //ok
    private static final String COUNTRY_TOP_TRACKS =
            "http://ws.audioscrobbler.com/2.0/?method=geo.gettoptracks&country="; //ok
    private static final String ARTIST_TRACK_INFO =
            "http://ws.audioscrobbler.com/2.0/?method=track.getInfo"; //ok
    private static final String ARTIST_ALBUM_INFO =
            "https://ws.audioscrobbler.com/2.0/?method=album.getinfo"; //ok


    private static String cleanString(StringBuilder xmlInfomation){
        String ret = xmlInfomation.toString().replaceAll("<lfm status=\\\"ok\\\">", "");
        ret = ret.replaceAll("</lfm>", "");
        return ret;
    }


    private static <T> Object unmarshall(Class<T> className, String xml) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(className);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        return unmarshaller.unmarshal(new StringReader(xml.toString()));
    }

    private static  <T> Object request(Class<T> className, URL url) throws IOException, JAXBException {
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

            String xmlOK = cleanString(xmlInfomation);
            System.out.println(xmlOK);
            return unmarshall(className,xmlOK);

        } else {
            throw new RuntimeException("HttpoResponceCode: " + responceCode);
        }
    }

    public static Toptracks GETArtistTopTracks(String artist){
        Toptracks ret = null;
        try {

            URL url = new URL(ARTIST_TOP_TRACKS + artist + "&api_key="
                    + System.getenv("LASTFM_KEY"));
            ret = (Toptracks) request(Toptracks.class,url);
        }catch (Exception e){
            System.err.println(e);
        }
        return ret;

    }
    
    
    public static Topalbums GETArtistTopAlbums(String artist){
    	Topalbums ret = null;
        try {

            URL url = new URL(ARTIST_TOP_ALBUMS + artist + "&api_key="
                    + System.getenv("LASTFM_KEY"));
            ret = (Topalbums) request(Topalbums.class,url);
        }catch (Exception e){
            System.err.println(e);
        }
        return ret;

    }
    
    
    public static Topartists GETCountryTopArtist(String country){
    	Topartists ret = null;
        try {

            URL url = new URL(COUNTRY_TOP_ARTIST + country + "&api_key="
                    + System.getenv("LASTFM_KEY"));
            ret = (Topartists) request(Topartists.class,url);
        }catch (Exception e){
            System.err.println(e);
        }
        return ret;

    }
    
    public static Tracks GETCountryTopTracks(String country){
    	Tracks ret = null;
        try {

            URL url = new URL(COUNTRY_TOP_TRACKS + country + "&api_key="
                    + System.getenv("LASTFM_KEY"));
            ret = (Tracks) request(Tracks.class,url);
        }catch (Exception e){
            System.err.println(e);
        }
        return ret;

    }

    
    public static Album GETAlbumInfo(String artist, String album ){
    	Album ret = null;
    	
    	artist = artist.replaceAll(" ", "%20");
    	album = album.replaceAll(" ", "%20");
    
    	try {

            URL url = new URL(ARTIST_ALBUM_INFO + "&api_key="
                    + System.getenv("LASTFM_KEY")
                    + "&artist="+artist+"&album="+album);
       
            System.out.println(url);
            ret = (Album) request(Album.class,url);
        }catch (Exception e){
            System.err.println(e);
        }
        return ret;
        

    }
    
    
    public static Track GETTrackInfo(String artist, String track){
    	Track ret = null;
    	
    	artist = artist.replaceAll(" ", "%20");
    	track = track.replaceAll(" ", "%20");
    
    	try {

            URL url = new URL(ARTIST_TRACK_INFO + "&api_key="
                    + System.getenv("LASTFM_KEY")
                    + "&artist="+artist+"&track="+track);
       
            System.out.println(url);
            ret = (Track) request(Track.class,url);
        }catch (Exception e){
            System.err.println(e);
        }
        return ret;
        

    }

}
