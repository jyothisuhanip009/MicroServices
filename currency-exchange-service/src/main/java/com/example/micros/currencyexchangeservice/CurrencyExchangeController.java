package com.example.micros.currencyexchangeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environment;
	
	List<ExchangeValue> exchangeValues;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from,@PathVariable String to) {
		ExchangeValue exchangeValue = null;
		if(from.equals("US")) {
			exchangeValue = new ExchangeValue(from, to, 101, 65.0);
		} else {
			exchangeValue = new ExchangeValue(from, to, 101, 100.0);
		}
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchangeValue;
	}
}
 