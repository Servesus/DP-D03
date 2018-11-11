
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
<<<<<<< HEAD
=======
import javax.persistence.ManyToMany;
import javax.validation.Valid;
>>>>>>> origin/manuercaximba

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Box extends DomainEntity {

	private String				name;
	private Boolean				isSystem;
	private Collection<Box>		parentBoxes;
	private Collection<Box>		childBoxes;
	private Collection<Message>	messages;


	@NotBlank
	public String getName() {
		return this.name;
	}
	public void setName(final String name) {
		this.name = name;
	}
	public Boolean getIsSystem() {
		return this.isSystem;
	}
	public void setIsSystem(final Boolean isSystem) {
		this.isSystem = isSystem;
	}
<<<<<<< HEAD

=======
	@Valid
	@ManyToMany
>>>>>>> origin/manuercaximba
	public Collection<Box> getParentBoxes() {
		return this.parentBoxes;
	}
	public void setParentBoxes(final Collection<Box> parentBoxes) {
		this.parentBoxes = parentBoxes;
	}
<<<<<<< HEAD

=======
	@Valid
	@ManyToMany
>>>>>>> origin/manuercaximba
	public Collection<Box> getChildBoxes() {
		return this.childBoxes;
	}
	public void setChildBoxes(final Collection<Box> childBoxes) {
		this.childBoxes = childBoxes;
	}
<<<<<<< HEAD

=======
	@Valid
	@ManyToMany
>>>>>>> origin/manuercaximba
	public Collection<Message> getMessages() {
		return this.messages;
	}
	public void setMessages(final Collection<Message> messages) {
		this.messages = messages;
	}
}
