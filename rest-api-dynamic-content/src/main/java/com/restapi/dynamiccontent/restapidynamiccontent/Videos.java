package com.restapi.dynamiccontent.restapidynamiccontent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Videos {
	
	@Id
	@GeneratedValue
	private long vid;
	
	
	private String title;
	
	
	private String description;
	

	private String link;

	public long getVid() {
		return vid;
	}

	public void setVid(long vid) {
		this.vid = vid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "Videos [vid=" + vid + ", title=" + title + ", description=" + description + ", link=" + link
				+ ", getVid()=" + getVid() + ", getTitle()=" + getTitle() + ", getDescription()=" + getDescription()
				+ ", getLink()=" + getLink() + "]";
	}
	
	
	
}
