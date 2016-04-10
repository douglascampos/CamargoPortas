package org.Camargo.Portas.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.Camargo.Portas.models.Version;

public class VersionDAO {

	@PersistenceContext
	private EntityManager manager;
	
	public Version load() {
		return manager.createQuery("FROM Version v", Version.class).getSingleResult();
	}

}
