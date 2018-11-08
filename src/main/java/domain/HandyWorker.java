
package domain;

import java.util.Collection;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class HandyWorker extends Actor {

	//Relationships
	private Collection<Application>	applications;
	private Collection<Phase>		phases;
	private Curricula				curricula;
	private Collection<Finder>		finder;


	@Valid
	@OneToMany
	public Collection<Finder> getFinder() {
		return this.finder;
	}

	public void setFinder(final Collection<Finder> finder) {
		this.finder = finder;
	}

	@Valid
	@OneToMany(mappedBy = "application")
	public Collection<Application> getApplications() {
		return this.applications;
	}

	public void setApplications(final Collection<Application> applications) {
		this.applications = applications;
	}
	@Valid
	@OneToMany
	public Collection<Phase> getPhases() {
		return this.phases;
	}

	public void setPhases(final Collection<Phase> phases) {
		this.phases = phases;
	}

	@NotNull
	@Valid
	@OneToOne(optional = false)
	public Curricula getCurricula() {
		return this.curricula;
	}

	public void setCurricula(final Curricula curricula) {
		this.curricula = curricula;
	}

}
