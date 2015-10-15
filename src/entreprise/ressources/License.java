package entreprise.ressources;

public class License {

	protected Computer computer;

	protected Software software;

	public License(Software software) {
		this.software = software;
	}
	
	public Computer computer(){
		return this.computer;
	}

	public void computer(Computer computer) {
		this.computer = computer;
	}

	// TODO Hash pour les sets
}
