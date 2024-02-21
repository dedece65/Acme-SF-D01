
package acme.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.URL;

import acme.client.data.AbstractEntity;
import acme.entities.sponsorShip.SponsorShip;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Invoice extends AbstractEntity {

	private static final long	serialVersionUID	= 1L;

	@Column(unique = true)
	@NotBlank
	@Pattern(regexp = "IN-[0-9]{4}-[0-9]{4}")
	private String				code;

	@Past
	private LocalDate			registrationTime;

	private LocalDate			dueDate;

	@Positive
	private Double				quantity;

	@Positive
	private Double				tax;

	@URL
	private String				link;


	@Transient
	private Double totalAmount() {
		return this.quantity + this.tax;
	};


	@ManyToOne
	private SponsorShip spornsorShip;

}
