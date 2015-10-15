package entreprise.ressources;

import java.util.Set;

public class Computer {

	protected Set<License> licenses;

	protected String name;

	public Computer(String name) {
		this.name = name;
	}
	
	public String name(){
		return this.name;
	}
	
	public Set<License> licenses() {
		return licenses;
	}
	
	public void addLicense(License license) {
		this.licenses.add(license);
	}
	
	public void removeLicense(License license){
		this.licenses.remove(license);
	}

	// TODO hash
}
