/*
    Copyright (C) 2012 Yi Han Tsai (poormusic2001@gmail.com)

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/


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
