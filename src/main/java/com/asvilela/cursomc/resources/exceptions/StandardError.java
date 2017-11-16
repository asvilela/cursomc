package com.asvilela.cursomc.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Long TimesTamp;
	
	public StandardError(Integer status, String msg, Long timesTamp) {
		super();
		this.status = status;
		this.msg = msg;
		TimesTamp = timesTamp;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Long getTimesTamp() {
		return TimesTamp;
	}
	public void setTimesTamp(Long timesTamp) {
		TimesTamp = timesTamp;
	}
}
