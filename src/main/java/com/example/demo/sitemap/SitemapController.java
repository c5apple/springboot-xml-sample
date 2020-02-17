package com.example.demo.sitemap;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
  * サイトマップ
 */
@RestController
@RequestMapping("/sitemap")
public class SitemapController {

	@GetMapping
	public Sitemapindex sitemapindex() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Sitemapindex sitemapindex = new Sitemapindex();

		Sitemap sitemap1 = new Sitemap();
		sitemap1.setLoc("https://example.com/sitemap1.xml");
		calendar.set(2020, 1, 1); // 2月1日
		sitemap1.setLastmod(sdf.format(calendar.getTime()));

		Sitemap sitemap2 = new Sitemap();
		sitemap2.setLoc("https://example.com/sitemap2.xml");
		calendar.set(2020, 1, 29); // 2月29日
		sitemap2.setLastmod(sdf.format(calendar.getTime()));

		List<Sitemap> sitemapList = Arrays.asList(sitemap1, sitemap2);
		sitemapindex.setSitemap(sitemapList);

		return sitemapindex;
	}

	@GetMapping("urlset")
	public Urlset urlset() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Urlset urlset = new Urlset();

		Url url1 = new Url();
		url1.setLoc("https://example.com/article/1");
		calendar.set(2020, 1, 1); // 2月1日
		url1.setLastmod(sdf.format(calendar.getTime()));
		url1.setChangefreq("always");
		url1.setPriority(1.0);

		Url url2 = new Url();
		url2.setLoc("https://example.com/article/2");
		calendar.set(2020, 1, 29); // 2月29日
		url2.setLastmod(sdf.format(calendar.getTime()));
		url2.setChangefreq("always");
		url2.setPriority(1.0);

		List<Url> urlList = Arrays.asList(url1, url2);
		urlset.setUrl(urlList);
		return urlset;
	}
}
