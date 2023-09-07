/**
 * 
 */
package fr.idformation.marioPizza.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.idformation.marioPizza.core.domain.Client;
import fr.idformation.marioPizza.core.repository.IClientRepository;
import fr.idformation.marioPizza.core.service.IClientService;

/**
 * @author lenovo
 *
 */
@Service
public class ClientService implements IClientService {

	/**
	 * Client's repository.
	 */
	@Autowired
	private IClientRepository clientRepo;

	@Override
	public Client getOne(final String phone) {
		return clientRepo.findByPhonenumber(phone);
	}

	@Override
	public Client save(final Client client) {
		return clientRepo.save(client);
	}

}
