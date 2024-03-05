
package acme.entities.training;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.client.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TrainingModule extends AbstractEntity {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@Column(unique = true)
	@NotBlank
	@Pattern(regexp = "[A-Z]{1,3}-[0-9]{3}", message = "{validation.project.code}")
	private String				code;

	@NotNull
	@Past
	private LocalDate			creationMoment;

	@NotBlank
	@Length(max = 100)
	private String				details;

	private Difficulty			difficultyLevel;

	@Past
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDate			updateMoment;

	@URL
	private String				link;

	@NotNull
	private LocalDate			totalTime; //Preguntar que tipo de variable es esta
}
