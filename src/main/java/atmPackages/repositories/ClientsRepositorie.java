package atmPackages.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import atmPackages.model.Clients;



public interface ClientsRepositorie extends JpaRepository<Clients, Long> {

}
