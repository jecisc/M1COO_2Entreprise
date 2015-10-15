package entreprise.ressources;

import java.util.HashSet;
import java.util.Set;

public class SoftwareFactory {

	protected static SoftwareFactory CURRENT = new SoftwareFactory();

	protected Set<Software> softwares;

	public static SoftwareFactory current() {
		return SoftwareFactory.CURRENT;
	}

	private SoftwareFactory() {
		this.softwares = new HashSet<Software>();
	}

	public Software createSoftwareNamed(String name) {
		Software software = new Software(name);
		this.softwares.add(software);
		return software;
	}

	public void removeSoftwareNamed(String name) {
		for (Software software : this.softwares) {
			if (software.name() == name) {
				this.deleteSoftware(software);
			}

		}
	}

	public void deleteSoftware(Software software) {
		for(License license : software.licenses()){
			LicenseFactory.current().removeLicence(license);
			}
		this.softwares.remove(software);
	}

}
