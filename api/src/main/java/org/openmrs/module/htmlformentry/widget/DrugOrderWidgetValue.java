package org.openmrs.module.htmlformentry.widget;

import org.openmrs.DrugOrder;

/**
 * Encapsulates a given widget value that has a reference to previous and new orders, and other
 * information. This is what is constructed out of the request and passed to the submission element
 * for processing
 */
public class DrugOrderWidgetValue {
	
	private String fieldSuffix;
	
	private DrugOrder previousDrugOrder;
	
	private DrugOrder newDrugOrder;
	
	public DrugOrderWidgetValue() {
	}
	
	public String getFieldSuffix() {
		return fieldSuffix;
	}
	
	public void setFieldSuffix(String fieldSuffix) {
		this.fieldSuffix = fieldSuffix;
	}
	
	public DrugOrder getPreviousDrugOrder() {
		return previousDrugOrder;
	}
	
	public void setPreviousDrugOrder(DrugOrder previousDrugOrder) {
		this.previousDrugOrder = previousDrugOrder;
	}
	
	public DrugOrder getNewDrugOrder() {
		return newDrugOrder;
	}
	
	public void setNewDrugOrder(DrugOrder newDrugOrder) {
		this.newDrugOrder = newDrugOrder;
	}
}
