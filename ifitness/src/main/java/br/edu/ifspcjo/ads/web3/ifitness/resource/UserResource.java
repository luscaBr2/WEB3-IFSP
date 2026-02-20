package br.edu.ifspcjo.ads.web3.ifitness.resource;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifspcjo.ads.web3.ifitness.domain.model.Gender;
import br.edu.ifspcjo.ads.web3.ifitness.domain.model.User;

@RestController
public class UserResource {
	
	@GetMapping("/users")
	public List<User> list(){
		User user1 = new User();
		
		user1.setId(1L);
		user1.setName("Lucas Santos");
		user1.setEmail("lucas.ifsp387@gmail.com");
		user1.setPassword("123");
		user1.setBirthDate(LocalDate.of(2004, 06, 02));
		user1.setGender(Gender.MASCULINO);
		user1.setActive(true);
		
		return Arrays.asList(user1);
	}
	
}
