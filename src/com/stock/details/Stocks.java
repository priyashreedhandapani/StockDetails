package com.stock.details;
import java.math.*;

public class Stocks {
	private String id;
	private String hierarchy_node_id;
	private String name;
	private String description;
	private BigDecimal price;
	private boolean stock_available;
	private int units_in_stock;
	public Stocks(String id, String hierarchy_node_id, String name, String description, BigDecimal price,
			boolean stock_available, int units_in_stock) {
		super();
		this.id = id;
		this.hierarchy_node_id = hierarchy_node_id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock_available = stock_available;
		this.units_in_stock = units_in_stock;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHierarchy_node_id() {
		return hierarchy_node_id;
	}
	public void setHierarchy_node_id(String hierarchy_node_id) {
		this.hierarchy_node_id = hierarchy_node_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public boolean isStock_available() {
		return stock_available;
	}
	public void setStock_available(boolean stock_available) {
		this.stock_available = stock_available;
	}
	public int getUnits_in_stock() {
		return units_in_stock;
	}
	public void setUnits_in_stock(int units_in_stock) {
		this.units_in_stock = units_in_stock;
	}
	@Override
	public String toString() {
		return "Stocks [id=" + id + ", hierarchy_node_id=" + hierarchy_node_id + ", name=" + name + ", description="
				+ description + ", price=" + price + ", stock_available=" + stock_available + ", units_in_stock="
				+ units_in_stock + "]";
	}
	
	
	
}
