
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Curricula extends DomainEntity {

	private String							ticker;
	private PersonalRecord					personalRecord;
	private Collection<EducationalRecord>	educationalRecord;
	private Collection<ProfessionalRecord>	professionalRecord;
	private Collection<EndorserRecord>		endorserRecord;
	private Collection<MiscRecord>			miscRecord;


	@NotBlank
	@Column(unique = true)
	@Pattern(regexp = "^(\\d{6})(-)([A-Z0-9] {6})$")
	public String getTicker() {
		return this.ticker;
	}
	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}
	@NotNull
	@Valid
	@OneToOne(cascade = CascadeType.ALL)
	public PersonalRecord getPersonalRecord() {
		return this.personalRecord;
	}
	public void setPersonalRecord(final PersonalRecord personalRecord) {
		this.personalRecord = personalRecord;
	}
<<<<<<< HEAD

=======
	@Valid
	@OneToMany(cascade = CascadeType.ALL)
>>>>>>> origin/manuercaximba
	public Collection<EducationalRecord> getEducationalRecord() {
		return this.educationalRecord;
	}
	public void setEducationalRecord(final Collection<EducationalRecord> educationalRecord) {
		this.educationalRecord = educationalRecord;
	}
<<<<<<< HEAD

=======
	@Valid
	@OneToMany(cascade = CascadeType.ALL)
>>>>>>> origin/manuercaximba
	public Collection<ProfessionalRecord> getProfessionalRecord() {
		return this.professionalRecord;
	}
	public void setProfessionalRecord(final Collection<ProfessionalRecord> professionalRecord) {
		this.professionalRecord = professionalRecord;
	}
<<<<<<< HEAD

=======
	@Valid
	@OneToMany(cascade = CascadeType.ALL)
>>>>>>> origin/manuercaximba
	public Collection<EndorserRecord> getEndorserRecord() {
		return this.endorserRecord;
	}
	public void setEndorserRecord(final Collection<EndorserRecord> endorserRecord) {
		this.endorserRecord = endorserRecord;
	}
<<<<<<< HEAD

=======
	@Valid
	@OneToMany(cascade = CascadeType.ALL)
>>>>>>> origin/manuercaximba
	public Collection<MiscRecord> getMiscRecord() {
		return this.miscRecord;
	}
	public void setMiscRecord(final Collection<MiscRecord> miscRecord) {
		this.miscRecord = miscRecord;
	}

}
