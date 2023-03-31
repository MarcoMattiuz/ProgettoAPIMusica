package com.prova.ProgettoAPI.classes;

import com.prova.ProgettoAPI.Topalbums;
import com.prova.ProgettoAPI.Toptracks;

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
            "https://ws.audioscrobbler.com/2.0/?method=artist.gettoptracks&artist="; //classe JAXB ok
    private static final String ARTIST_TOP_ALBUMS =
            "http://ws.audioscrobbler.com/2.0/?method=artist.gettopalbums&artist="; //TODO: da rifare la classe JAXB
    private static final String ARTIST_SEARCH =
            "http://ws.audioscrobbler.com/2.0/?method=artist.search&artist="; //TODO: da fare la classe JAXB
    private static String GEO_TOP_ARTIST =
            "http://ws.audioscrobbler.com/2.0/?method=geo.gettopartists&country="; //TODO: da fare la classe JAXB
    private static final String GEO_TOP_TRACKS =
            "http://ws.audioscrobbler.com/2.0/?method=geo.gettoptracks&country="; //TODO: da fare la classe JAXB
    private static final String ARTIST_TRACK_INFO =
            "http://ws.audioscrobbler.com/2.0/?method=track.getInfo&"; //artist=cher&track=believe //TODO: da fare la classe JAXB


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


}
