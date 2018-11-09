
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
@Access(AccessType.PROPERTY)
public class Finder extends DomainEntity {

	private String	singleKeyWord;
	private Integer	rangeStart;
	private Integer	rangeFinish;
	private Date	dateStartRange;
	private Date	dateFinishRange;


	public String getSingleKeyWord() {
		return this.singleKeyWord;
	}

	public void setSingleKeyWord(final String singleKeyWord) {
		this.singleKeyWord = singleKeyWord;
	}

	public Integer getRangeStartRange() {
		return this.rangeStart;
	}

	public void setRangeStartRange(final Integer rangeStartRange) {
		this.rangeStart = rangeStartRange;
	}

	public Integer getRangeFinishRange() {
		return this.rangeFinish;
	}

	public void setRangeFinishRange(final Integer rangeFinishRange) {
		this.rangeFinish = rangeFinishRange;
	}
	@NotNull
	public Date getDateStartRange() {
		return this.dateStartRange;
	}

	public void setDateStartRange(final Date dateStartRange) {
		this.dateStartRange = dateStartRange;
	}
	@NotNull
	public Date getDateFinishRange() {
		return this.dateFinishRange;
	}

	public void setDateFinishRange(final Date dateFinishRange) {
		this.dateFinishRange = dateFinishRange;
	}


	//Relationships
	private Configuration			configuration;
	private Collection<Fix_up_Task>	fixUpTask;
	private Collection<Warranty>	warranties;
	private Collection<Category>	categories;


	@NotNull
	@Valid
	@OneToOne(optional = false)
	public Configuration getConfiguration() {
		return this.configuration;
	}

	public void setConfiguration(final Configuration configuration) {
		this.configuration = configuration;
	}

	@Valid
	@OneToMany(mappedBy = "finder")
	public Collection<Fix_up_Task> getFixUpTask() {
		return this.fixUpTask;
	}

	public void setFixUpTask(final Collection<Fix_up_Task> fixUpTask) {
		this.fixUpTask = fixUpTask;
	}

	@Valid
	@OneToMany
	public Collection<Warranty> getWarranties() {
		return this.warranties;
	}

	public void setWarranties(final Collection<Warranty> warranties) {
		this.warranties = warranties;
	}

	@Valid
	@OneToMany
	public Collection<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(final Collection<Category> categories) {
		this.categories = categories;
	}

}
