package com.somnus.model.base;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "SYPRODUCT", schema = "")
@DynamicInsert(true)
@DynamicUpdate(true)
public class Syproduct implements java.io.Serializable {

	private String ip;// 此属性不存数据库，虚拟属性

	private String id;
	private Date createdatetime;
	private Date updatedatetime;
	private String image;
	private String product;
	private String specifications;
	private String color;
	private String finishing;
	private String packing;
	private String qtty;
	private double fob;

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 36)
	public String getId() {
		if (!StringUtils.isBlank(this.id)) {
			return this.id;
		}
		return UUID.randomUUID().toString();
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setUpdatedatetime(Date updatedatetime) {
		this.updatedatetime = updatedatetime;
	}
	@Column(name = "IMAGE", length = 200)
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	@Column(name = "PRODUCT", length = 36)
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	@Column(name = "SPECIFICATIONS", length = 600)
	public String getSpecifications() {
		return specifications;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
	@Column(name = "COLOR", length = 36)
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	@Column(name = "FINISHING", length = 36)
	public String getFinishing() {
		return finishing;
	}

	public void setFinishing(String finishing) {
		this.finishing = finishing;
	}
	@Column(name = "PACKING", length = 36)
	public String getPacking() {
		return packing;
	}

	public void setPacking(String packing) {
		this.packing = packing;
	}
	@Column(name = "QTTY", length = 36)
	public String getQtty() {
		return qtty;
	}

	public void setQtty(String qtty) {
		this.qtty = qtty;
	}
	@Column(name = "FOB", precision = 8, scale = 0)
	public double getFob() {
		return fob;
	}

	public void setFob(double fob) {
		this.fob = fob;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATEDATETIME", length = 7)
	public Date getCreatedatetime() {
		if (this.createdatetime != null)
			return this.createdatetime;
		return new Date();
	}

	public void setCreatedatetime(Date createdatetime) {
		this.createdatetime = createdatetime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATEDATETIME", length = 7)
	public Date getUpdatedatetime() {
		if (this.updatedatetime != null)
			return this.updatedatetime;
		return new Date();
	}
}
