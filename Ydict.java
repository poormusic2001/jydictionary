import java.net.*;
import java.io.*;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Ydict{
	public void readDataFromInternet(String query){

		String address="http://tw.dictionary.yahoo.com/dictionary?p="+query;
		try{
			Document dicDoc = Jsoup.connect(address).get();
			Elements pronunciationElement = dicDoc.getElementsByClass("pronunciation");
			Elements descriptionElement = dicDoc.getElementsByClass("description");
			Elements synonymsElement = dicDoc.getElementsByClass("synonyms");

			System.out.println(pronunciationElement.text());
			System.out.println(descriptionElement.text());	
			System.out.println(synonymsElement.text());	
			System.out.println("\n\n");
			
		}catch (Exception e){
			e.printStackTrace();	
		}
		}
	
	public static void main(String args[]){
		Ydict YD = new Ydict();
		System.out.println(args[0]);
		YD.readDataFromInternet(args[0]);		
		
	}
		
}
