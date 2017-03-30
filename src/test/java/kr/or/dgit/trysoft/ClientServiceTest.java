package kr.or.dgit.trysoft;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.trysoft.dto.Client;
import kr.or.dgit.trysoft.service.ClientService;

public class ClientServiceTest {
	private static ClientService clientService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		clientService = new ClientService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		clientService = null;
	}

	@Test
	public void testInsertClient() {
		Client client = new Client("CL007", "emiyagameroom", "대구 수성구다 임마","053-030-3021");
		int res = clientService.insertClient(client);
		Assert.assertEquals(1, res);
	}

}
