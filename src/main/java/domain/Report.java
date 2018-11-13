
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Report extends DomainEntity {

	//Attributes
	private Date	moment;
	private String	description;
	private String	attachment;
	private Boolean	isFinal;


	//Getters and setters
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	public Date getMoment() {
		return this.moment;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	@URL
	public String getAttachment() {
		return this.attachment;
	}

	public Boolean getIsFinal() {
		return this.isFinal;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public void setAttachment(final String attachment) {
		this.attachment = attachment;
	}

	public void setIsFinal(final Boolean isFinal) {
		this.isFinal = isFinal;
	}


	//Relationships
	private Collection<Note>		notes;
	private Collection<Complaint>	complaint;
	private Collection<Referee>		referees;


	@OneToMany(cascade = CascadeType.ALL)
	public Collection<Note> getNotes() {
		return this.notes;
	}

	@ManyToMany
	public Collection<Complaint> getComplaint() {
		return this.complaint;
	}

	@NotNull
	@ManyToMany
	public Collection<Referee> getReferees() {
		return this.referees;
	}

	public void setNotes(final Collection<Note> notes) {
		this.notes = notes;
	}

	public void setComplaint(final Collection<Complaint> complaint) {
		this.complaint = complaint;
	}

	public void setReferees(final Collection<Referee> referees) {
		this.referees = referees;
	}

}
