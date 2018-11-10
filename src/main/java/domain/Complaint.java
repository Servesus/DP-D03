
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Complaint extends DomainEntity {

	private String					ticker;
	private Date					moment;
	private String					description;
	private Collection<String>		attchment;

	//Relationships:
	private Customer				customer;
	private Collection<Report>		reports;
	private Collection<Fix_up_Task>	fix_up_tasks;


	@NotBlank
	@Column(unique = true)
	@Pattern(regexp = "^(\\d{6})(-)([A-Z0-9] {6})$")
	public String getTicker() {
		return this.ticker;
	}

	@Column(unique = true)
	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public Collection<String> getAttchment() {
		return this.attchment;
	}

	public void setAttchment(final Collection<String> attchment) {
		this.attchment = attchment;
	}

	//Relationships:

	@NotNull
	@Valid
	@ManyToOne(optional = false)
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}

	@Valid
	@ManyToMany(mappedBy = "complaint")
	public Collection<Report> getReports() {
		return this.reports;
	}

	public void setReports(final Collection<Report> reports) {
		this.reports = reports;
	}

	@Valid
	@ManyToMany(mappedBy = "complaints")
	public Collection<Fix_up_Task> getFix_up_tasks() {
		return this.fix_up_tasks;
	}

	public void setFix_up_tasks(final Collection<Fix_up_Task> fix_up_tasks) {
		this.fix_up_tasks = fix_up_tasks;
	}

}
