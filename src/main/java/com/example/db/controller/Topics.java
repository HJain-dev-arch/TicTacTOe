package com.example.db.controller;

public class Topics {

	private String topics;
	private int total;
	private int totalChapters;
	public Topics() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Topics(String topics, int total, int totalChapters) {
		this.topics = topics;
		this.total = total;
		this.totalChapters = totalChapters;
	}
	public String getTopics() {
		return topics;
	}
	public void setTopics(String topics) {
		this.topics = topics;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotalChapters() {
		return totalChapters;
	}
	public void setTotalChapters(int totalChapters) {
		this.totalChapters = totalChapters;
	}
}
