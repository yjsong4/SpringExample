package com.syj.spring.ex.jpa.domain;

import java.util.Date;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder(toBuilder=true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name="new_student")
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@Column(name="phoneNumber")
	private String phoneNumber;
	private String email;
	
	@Column(name="dreamJob")
	private String dreamJob;
	
	@Column(name="createdAt", updatable=false)
	@UpdateTimestamp
	private Date createdAt;
	
	@Column(name="updatedAt")
	@UpdateTimestamp
	private Date updatedAt;
}
