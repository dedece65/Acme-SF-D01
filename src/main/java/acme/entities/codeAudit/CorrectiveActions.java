
package acme.entities.codeAudit;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import acme.client.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CorrectiveActions extends AbstractEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	@Length(max = 101)
	private String				action;

	@NotNull
	@Valid
	@ManyToOne(optional = false)
	private CodeAudit				audit;

}
