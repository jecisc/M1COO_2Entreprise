package entreprise.ressources;

import java.util.HashSet;
import java.util.Set;

public class LicenseFactory {

	protected static LicenseFactory CURRENT = new LicenseFactory();

	protected Set<License> licenses;
	
	public static LicenseFactory current(){
		return LicenseFactory.CURRENT;
	}
	
	private LicenseFactory(){
		this.licenses = new HashSet<License>();
	}
	
	public License createLicenseFor(Software software){
		License license = new License(software);
		this.licenses.add(license);
		return license;
	}
	
	public void removeLicence(License license){
		Computer computer = license.computer(); 
		if(!( computer == null)){
			computer.removeLicense(license);
		}
		license.software.removeLicense(license);
		this.licenses.remove(license);
	}
	
	public Set<License> licenses() {
		return this.licenses;
	}
	
}
