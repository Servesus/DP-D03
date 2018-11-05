
package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Note extends DomainEntity {

	//Attributes
	private String	author;
	private Date	moment;
	private String	authorComment;
	private String	hwComment;
	private String	customerComment;


	//Getters and setters
	@NotBlank
	public String getAuthor() {
		return this.author;
	}

	@NotNull
	public Date getMoment() {
		return this.moment;
	}

	@NotBlank
	public String getAuthorComment() {
		return this.authorComment;
	}

	public String getHWComment() {
		return this.hwComment;
	}

	public String getCustomerComment() {
		return this.customerComment;
	}

	public void setAuthor(final String author) {
		this.author = author;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	public void setAuthorComment(final String authorComment) {
		this.authorComment = authorComment;
	}

	public void setHWComment(final String hwComment) {
		this.hwComment = hwComment;
	}

	public void setCustomerComment(final String customerComment) {
		this.customerComment = customerComment;
	}
}
