
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.Valid;

@Entity
@Access(AccessType.PROPERTY)
public class Customer extends Actor {

	private Collection<CreditCard>	creditCards;
	private Collection<Complaint>	complaints;
	private Collection<Fix_up_Task>	fixUpTasks;


	@Valid
	@OneToMany(cascade = CascadeType.ALL)
	public Collection<CreditCard> getCreditCards() {
		return this.creditCards;
	}

	public void setCreditCards(final Collection<CreditCard> creditCards) {
		this.creditCards = creditCards;
	}

	@Valid
	@OneToMany
	public Collection<Complaint> getComplaints() {
		return this.complaints;
	}

	public void setComplaints(final Collection<Complaint> complaints) {
		this.complaints = complaints;
	}

	@Valid
	@OneToMany
	public Collection<Fix_up_Task> getFixUpTasks() {
		return this.fixUpTasks;
	}

	public void setFixUpTask(final Collection<Fix_up_Task> fixUpTasks) {
		this.fixUpTasks = fixUpTasks;
	}

}
