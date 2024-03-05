
package acme.roles;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import acme.client.data.AbstractRole;

public class Client extends AbstractRole {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@Column(unique = true)
	@NotBlank
	@Pattern(regexp = "^CLI-[0-9]{4}$")
	private String				identification;

	@NotBlank
	@Length(max = 75)
	private String				companyName;

	@NotBlank
	private Type				type;

	@NotBlank
	private String				email;

	private String				link;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
