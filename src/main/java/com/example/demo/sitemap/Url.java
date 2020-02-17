package com.example.demo.sitemap;

public class Url {

	private String loc;

	// JSONは以下アノテーションでOKだが、XMLは変換されなかったので文字列でやる
	// @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Tokyo")
	private String lastmod;

	private String changefreq;

	private double priority;

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
	public String getChangefreq() {
		return changefreq;
	}
	public void setChangefreq(String changefreq) {
		this.changefreq = changefreq;
	}
	public double getPriority() {
		return priority;
	}
	public void setPriority(double priority) {
		this.priority = priority;
	}
}
