package com.velocity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OrderLimitEntity ")
public class OrderLimitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer order_type;
	private String PlanTypeEntityplanTypeByBannedPlanTypeId;
	private String PlanTypeEntityplanTypeByBaseedPlanTypeId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrder_type() {
		return order_type;
	}
	public void setOrder_type(Integer order_type) {
		this.order_type = order_type;
	}
	public String getPlanTypeEntityplanTypeByBannedPlanTypeId() {
		return PlanTypeEntityplanTypeByBannedPlanTypeId;
	}
	public void setPlanTypeEntityplanTypeByBannedPlanTypeId(String planTypeEntityplanTypeByBannedPlanTypeId) {
		PlanTypeEntityplanTypeByBannedPlanTypeId = planTypeEntityplanTypeByBannedPlanTypeId;
	}
	public String getPlanTypeEntityplanTypeByBaseedPlanTypeId() {
		return PlanTypeEntityplanTypeByBaseedPlanTypeId;
	}
	public void setPlanTypeEntityplanTypeByBaseedPlanTypeId(String planTypeEntityplanTypeByBaseedPlanTypeId) {
		PlanTypeEntityplanTypeByBaseedPlanTypeId = planTypeEntityplanTypeByBaseedPlanTypeId;
	}
	@Override
	public String toString() {
		return "OrderLimitEntity [id=" + id + ", order_type=" + order_type
				+ ", PlanTypeEntityplanTypeByBannedPlanTypeId=" + PlanTypeEntityplanTypeByBannedPlanTypeId
				+ ", PlanTypeEntityplanTypeByBaseedPlanTypeId=" + PlanTypeEntityplanTypeByBaseedPlanTypeId + "]";
	}
	
	

}
