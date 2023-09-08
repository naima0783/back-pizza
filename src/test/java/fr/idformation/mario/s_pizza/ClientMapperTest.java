package fr.idformation.mario.s_pizza;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import fr.idformation.marioPizza.core.domain.Client;
import fr.idformation.marioPizza.core.dto.ClientDTO;
import fr.idformation.marioPizza.core.dto.mapper.ClientMapper;

public class ClientMapperTest {

	/**
	 * Tests if a null object turns into a null dto
	 */
	@Test
	public void nullToDto() {
		// given
		Client client = null;

		// when
		ClientDTO dto = ClientMapper.clientToDto(client);

		// then
		Assert.isNull(dto, "dto should be null when entity is null");
	}

	@Test
	public void testEntityDtoToDto() {
		// given
		Client client = new Client();
		client.setId((long) 10);
		client.setFirstname("alex");
		client.setLastname("spice");
		client.setAddress("7 grande rue");
		client.setPhonenumber("0123456789");

		ClientDTO dto = ClientMapper.clientToDto(client);

		assertThat(dto.getId()).isEqualTo(10);
		assertThat(dto.getAddress()).isEqualTo("7 grande rue");
		assertThat(dto.getFirstname()).isEqualTo("alex");
		assertThat(dto.getLastname()).isEqualTo("spice");
		assertThat(dto.getPhonenumber()).isEqualTo("0123456789");
		Assert.notNull(dto, "dto should be non null if the entity is not null");

	}

	/**
	 * Tests if the mapping of a CLient with a null List of Order send null types in
	 * DTO
	 *
	 * @Test public void clientWithNullOrderToDto() {
	 * 
	 *       Client client = new Client();
	 * 
	 *       ClientDTO dto = ClientMapper.clientToDto(client);
	 * 
	 *       Assert.notNull(dto); }
	 */

	/**
	 *
	 * @Test public void clientWithEmptyOrderToDto() { // given Client client = new
	 *       Client(); client.setOrder(new ArrayList<>());
	 * 
	 *       // when ClientDTO dto = ClientMapper.clientToDto(client);
	 * 
	 *       // then Assert.notNull(dto, "dto shouldn't be null when entity is not
	 *       empty"); Assert.isNull(dto.getOrder(), "client's order should be
	 *       null"); }
	 */

	@Test
	public void testDtoToEntity() {

		ClientDTO dto = new ClientDTO();
		dto.setFirstname("alex");
		dto.setLastname("spice");
		dto.setAddress("7 grande rue");
		dto.setPhonenumber("0123456789");

		Client client = ClientMapper.dtoToEntity(dto);

		assertThat(client.getAddress()).isEqualTo("7 grande rue");
		assertThat(client.getFirstname()).isEqualTo("alex");
		assertThat(client.getLastname()).isEqualTo("spice");
		assertThat(client.getPhonenumber()).isEqualTo("0123456789");

		Assert.notNull(client, "dto should be non null if the entity is not null");
	}

}
