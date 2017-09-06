package com.pms.shared.Shared_lib;

import java.io.Serializable;

public class Product implements Serializable{
	private long id;
	private String sku;
	private String description;
    
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}