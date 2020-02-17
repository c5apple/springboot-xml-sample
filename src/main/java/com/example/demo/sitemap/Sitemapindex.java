package com.example.demo.sitemap;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Sitemapindex {

	private List<Sitemap> sitemap;

	@XmlAttribute
	public String getXmlns() {
		return "http://www.sitemaps.org/schemassitemap/0.9";
	}

	// Lombokを使えば良い

	public List<Sitemap> getSitemap() {
		return sitemap;
	}

	public void setSitemap(List<Sitemap> sitemap) {
		this.sitemap = sitemap;
	}
}
