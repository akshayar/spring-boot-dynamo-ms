package com.aksh.springbootdynamoms;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aksh.springbootdynamoms.dto.Trade;

@RestController
public class TradeController {
	@RequestMapping("trade/ping")
	public String ping() {
		return "OK-New" + new Date();
	}

	@RequestMapping(method = RequestMethod.PUT, path = "trade")
	private Trade create() {
		Trade trade = new Trade();
		trade.setSymbol("FIRST");
		return trade;

	}

}
