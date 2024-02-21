
package acme.entities.userStories;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import acme.client.data.AbstractEntity;
import acme.entities.projects.Project;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserStory extends AbstractEntity {

	// Serialisation identifier ----------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes ------------------------------------

	@NotBlank
	@Length(max = 76)
	private String				title;

	@NotBlank
	@Length(max = 101)
	private String				description;

	@Min(0)
	private double				estimatedCost;   // preguntar tipo (podria ser Date) y restricciones

	@NotBlank
	@Length(max = 101)
	private String				acceptanceCriteria;

	private Priority			priority;

	private String				optional;

	// Relations ---------------------------------------

	@ManyToOne()  // las historias de usuario tiene que tener siempre un proyecto?
	private Project				project;

}
