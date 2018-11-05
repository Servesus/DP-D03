
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class EducationalRecord extends DomainEntity {

	private String				diplomasTitle;
	private Date				studiesBeggining;
	private Date				studiesEnding;
	private String				institution;
	private String				attachment;
	private Collection<String>	comment;


	@NotBlank
	public String getDiplomasTitle() {
		return this.diplomasTitle;
	}
	public void setDiplomasTitle(final String diplomasTitle) {
		this.diplomasTitle = diplomasTitle;
	}
	@Past
	@NotNull
	public Date getStudiesBeggining() {
		return this.studiesBeggining;
	}
	public void setStudiesBeggining(final Date studiesBeggining) {
		this.studiesBeggining = studiesBeggining;
	}
	public Date getStudiesEnding() {
		return this.studiesEnding;
	}
	public void setStudiesEnding(final Date studiesEnding) {
		this.studiesEnding = studiesEnding;
	}
	@NotNull
	public String getInstitution() {
		return this.institution;
	}
	public void setInstitution(final String institution) {
		this.institution = institution;
	}
	@URL
	public String getAttachment() {
		return this.attachment;
	}
	public void setAttachment(final String attachment) {
		this.attachment = attachment;
	}
	public Collection<String> getComment() {
		return this.comment;
	}
	public void setComment(final Collection<String> comment) {
		this.comment = comment;
	}
}
