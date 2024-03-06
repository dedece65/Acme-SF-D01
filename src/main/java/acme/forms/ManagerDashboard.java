
package acme.forms;

import acme.client.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ManagerDashboard extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	int							numMustUserStories;
	int							numShouldUserStories;
	int							numCouldUserStories;
	int							numWontUserStories;
	Double						averageEstimatedCostUserStories;
	Double						deviationEstimatedCostUserStories;
	Integer						minEstimatedCostUserStories;
	Integer						maxEstimatedCostUserStories;
	Double						averageCostProjects;
	Double						deviationCostProjects;
	Integer						minCostProjects;
	Integer						maxCostProjects;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
