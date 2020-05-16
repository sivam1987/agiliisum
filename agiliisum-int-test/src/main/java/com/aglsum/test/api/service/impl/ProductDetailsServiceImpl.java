package com.aglsum.test.api.service.impl;

import org.springframework.stereotype.Service;

import com.aglsum.test.api.model.ConfigDetails;
import com.aglsum.test.api.model.ProductDetails;
import com.aglsum.test.api.service.ProductDetailsService;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {

	@Override
	public ProductDetails getProductDetails() {
		//return null;
		return new ProductDetails(101, "Computer", "Eletronics");
	}

	@Override
	public ConfigDetails getConfigDetails() {
		// TODO Auto-generated method stub
		return new ConfigDetails("", "");
	}

}
