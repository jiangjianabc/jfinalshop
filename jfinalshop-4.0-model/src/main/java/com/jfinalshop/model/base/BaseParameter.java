package com.jfinalshop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseParameter<M extends BaseParameter<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setCreateDate(java.util.Date createDate) {
		set("create_date", createDate);
	}

	public java.util.Date getCreateDate() {
		return get("create_date");
	}

	public void setModifyDate(java.util.Date modifyDate) {
		set("modify_date", modifyDate);
	}

	public java.util.Date getModifyDate() {
		return get("modify_date");
	}

	public void setVersion(java.lang.Long version) {
		set("version", version);
	}

	public java.lang.Long getVersion() {
		return get("version");
	}

	public void setOrders(java.lang.Integer orders) {
		set("orders", orders);
	}

	public java.lang.Integer getOrders() {
		return get("orders");
	}

	public void setParameterGroup(java.lang.String parameterGroup) {
		set("parameter_group", parameterGroup);
	}

	public java.lang.String getParameterGroup() {
		return get("parameter_group");
	}

	public void setNames(java.lang.String names) {
		set("names", names);
	}

	public java.lang.String getNames() {
		return get("names");
	}

	public void setProductCategoryId(java.lang.Long productCategoryId) {
		set("product_category_id", productCategoryId);
	}

	public java.lang.Long getProductCategoryId() {
		return get("product_category_id");
	}

}
