
package acme.entities.training;

import java.time.Period;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.client.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TrainingSession extends AbstractEntity {

	// Serialisation identifier ----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes ------------------------------------------------------------

	@Column(unique = true)
	@NotBlank
	@Pattern(regexp = "^TS-[A-Z]{1,3}-[0-9]{3}$")
	private String				code;

	@NotNull
	private Period				period; // Preguntar one week ahead of module creation moment
	// y one week long

	@NotBlank
	@Length(max = 75)
	private String				location;

	@NotBlank
	@Length(max = 75)
	private String				instructor;

	@NotBlank
	@Email
	@Length(max = 255)
	private String				email;

	@URL
	@Length(max = 255)
	private String				link;

	// Derived attributes ----------------------- ------------------------------

	// Relationships -----------------------------------------------------------

	@NotNull
	@Valid
	@ManyToOne(optional = false)
	private TrainingModule		trainingModule;

}
