
package acme.forms;

import acme.client.data.AbstractForm;

public class AuditDashboard extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	Integer						numStaticCodeAudits;
	Integer						numDynamicCodeAudits;
	Integer						averageAuditRecords;
	Integer						deviationAuditRecords;
	Integer						minNumAuditRecords;
	Integer						maxNumAuditRecords;
	Integer						averageAuditRecordsPeriodLength;
	Integer						deviationAuditRecordsPeriodLength;
	Integer						minAuditRecordsPeriodLength;
	Integer						maxAutitRecordsPeriodLength;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
