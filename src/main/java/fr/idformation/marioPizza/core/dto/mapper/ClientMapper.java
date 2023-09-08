package fr.idformation.marioPizza.core.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import fr.idformation.marioPizza.core.domain.Client;
import fr.idformation.marioPizza.core.dto.ClientDTO;
import fr.idformation.marioPizza.core.dto.OrderDTO;

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
	public static ClientDTO clientToDto(Client cust) {
		return clientToDto(cust, true);
	}

	public static ClientDTO clientToDto(Client client, boolean addOrder) {

		ClientDTO dto = null;
		List<OrderDTO> list;

		if (client != null) {
			dto = new ClientDTO(client);
			list = new ArrayList<>();

			if (addOrder) {
				// for (Order order : client.getOrders()) {
				// list.add(OrderMapper.orderToDto(order, false));
			}
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
