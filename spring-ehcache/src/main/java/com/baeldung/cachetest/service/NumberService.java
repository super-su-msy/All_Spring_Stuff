package com.baeldung.cachetest.service;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NumberService {

	private final static Logger log = LoggerFactory.getLogger(NumberService.class);

	@Cacheable(value = "squareCache", key = "#number", condition = "#number>10")
	public BigDecimal square(Long number) {
		BigDecimal square = BigDecimal.valueOf(number).multiply(BigDecimal.valueOf(number));
		log.info("square of {} is {}", number, square);
		return square;
	}

	@Cacheable(value = "photos")
	public String hellYeah() {
		// TODO Auto-generated method stub
		log.info("Check this bro **********************************");
		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

		HttpEntity<?> entity = new HttpEntity<>(headers);

		HttpEntity<String> response = restTemplate.exchange("https://jsonplaceholder.typicode.com/photos",
				HttpMethod.GET, entity, String.class);
		return response.getBody().toString();

	}

}
