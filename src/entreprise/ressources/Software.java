package entreprise.ressources;

import java.util.Set;

public class Software {

	protected Set<License> licenses;

	protected String name;

	public Software(String name) {
		this.name = name;
	}
	// TODO hash

	public String name() {
		return this.name;
	}
	
	public void removeLicense(License license){
		this.licenses.remove(license);
	}

	public Set<License> licenses() {
		return licenses;
	}
}
