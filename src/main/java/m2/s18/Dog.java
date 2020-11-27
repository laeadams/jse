package m2.s18;

//import java.util.Objects;

public class Dog implements Comparable<Dog> {
	private String name;
	private String owner;

	public Dog(String name, String owner) { // questo è il costruttore
		this.name = name;
		this.owner = owner;
	}

	// metodo getter
	public String getName() {
		return name;
	}

	// questo è il setter: per modificare la proprietà
	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	// voglio scrivere un metodo per vedere se i due cani sono uguali. Se non faccio
	// l'override e uso l'equals dell'Object dice che due cani sono uguali solo se
	// sono lo stesso cane.
	// N.B. per rifare equals() devo rifare anche hashCode()
//	@Override
//	public boolean equals(Object obj) {
//		// or use IDE auto-generation tool
//		if (obj == this) {
//			return true;
//		}
//		if (!(obj instanceof Dog)) {
//			return false;
//		}
//
//		Dog that = (Dog) obj;
//		if (Objects.equals(this.name, that.name) && Objects.equals(this.owner, that.owner)) {
//			return true;
//		}
//
//		return false;
//	}
//
//	@Override
//	public int hashCode() {
//		// consider using an external library for better performance
//		// or use IDE auto-generation tool
//		// or extract code from Arrays.hashCode()
//		return Objects.hash(name, owner);
//	}
	
	// hashCode() e equals() auto-generati da Eclipse
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // se il reference è lo stesso, i due oggetti saranno ovviamente uguali
			return true;
		if (obj == null) // check sul null
			return false;
		if (getClass() != obj.getClass()) // per controllare se obj è dello stesso tipo del mio Dog
			return false;
		Dog other = (Dog) obj; // faccio un cast del oggetto Dog
		if (name == null) {   // a questo punto controllerò le stringhe name e owner se sono uguali
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true; // se tutto è uguale, i miei oggetti saranno finalmente uguali
	}

	
	@Override
	public String toString() {
		// or use IDE auto-generation tool
		return "Dog [" + name + ", " + owner + "]";
	}
	
	@Override
	public int compareTo(Dog that) { // ritorna 0 solo e sia i nome sia gli owner sono uguali
		int cmp = this.name.compareTo(that.name);
		if (cmp == 0) {
			return this.owner.compareTo(that.owner);
		}
		return cmp;
	}
}
