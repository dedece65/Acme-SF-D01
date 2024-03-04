
package acme.entities.training;

import java.time.Period;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.URL;

import acme.client.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TrainingSession extends AbstractEntity {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@Column(unique = true)
	@NotBlank
	@Pattern(regexp = "TS-[A-Z]{1,3}-[0-9]{3}", message = "{validation.project.code}")
	private String				code;

	@NotNull
	private Period				period;

	@NotBlank
	@Max(76)
	private String				location;

	@NotBlank
	@Max(76)
	private String				instructor;

	@NotBlank
	@Email
	private String				email;

	@URL
	private String				link;
}
