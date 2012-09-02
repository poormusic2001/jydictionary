/*
 *   Copyright (C) 2012 Yi Han Tsai (poormusic2001@gmail.com)
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, write to the Free Software Foundation.
 *
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JYdict;
import java.net.*;
import java.io.*;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/**
 *
 * @author poormusic
 */
public class JYdict {
    //Get the pronunciation
    public String getPronunciation(Document dDoc) throws Exception{
       Elements pronunciationElement = dDoc.getElementsByClass("pronunciation");
        return pronunciationElement.text();
    }
    //Get the description
    public String getDescription(Document dDoc) throws Exception{
        Elements descriptionElement = dDoc.getElementsByClass("description");
        return descriptionElement.text();
    }
    //Get the Synonyms
    public String getSynonyms(Document dDoc) throws Exception{
        Elements synonymsElement = dDoc.getElementsByClass("synonyms");
        return synonymsElement.text();
    }
    //Get the result page.
    public Document readDataFromInternet(String query) throws Exception {
           
            URL url = new URL("http://tw.dictionary.yahoo.com/dictionary?p="+query);

            Document dicDoc = Jsoup.parse(url.openStream(),null, "http://tw.dictionary.yahoo.com");
           
            return dicDoc;
   }
    
    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        // TODO code application logic here
    }*/
}
