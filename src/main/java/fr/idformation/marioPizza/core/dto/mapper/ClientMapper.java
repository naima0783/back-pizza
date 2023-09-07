package fr.idformation.marioPizza.core.dto.mapper;

import fr.idformation.marioPizza.core.domain.Client;
import fr.idformation.marioPizza.core.dto.ClientDTO;

/**
 * @author naima
 *
 */
public class ClientMapper {

	/**
	 * transform a client to a clientDto.
	 *
	 * @param client the client
	 * @return the client'dto
	 */
	public static ClientDTO clientToDto(final Client client) {
		ClientDTO dto = null;

		if (client != null) {
			dto = new ClientDTO(client);

		}

		return dto;

	}

	/**
	 * transform a clientDTO to a client.
	 *
	 * @param dto the clientDtop
	 * @return the client
	 */
	public static Client dtoToEntity(final ClientDTO dto) {
		Client client = null;

		if (dto != null) {
			client = new Client();
			client.setPhonenumber(dto.getPhonenumber());

			client.setFirstname(dto.getFirstname());
			client.setLastname(dto.getLastname());
			client.setPassword(dto.getPassword());
			client.setAddress(dto.getAddress());

		}
		return client;
	}

}
