package com.skw.web.parse;

import java.io.File;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ShowParser {
	public void extract(String html){
		Document doc = Jsoup.parse(html);
		Elements events = doc.getElementsByClass("event");
		for (Element element : events) {
			element.
			System.out.print(element.text());
		}
		
	}
}
