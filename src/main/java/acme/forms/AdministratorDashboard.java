
package acme.forms;

import acme.client.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdministratorDashboard extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	Integer						numManagerPrincipals;
	Integer						numClientPrincipals;
	Integer						numDeveloperPrincipals;
	Integer						numSponsorPrincipals;
	Integer						numAuditorPrincipals;
	Double						ratioNoticesWithEmailAndLink;
	Double						ratioCriticalObjectives;
	Double						ratioNonCriticalObjectives;
	Double						averageRisksValues;
	Double						minRisksValues;
	Double						maxRisksValues;
	Double						standardDeviationRisksValues;
	Double						averagePostedClaimsLast10Weeks;
	Double						minPostedClaimsLast10Weeks;
	Double						maxPostedClaimsLast10Weeks;
	Double						standardDeviationPostedClaimsLast10Weeks;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
