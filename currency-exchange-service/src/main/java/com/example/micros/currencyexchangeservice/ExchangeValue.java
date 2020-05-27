package com.example.micros.currencyexchangeservice;

public class ExchangeValue {
	
	private String from;
	
	private String to;
	
	private int id;
	private Double conversionMultiple;
	private int port;
	
	
	public ExchangeValue(String from, String to, int id, Double conversionMultiple) {
		super();
		this.from = from;
		this.to = to;
		this.id = id;
		this.conversionMultiple = conversionMultiple;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public int getId() {
		return id;
	}

	public Double getConversionMultiple() {
		return conversionMultiple;
	}
	
	
	
	
	
}
