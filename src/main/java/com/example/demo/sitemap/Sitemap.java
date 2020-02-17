package com.example.demo.sitemap;

public class Sitemap {

	private String loc;

	// JSONは以下アノテーションでOKだが、XMLは変換されなかったので文字列でやる
	// @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Tokyo")
	private String lastmod;

	// Lombokを使えば良い

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getLastmod() {
		return lastmod;
	}

	public void setLastmod(String lastmod) {
		this.lastmod = lastmod;
	}
}
