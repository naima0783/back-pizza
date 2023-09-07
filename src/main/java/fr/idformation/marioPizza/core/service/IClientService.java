package fr.idformation.marioPizza.core.service;

import fr.idformation.marioPizza.core.domain.Client;

public interface IClientService {

	/**
	 * getter of one client .
	 *
	 * @param id the client's id
	 * @return the client
	 */
	Client getOne(Long id);

	/**
	 * save a new client.
	 *
	 * @param client the client
	 * @return the new client
	 */
	Client save(Client client);

}
