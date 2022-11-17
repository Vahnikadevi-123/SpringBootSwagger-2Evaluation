package com.sprint1.evaluation.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "PRODUCT")
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "The database generated product ID")
	private Integer id;
	
	@Column(name = "PRODUCT_ID")
	@ApiModelProperty(notes = "The application-spectific product ID")
    private Integer productId;
    
    @Column(name = "IMAGE_URL")
    @ApiModelProperty(notes = "The image URL of the product")
    private String imageUrl;
    
    @Column(name = "PRICE")
    @ApiModelProperty(notes = "The price of the product", required = true)
    private BigDecimal price;
    
    @Column(name = "DESCRIPTION")
    @ApiModelProperty(notes = "The product description")
    private String description;
    
    @Version
    @ApiModelProperty(notes = "The auto-generated version of the product")
    private Integer version;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
    
	
	

}
