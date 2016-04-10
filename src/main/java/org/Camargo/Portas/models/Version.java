package org.Camargo.Portas.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Version {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String version;
	
	public Version() {}
	
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Version [ " + version + " ]";
	}
}
