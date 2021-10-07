/**
 * 
 */
package com.aksh.springbootdynamoms;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.aksh.springbootdynamoms.dto.Trade;

/**
 * @author rawaaksh
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDynamoMsApplication.class)
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application.properties")

class TradeControllerTest {
	
	@Autowired
	private TradeDao dao;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		Trade trade=new Trade();
		trade.setTradeId("1");
		trade.setPrice(10.0);
		trade.setSymbol("AAPL");
		
		dao.save(trade);
	}

}
