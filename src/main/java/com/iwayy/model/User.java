package com.iwayy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/* 
 * This class represents a user entity in the database 
 * */

@Entity
@Table(name = "user")
@Data
public class User {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name = "first_name")
	private Long firstName;

	@Column(name = "last_name")
	private Long last_name;

	@Column(name = "password")
	private Long password;

}
