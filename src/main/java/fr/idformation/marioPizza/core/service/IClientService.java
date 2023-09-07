package fr.idformation.marioPizza.core.service;

import fr.idformation.marioPizza.core.domain.Client;

public interface IClientService {

	/**
	 * getter of one client .
	 *
	 * @param phone the client's phone number
	 * @return the client
	 */
	Client getOne(String phone);

	/**
	 * save a new client.
	 *
	 * @param client the client
	 * @return the new client
	 */
	Client save(Client client);

}
