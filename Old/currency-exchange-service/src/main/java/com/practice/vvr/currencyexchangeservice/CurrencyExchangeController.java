package com.practice.vvr.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private CurrencyExchangeRepository repository;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(
			@PathVariable("from") String from,
			@PathVariable("to") String to) {
		
//		CurrencyExchange currentExchange = new CurrencyExchange(1000L, from, to, BigDecimal.valueOf(50));
		CurrencyExchange currentExchange = repository.findByFromAndTo(from, to);
		
		if(currentExchange == null) {
			throw new RuntimeException("Unable to Find data for " + from + " to " + to);
		}
		
		String port = environment.getProperty("local.server.port");
		currentExchange.setEnvironment(port);
		
		return currentExchange;
	}	

}
