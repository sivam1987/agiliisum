package com.aglsum.test.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aglsum.test.api.model.ConfigDetails;
import com.aglsum.test.api.service.ProductDetailsService;

/**
 * The ProductDetailsController responsible for Maintain ProductDetails
 * related request and response messages
 *
 * @author siva prasad
 *
 * @since 1.0 Creation date:2020-05-16
 */
@RestController
@RequestMapping(value="/aglsum")
public class ConfigDetailsController {
	
	@Autowired
	private ProductDetailsService productDetailsService;
	/**
	 * Default constructor
	 */
	public ConfigDetailsController() {
		super();
	}

	/**
	 * REST API /api/getconfigdetails to retrieve the product details for the
	 * Product of Agilllisum, selected and owned by logged-in users
	 * 
	 * 
	 */
	
	@RequestMapping(value = "/api/getconfigdetails", method = RequestMethod.GET)
	public ResponseEntity<ConfigDetails> getProductDetails() {
		ConfigDetails configDetails =productDetailsService.getConfigDetails();
		if (configDetails == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(configDetails);
		}
	}

}
