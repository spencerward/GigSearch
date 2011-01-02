package com.skw.web.parse;

import java.io.BufferedReader;
import java.io.FileReader;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Temp {
	public static void main(String[] args) throws Exception {
		FileReader fileReader = new FileReader("shows.htm");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String html = "";
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			html += line;
		}
		
		new ShowParser().extract(html);
	}
}
