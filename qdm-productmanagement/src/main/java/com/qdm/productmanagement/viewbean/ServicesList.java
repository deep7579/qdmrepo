package com.qdm.productmanagement.viewbean;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServicesList {
	
	private Integer total_count;
	private Integer offset;
	
	private List<OrderList> orderList;
	
	private List<Category> category;
	
	private List<CareProvider> care_provider;

}
