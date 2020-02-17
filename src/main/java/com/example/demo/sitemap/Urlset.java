package com.example.demo.sitemap;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Urlset {

	private List<Url> url;

	@XmlAttribute
	public String getXmlns() {
		return "http://www.sitemaps.org/schemassitemap/0.9";
	}

	@XmlAttribute(name = "xmlns:xsi")
	public String getXmlnsXsi() {
		return "http://www.w3.org/2001/XMLSchema-instance";
	}

	// Lombokを使えば良い

	public List<Url> getUrl() {
		return url;
	}

	public void setUrl(List<Url> url) {
		this.url = url;
	}

}
