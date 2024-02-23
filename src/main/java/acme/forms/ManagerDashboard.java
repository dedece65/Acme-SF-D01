
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

	Integer						numMustUserStory;
	Integer						numShouldUserStories;
	Integer						numCouldUserStories;
	Integer						numWontUserStories;
	Double						averageEstimatedCostUserStories;
	Double						deviationEstimatedCostUserStories;
	Double						minEstimatedCostUserStories;
	Double						maxEstimatedCostUserStories;
	Double						averageCostProjects;
	Double						deviationCostProjects;
	Double						minCostProjects;
	Double						maxCostProjects;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
