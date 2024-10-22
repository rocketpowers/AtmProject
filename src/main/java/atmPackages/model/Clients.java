package atmPackages.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Clients{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;

	public String name;


	public String cpf;

}
