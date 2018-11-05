
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

import security.UserAccount;

@Entity
@Access(AccessType.PROPERTY)
public abstract class Actor extends DomainEntity {

	private String					name;
	private String					middleName;
	private String					surname;
	private String					photo;
	private String					email;
	private String					phoneNumber;
	private String					address;
	private String					make	= this.name + this.middleName + this.surname;
	private boolean					isSuspicious;
	private boolean					isBanned;
	private Collection<UserAccount>	userAccounts;
	private Collection<Profile>		profiles;
	private Collection<Message>		messages;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	@NotBlank
	public String getSurname() {
		return this.surname;
	}

	@URL
	public String getPhoto() {
		return this.photo;
	}

	@Email
	public String getEmail() {
		return this.email;
	}

	@Pattern(regexp = "^(+[1-9]\\d{0,2}([1-9]\\d{0,2})\\d{4,})$|^(+[1-9]\\d{0,2} \\d{4,})$|^(\\d{4,})$")
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public String getAddress() {
		return this.address;
	}
	@NotBlank
	public String getMake() {
		return this.make;
	}

	public boolean isSuspicious() {
		return this.isSuspicious;
	}

	public boolean isBanned() {
		return this.isBanned;
	}

	public void setIsBanned(final boolean isBanned) {
		this.isBanned = isBanned;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	public void setPhoto(final String photo) {
		this.photo = photo;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public void setPhoneNumber(final String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	public void setMake(final String make) {
		this.make = make;
	}

	public void setIsSuspicious(final boolean isSuspicious) {
		this.isSuspicious = isSuspicious;
	}

	@Valid
	@NotNull
	public Collection<UserAccount> getUserAccounts() {
		return this.userAccounts;
	}

	public void setUserAccount(final Collection<UserAccount> userAccounts) {
		this.userAccounts = userAccounts;
	}

	@Valid
	public Collection<Profile> getProfiles() {
		return this.profiles;
	}

	public void setProfile(final Collection<Profile> profiles) {
		this.profiles = profiles;
	}

	@Valid
	public Collection<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(final Collection<Message> messages) {
		this.messages = messages;
	}

}
