package com.aksh.springbootdynamoms;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aksh.springbootdynamoms.dto.Trade;

import lombok.extern.java.Log;

@RestController
@Log
public class TradeController {
	private static final String MESSAGE="Important Service";
	@Autowired
	private TradeDao tradeDao;
	@RequestMapping("trade/ping")
	public String ping() {
		return MESSAGE+" OK" + new Date();
	}

	@RequestMapping(method = RequestMethod.PUT, path = "trade")
	private Trade create(@RequestBody Trade trade) {
		log.info(MESSAGE+": Saving "+trade);
		tradeDao.save(trade);
		return trade;
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "trade")
	private Trade update(Trade trade) {
		tradeDao.save(trade);
		log.info(MESSAGE+": Saving "+trade);
		return trade;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "trade/{id}")
	private Trade get(@PathVariable String id) {
		log.info(MESSAGE+": Getting "+id);
		return tradeDao.getById(id);
	}

}
