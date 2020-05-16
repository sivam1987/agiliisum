package com.aglsum.test.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.aglsum.test.api.model.ProductDetails;
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
public class ProductDetailsController {
	
	@Autowired
	private ProductDetailsService productDetailsService;
	/**
	 * Default constructor
	 */
	public ProductDetailsController() {
		super();
	}

	/**
	 * REST API /api/getconfigdetails to retrieve the product details for the
	 * Product of Agilllisum, selected and owned by logged-in users
	 * 
	 * 
	 */
	@RequestMapping(value = "/api/getproductdetails", method = RequestMethod.GET)
	public ResponseEntity<ProductDetails> getProductDetails() {
		ProductDetails productDetails =productDetailsService.getProductDetails();
		if (productDetails == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(productDetails);
		}
	}

}
