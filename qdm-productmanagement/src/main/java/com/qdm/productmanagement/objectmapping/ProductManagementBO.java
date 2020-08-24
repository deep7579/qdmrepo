package com.qdm.productmanagement.objectmapping;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.qdm.productmanagement.entity.CSCategory;
import com.qdm.productmanagement.entity.CSService;
import com.qdm.productmanagement.entity.CareProvider;
import com.qdm.productmanagement.viewbean.Category;
import com.qdm.productmanagement.viewbean.ServicesList;

@Component
public class ProductManagementBO {
	
	public ServicesList map(List<CSService> list,int pageNo) {
		
		ServicesList objServicesList = new ServicesList();
		
		objServicesList.setTotal_count(list.size());
		objServicesList.setOffset(pageNo);
		
		for(CSService beanCSService: list) {
			
			List<CareProvider> listCareProvider = beanCSService.getCareProvider();			
			List<com.qdm.productmanagement.viewbean.CareProvider> list1 = new ArrayList<com.qdm.productmanagement.viewbean.CareProvider>();
			for(CareProvider beanCareProvider : listCareProvider) {				
				com.qdm.productmanagement.viewbean.CareProvider bean1 = new com.qdm.productmanagement.viewbean.CareProvider();
				bean1.setId(beanCareProvider.getCareProviderId());
				bean1.setName(beanCareProvider.getName());
				/*
				 * try { bean1.setProfile_pic(beanCareProvider.getLogo().getBytes(0, 100)); }
				 * catch (SQLException e) { // TODO Auto-generated catch block
				 * e.printStackTrace(); }
				 */
				list1.add(bean1);
			}
			
			objServicesList.setCare_provider(list1);
			
			List<CSCategory> careProviderCategory = beanCSService.getCareProviderCategory();
			List<Category> list2 = new ArrayList<Category>();
			for(CSCategory beanCareProviderCategory : careProviderCategory) {	
				Category beanCategory = new Category();				
				beanCategory.setLabel(beanCareProviderCategory.getDescription());
				beanCategory.setValue(String.valueOf(beanCareProviderCategory.getCategoryId()));				
				list2.add(beanCategory);				
			}
			
			objServicesList.setCategory(list2);
			
		}
		
		return objServicesList;
		
	}

}
