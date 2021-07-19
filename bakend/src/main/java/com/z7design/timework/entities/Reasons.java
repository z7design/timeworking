package com.z7design.timework.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	
	@Entity
	@Table(name = "tb_reasons")
	public class Reasons implements Serializable {
		private static final long serialVersionUID = 1L;

		@Id	
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long Id;
		private String name;
	
		public Reasons() {
			
		}

		public Reasons(Long id, String name) {
			super();
			Id = id;
			this.name = name;
		}

		public Long getId() {
			return Id;
		}

		public void setId(Long id) {
			Id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
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
			Reasons other = (Reasons) obj;
			if (Id == null) {
				if (other.Id != null)
					return false;
			} else if (!Id.equals(other.Id))
				return false;
			return true;
		}
		
		

}
