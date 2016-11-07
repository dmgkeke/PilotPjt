package com.sds.anyframe.mobile.amplt.rest.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sds.anyframe.mobile.amplt.rest.service.ProductService;
import com.sds.anyframe.mobile.amplt.rest.service.dao.ProductRepository;
import com.sds.anyframe.mobile.amplt.rest.vo.Product;
import com.sds.anyframe.mobile.amplt.rest.vo.RequestVO;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {
	Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getEntities() {
		return productRepository.findAll();
	}

	@Override
	public RequestVO<Product> createEntity(Product product) {
		RequestVO<Product> requestVO = new RequestVO<Product>(); 
		
		try {
			Product saveEntity = productRepository.save(product);
			requestVO.setStatus(true);
			requestVO.setEntity(saveEntity);
			requestVO.setStatusDetails(saveEntity.toString());
		} catch (Exception e) {
			requestVO.setStatus(false);
			requestVO.setStatusDetails(e.getLocalizedMessage());
		}
		
		return requestVO;
	}

	@Override
	public Product getEntity(String id) {
		Product product = productRepository.findOne(getProductId(id));
		if( product == null ) {
			logger.info("No Product with product id: " + id);
		}
		
		return product;
	}

	@Override
	public RequestVO<Product> updateEntity(Product product) {
		RequestVO<Product> requestVO = new RequestVO<Product>(); 
		
		try {
			Product updateEntity = productRepository.save(product);
			requestVO.setStatus(true);
			requestVO.setEntity(updateEntity);
			requestVO.setStatusDetails(updateEntity.toString());
		} catch (Exception e) {
			requestVO.setStatus(false);
			requestVO.setStatusDetails(e.getLocalizedMessage());
		}
		
		return requestVO;
	}

	@Override
	public RequestVO<Product> deleteEntity(String id) {
		RequestVO<Product> requestVO = new RequestVO<Product>(); 
		
		try {
			productRepository.delete(getProductId(id));
			requestVO.setStatus(true);
			requestVO.setStatusDetails(String.format("delete product id[%s]", id));
		} catch (Exception e) {
			requestVO.setStatus(false);
			requestVO.setStatusDetails(e.getLocalizedMessage());
		}
		
		return requestVO;
	}

	@Override
	public RequestVO<Product> deleteEntities(String[] ids) {
		RequestVO<Product> requestVO = new RequestVO<Product>(); 
		
		try {
			for (String id : ids) {
				productRepository.delete(getProductId(id));
			}
			
			requestVO.setStatus(true);
			requestVO.setStatusDetails(String.format("delete product id[%s]", StringUtils.join(ids, ", ")));
		} catch (Exception e) {
			requestVO.setStatus(false);
			requestVO.setStatusDetails(e.getLocalizedMessage());
		}
		
		return requestVO;
	}
	
	private Long getProductId(String id) {
		return Long.parseLong(id);
	}

}
