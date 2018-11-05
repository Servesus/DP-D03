
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class Fix_up_Task extends DomainEntity {

	private String					ticker;
	private Date					starDate;
	private String					description;
	private String					address;
	private double					maxPrice;
	private Date					estimatedDate;

	//Relationships:
	private Collection<Application>	aplications;
	private Collection<Complaint>	complaints;
	private Finder					finder;
	private Warranty				warranty;
	private Category				category;


	@NotBlank
	@Column(unique = true)
	@Pattern(regexp = "^(\\d{6})(-)([A-Z0-9] {6})$")
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	public Date getStarDate() {
		return this.starDate;
	}

	public void setStarDate(final Date starDate) {
		this.starDate = starDate;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@NotBlank
	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	public double getMaxPrice() {
		return this.maxPrice;
	}

	public void setMaxPrice(final double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public Date getEstimatedDate() {
		return this.estimatedDate;
	}

	public void setEstimatedDate(final Date estimatedDate) {
		this.estimatedDate = estimatedDate;
	}
	//Relationships:

	@Valid
	public Collection<Application> getAplications() {
		return this.aplications;
	}

	public void setAplications(final Collection<Application> aplications) {
		this.aplications = aplications;
	}

	@Valid
	public Collection<Complaint> getComplaints() {
		return this.complaints;
	}

	public void setComplaints(final Collection<Complaint> complaints) {
		this.complaints = complaints;
	}

	@Valid
	@NotNull
	public Finder getFinder() {
		return this.finder;
	}

	public void setFinder(final Finder finder) {
		this.finder = finder;
	}

	@Valid
	@NotNull
	public Warranty getWarranty() {
		return this.warranty;
	}

	public void setWarranty(final Warranty warranty) {
		this.warranty = warranty;
	}

	@Valid
	@NotNull
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(final Category category) {
		this.category = category;
	}
}
