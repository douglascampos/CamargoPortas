package org.Camargo.Portas.beans;

import javax.annotation.PostConstruct;
import javax.ejb.TransactionManagement;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.Camargo.Portas.daos.VersionDAO;
import org.Camargo.Portas.models.Version;

@Model
@Transactional
public class VersionBean {

	@Inject
	private VersionDAO versionDAO;
	
	private Version version;
	
	@PostConstruct
	public void postConstruct() {
		version = versionDAO.load();
	}

	public Version getVersion() {
		return version;
	}	
}
