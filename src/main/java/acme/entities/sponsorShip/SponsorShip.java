
package acme.entities.sponsorShip;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.URL;

import acme.client.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SponsorShip extends AbstractEntity {

	private static final long	serialVersionUID	= 1L;

	@Column(unique = true)
	@NotBlank
	@Pattern(regexp = "[A-Z]{1,3}-[0-9]{3}")
	private String				code;

	@Past
	private LocalDate			moment; //LocalDate o LocalDateTime

	private LocalDate			duration; //Que se refiere con esto

	@Positive
	private Double				amount;

	private Type				type;

	@Email
	private String				email;

	@URL
	private String				link;

	//@ManyToOne
	//private Project project;

}
