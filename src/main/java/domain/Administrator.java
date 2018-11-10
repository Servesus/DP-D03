
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
<<<<<<< HEAD
=======
import javax.persistence.OneToMany;
>>>>>>> 97517ca787832acb57d01fc5c4fc501b4a33e52d

@Entity
@Access(AccessType.PROPERTY)
public class Administrator extends Actor {

	//Relationships 
	private Collection<Category>		categorys;
	private Collection<Configuration>	configurations;


<<<<<<< HEAD
	public Collection<Category> getCategorys() {
		return this.categorys;
	}

=======
	@OneToMany
	public Collection<Category> getCategorys() {
		return this.categorys;
	}
	@OneToMany
>>>>>>> 97517ca787832acb57d01fc5c4fc501b4a33e52d
	public Collection<Configuration> getConfigurations() {
		return this.configurations;
	}

	public void setCategorys(final Collection<Category> categorys) {
		this.categorys = categorys;
	}

	public void setConfigurations(final Collection<Configuration> configurations) {
		this.configurations = configurations;
	}

}
