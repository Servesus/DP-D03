
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.Valid;

@Entity
@Access(AccessType.PROPERTY)
public class Administrator extends Actor {

	//Relationships 
	private Collection<Category>		categorys;
	private Collection<Configuration>	configurations;


	@Valid
	public Collection<Category> getCategorys() {
		return this.categorys;
	}
	@Valid
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
