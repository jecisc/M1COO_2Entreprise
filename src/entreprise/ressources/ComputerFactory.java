package entreprise.ressources;

import java.util.HashSet;
import java.util.Set;

public class ComputerFactory {

	protected static ComputerFactory CURRENT = new ComputerFactory();

	protected Set<Computer> computers;

	protected Integer cpt;

	public static ComputerFactory current() {
		return ComputerFactory.CURRENT;
	}

	private ComputerFactory() {
		this.computers = new HashSet<Computer>();
		this.cpt = 0;
	}

	public Computer createComputer() {
		String name = "PC" + this.cpt.toString();
		this.cpt = this.cpt + 1;
		Computer computer = new Computer(name);
		this.computers.add(computer);
		return computer;
	}

	public void deleteComputerNamed(String name) {
		for (Computer computer : this.computers) {
			if (computer.name() == name) {
				this.deleteComputer(computer);
			}
		}
	}

	public void deleteComputer(Computer computer) {
		for (License license : computer.licenses()) {
			license.computer(null);
		}
		this.computers.remove(computer);
	}

}
