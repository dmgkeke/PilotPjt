package com.sds.anyframe.mobile.amplt.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sds.anyframe.mobile.amplt.rest.service.ProductService;
import com.sds.anyframe.mobile.amplt.rest.vo.Product;
import com.sds.anyframe.mobile.amplt.rest.vo.RequestVO;

@RestController
public class ProductController {
	private static Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/api/products", method=RequestMethod.GET)
	public List<Product> getProducts() {
		logger.debug("getProducts is started...");
		return productService.getEntities();
	}

	@RequestMapping(value="/api/products", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public RequestVO<Product> createProduct(@RequestBody Product product) {
		logger.debug("createProduct is started...");
		return productService.createEntity(product);
	}
	
	@RequestMapping(value="/api/products/{id}", method=RequestMethod.GET)
	public Product getProduct(@PathVariable("id") String id) {
		logger.debug("getProduct is started...");
		return productService.getEntity(id);
	}
	
	@RequestMapping(value="/api/products/{id}", method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public RequestVO<Product> updateProduct(@PathVariable("id") String id, @RequestBody Product product) {
		logger.debug("createProduct is started...");
		return productService.updateEntity(product);
	}
	
	@RequestMapping(value="/api/products/{id}", method=RequestMethod.DELETE)
	public RequestVO<Product> deleteProduct(@PathVariable("id") String id) {
		logger.debug("deleteProduct is started...");
		return productService.deleteEntity(id);
	}
	
	@RequestMapping(value="/api/products", method=RequestMethod.DELETE)
	public RequestVO<Product> deleteApps(@RequestParam String[] ids) {
		logger.debug("deleteProducts is started...");
		return productService.deleteEntities(ids);
	}
	
}
