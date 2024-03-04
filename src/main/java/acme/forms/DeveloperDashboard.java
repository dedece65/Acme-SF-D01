
package acme.forms;

import acme.client.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeveloperDashboard extends AbstractForm {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	Integer						numTrainingModules;
	Integer						numTrainingSessions;
	Double						averageTimeOfTrainingModule;
	Double						deviationTimeOfTrainingModule;
	Double						minTimeOfTrainingModule;
	Double						maxTimeOfTrainingModule;
}
