
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Application extends DomainEntity {

	private Date					moment;
	private double					price;
	private Collection<String>		comments;
	private String					status;
	private Collection<String>		customerComments;
	private Collection<String>		hwComments;
	private HandyWorker				handyWorker;
	private Collection<Fix_up_Task>	fixUpTasks;


	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	public Date getMoment() {
		return this.moment;
	}

	public double getPrice() {
		return this.price;
	}
	@ElementCollection
	public Collection<String> getComments() {
		return this.comments;
	}

	@NotBlank
	public String getStatus() {
		return this.status;
	}
	@ElementCollection
	public Collection<String> getCustomerComment() {
		return this.customerComments;
	}
	@ElementCollection
	public Collection<String> getHwComments() {
		return this.hwComments;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	public void setPrice(final double price) {
		this.price = price;
	}

	public void setComments(final Collection<String> comments) {
		this.comments = comments;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	public void setCustomerComments(final Collection<String> customerComments) {
		this.customerComments = customerComments;
	}

	public void setHwComments(final Collection<String> hwComments) {
		this.hwComments = hwComments;
	}

	@Valid
	@NotNull
	@ManyToOne(optional = false)
	public HandyWorker getHandyWorker() {
		return this.handyWorker;
	}

	public void setHandyWorker(final HandyWorker handyWorker) {
		this.handyWorker = handyWorker;
	}

	@ManyToMany
	public Collection<Fix_up_Task> getFixUpTasks() {
		return this.fixUpTasks;
	}

	public void setFixUpTasks(final Collection<Fix_up_Task> fixUpTasks) {
		this.fixUpTasks = fixUpTasks;
	}

}
