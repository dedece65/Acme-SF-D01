
package acme.forms;

import acme.client.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDashboard extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	Integer						numProgressLogsUnder25;
	Integer						numProgressLogsBetween25and50;
	Integer						numProgressLogsBetween50and75;
	Integer						numProgressLogsAbove75;
	Double						averageBudget;
	Double						deviationBudget;
	Double						minimumBudget;
	Double						maximumBudget;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
}
