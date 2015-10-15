package entreprise.ressources;

public class AssociateLicence {

	public void associateLicenceToComputer(License license, Computer computer){
		license.computer(computer);
		computer.addLicense(license);
	}
}
