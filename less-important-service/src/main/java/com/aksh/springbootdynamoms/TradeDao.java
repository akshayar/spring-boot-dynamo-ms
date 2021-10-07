package com.aksh.springbootdynamoms;

import org.springframework.stereotype.Component;

import com.aksh.springbootdynamoms.dto.Trade;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
@Component
public class TradeDao {
	private AmazonDynamoDB client=AmazonDynamoDBClientBuilder.standard().build();
	private DynamoDBMapper mapper=new DynamoDBMapper(client);
	
	public void save(Trade trade) {
		mapper.save(trade);
	}
	
	public Trade getById(String tradeId) {
		return mapper.load(Trade.class,tradeId);
	}

}
