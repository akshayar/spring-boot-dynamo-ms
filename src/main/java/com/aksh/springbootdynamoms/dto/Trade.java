package com.aksh.springbootdynamoms.dto;

import lombok.Data;

@Data
public class Trade {
	private int id;
	private String symbol;
	private double quantity;
	private double price;
}
