
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
<<<<<<< HEAD
=======
import javax.persistence.ManyToMany;
>>>>>>> 97517ca787832acb57d01fc5c4fc501b4a33e52d

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Category extends DomainEntity {

	//Attributes 
	private String	name;


	//Getters and setters
	@NotBlank
	public String getNombre() {
		return this.name;
	}
	public void setNombre(final String name) {
		this.name = name;
	}


	//Relationships 
	private Collection<Category>	childs;
	private Collection<Category>	parents;


<<<<<<< HEAD
	public Collection<Category> getChilds() {
		return this.childs;
	}

=======
	@ManyToMany(mappedBy = "parents")
	public Collection<Category> getChilds() {
		return this.childs;
	}
	@ManyToMany
>>>>>>> 97517ca787832acb57d01fc5c4fc501b4a33e52d
	public Collection<Category> getParents() {
		return this.parents;
	}

	public void setChilds(final Collection<Category> childs) {
		this.childs = childs;
	}

	public void setParents(final Collection<Category> parents) {
		this.parents = parents;
	}

}
