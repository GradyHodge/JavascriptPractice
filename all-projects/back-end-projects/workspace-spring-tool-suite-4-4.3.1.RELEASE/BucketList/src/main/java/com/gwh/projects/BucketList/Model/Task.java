package com.gwh.projects.BucketList.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String category;
	@Lob
	private String notes;
//	private Enum priority;
	
//CONSTRUCTORS
	public Task(Long id, String title, String category, String notes) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.notes = notes;
	}
	
	public Task() {}
	
// GETTERS & SETTERS	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
//	public Enum getPriority() {
//		return priority;
//	}
//	public void setPriority(Enum priority) {
//		this.priority = priority;
//	}

	
	
}
