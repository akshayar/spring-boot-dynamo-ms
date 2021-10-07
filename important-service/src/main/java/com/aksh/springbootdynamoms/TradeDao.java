package com.aksh.springbootdynamoms;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aksh.springbootdynamoms.dto.Trade;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
@Component
public class TradeDao {
	@Autowired
	private AmazonDynamoDB client;
	private DynamoDBMapper mapper;
	
	@PostConstruct
	public void init() {
		mapper=new DynamoDBMapper(client);
	}
	
	public void save(Trade trade) {
		mapper.save(trade);
	}
	
	public Trade getById(String tradeId) {
		return mapper.load(Trade.class,tradeId);
	}

}
