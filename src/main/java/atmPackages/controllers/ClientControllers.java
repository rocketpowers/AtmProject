package atmPackages.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import atmPackages.model.Clients;
import atmPackages.repositories.ClientsRepositorie;

@RestController
public class ClientControllers {

	@Autowired
	private ClientsRepositorie clientsRepositorie;

	@GetMapping("/list")
	public List<Clients> clients() {
		return clientsRepositorie.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Clients> findById(@PathVariable Long id) {

		return clientsRepositorie.findById(id);

	}

	@PostMapping("/register")
	public Clients Register(@RequestBody Clients savclients) {
		System.out.println("create sucessfull");
		return clientsRepositorie.save(savclients);

	}
	
	@PutMapping("/update")
	public Clients update(@RequestBody Clients clients) {
		System.out.println("update sucessfull");
		return clientsRepositorie.save(clients);
	}
	
	@DeleteMapping("/del/{id}")
	public void delete(@PathVariable long id) {
		clientsRepositorie.deleteById(id);
		System.out.println("removed sucessfull");
	}

}
