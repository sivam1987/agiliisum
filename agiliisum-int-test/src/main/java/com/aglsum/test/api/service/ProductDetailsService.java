package com.aglsum.test.api.service;

import org.springframework.stereotype.Service;

import com.aglsum.test.api.model.ConfigDetails;
import com.aglsum.test.api.model.ProductDetails;

@Service
public interface ProductDetailsService {
	public ProductDetails getProductDetails();
	public ConfigDetails getConfigDetails();
}
