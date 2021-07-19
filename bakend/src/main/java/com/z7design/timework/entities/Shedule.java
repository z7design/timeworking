package com.z7design.timework.entities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_shedule")
public class Shedule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant date;
	
	private Time hoursInit;
	private Time hoursExit;
	private Date month;
	private Date year;
	
	public Shedule() {
		
	}

	public Shedule(Long id, Instant date, Time hoursInit, Time hoursExit, Date month, Date year) {
		super();
		Id = id;
		this.date = date;
		this.hoursInit = hoursInit;
		this.hoursExit = hoursExit;
		this.month = month;
		this.year = year;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

	public Time getHoursInit() {
		return hoursInit;
	}

	public void setHoursInit(Time hoursInit) {
		this.hoursInit = hoursInit;
	}

	public Time getHoursExit() {
		return hoursExit;
	}

	public void setHoursExit(Time hoursExit) {
		this.hoursExit = hoursExit;
	}

	public Date getMonth() {
		return month;
	}

	public void setMonth(Date month) {
		this.month = month;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	public Shedule(Long id) {
		super();
		Id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shedule other = (Shedule) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
	
	
	
	
}
