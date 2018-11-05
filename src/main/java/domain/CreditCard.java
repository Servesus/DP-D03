
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

@Entity
@Access(AccessType.PROPERTY)
public class CreditCard extends Customer {

	private String	holderName;
	private String	brandName;
	private int		number;
	private int		month;
	private int		expirationYear;
	private int		cvv;


	@NotBlank
	public String getHolderName() {
		return this.holderName;
	}

	@NotBlank
	public String getBrandName() {
		return this.brandName;
	}

	@CreditCardNumber
	public int getNumber() {
		return this.number;
	}

	@Range(min = 0, max = 12)
	public int getMonth() {
		return this.month;
	}

	public int getExpirationYear() {
		return this.expirationYear;
	}

	@Range(min = 100, max = 999)
	public int getCvv() {
		return this.cvv;
	}

	public void setHolderName(final String holderName) {
		this.holderName = holderName;
	}

	public void setBrandName(final String brandName) {
		this.brandName = brandName;
	}

	public void setNumber(final int number) {
		this.number = number;
	}

	public void setMonth(final int month) {
		this.month = month;
	}

	public void setExpiratioYear(final int expirationYear) {
		this.expirationYear = expirationYear;
	}

	public void setCvv(final int cvv) {
		this.cvv = cvv;
	}

}
