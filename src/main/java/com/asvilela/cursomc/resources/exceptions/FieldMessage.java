package com.asvilela.cursomc.resources.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String fieldName;
	private String fielMessage;
	
	public FieldMessage() {}

	public FieldMessage(String fieldName, String fielMessage) {
		super();
		this.fieldName = fieldName;
		this.fielMessage = fielMessage;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFielMessage() {
		return fielMessage;
	}

	public void setFielMessage(String fielMessage) {
		this.fielMessage = fielMessage;
	}

}
