package fr.idformation.marioPizza.core.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.idformation.marioPizza.Application;
import fr.idformation.marioPizza.core.dto.ClientDTO;
import fr.idformation.marioPizza.core.dto.mapper.ClientMapper;
import fr.idformation.marioPizza.core.service.impl.ClientService;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/client")
@CrossOrigin(origins = "http://localhost:3000", maxAge = Application.MAX)
public class ClientController {

	/**
	 * Client's service.
	 */
	@Autowired
	private ClientService clientService;

	/**
	 * Getter of one the pizza.
	 *
	 * @param id       the pizza's id
	 * @param response the http servlet response .
	 *
	 * @return all the pizza
	 */
	@GetMapping("/{id}")
	public ClientDTO getOne(final @PathVariable Long id, final HttpServletResponse response) {
		try {
			return ClientMapper.clientToDto(clientService.getOne(id));
		} catch (NoSuchElementException e) {
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			return null;
		}
	}

	@PostMapping("/inscription")
	public boolean save(@Validated @RequestBody ClientDTO client) {
		try {
			clientService.save(ClientMapper.dtoToEntity(client));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
