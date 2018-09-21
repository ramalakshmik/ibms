package com.aruvi.ibms.exception;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "error")
public class ErrorResponse {
	public ErrorResponse(HttpStatus status, String message, List<String> details) {
		super();
		this.message = message;
		this.details = details;
		this.status = status;
	}

	// General error message about nature of error
	private String message;

	// Specific errors in API request processing
	private List<String> details;

	private HttpStatus status;

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getDetails() {
		return details;
	}

	public void setDetails(List<String> details) {
		this.details = details;
	}

}
