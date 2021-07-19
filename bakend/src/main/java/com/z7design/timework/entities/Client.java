package com.z7design.timework.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

	
	@Entity
	@Table(name = "tb_client")
	public class Client implements Serializable {
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
				
		private String name;
		private String cpf;
		private String cnpj;
		private String razonSocial;
		private String email;
		private String imgUrl;
				
		@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
		private Instant dateRegister;
		
		@ManyToOne
		@JoinColumn(name = "route_id")
		private Route route;
		
		@ManyToMany(fetch = FetchType.EAGER)
		@JoinTable(name = "tb_client_route",
		joinColumns = @JoinColumn(name = "client_id"),
		inverseJoinColumns = @JoinColumn(name = "route_id"))
		Set<Route> routes = new HashSet<>();
		
		
		public Client() {
		}


		public Client(Long id, String name, String cpf, String cnpj, String razonSocial, String email, String imgUrl,
				Instant dateRegister) {
			super();
			this.id = id;
			this.name = name;
			this.cpf = cpf;
			this.cnpj = cnpj;
			this.razonSocial = razonSocial;
			this.email = email;
			this.imgUrl = imgUrl;
			this.dateRegister = dateRegister;
			
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getCpf() {
			return cpf;
		}


		public void setCpf(String cpf) {
			this.cpf = cpf;
		}


		public String getCnpj() {
			return cnpj;
		}


		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}


		public String getRazonSocial() {
			return razonSocial;
		}


		public void setRazonSocial(String razonSocial) {
			this.razonSocial = razonSocial;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}

		
		public String getImgUrl() {
			return imgUrl;
		}


		public void setImgUrl(String imgUrl) {
			this.imgUrl = imgUrl;
		}


		public Instant getDateRegister() {
			return dateRegister;
		}


		public void setDateRegister(Instant dateRegister) {
			this.dateRegister = dateRegister;
		}
		
		public Route getRoute() {
			return route;
		}



		public Set<Route> getRoutes() {
			return routes;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
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
			Client other = (Client) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}

		
}
