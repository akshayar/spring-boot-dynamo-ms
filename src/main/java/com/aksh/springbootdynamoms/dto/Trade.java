package com.aksh.springbootdynamoms.dto;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.Data;

@Data
@DynamoDBTable(tableName = "trade-info")
public class Trade {
	@DynamoDBHashKey(attributeName = "tradeId")
	private String tradeId;
	private String symbol;
	private double quantity;
	private double price;
}
