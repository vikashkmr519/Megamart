package com.megamart.userservice.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;


@MappedSuperclass
public abstract class AbstractMappedEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@CreatedDate
	@JsonFormat(shape = Shape.STRING)
	@Column(name = "created_at")
	private Timestamp createdAt;
	
	@LastModifiedDate
	@JsonFormat(shape = Shape.STRING)
	@Column(name = "updated_at")
	private Timestamp updatedAt;

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	

}
