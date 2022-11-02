package br.com.designpatterns1.request;

import java.time.LocalDateTime;
import br.com.designpatterns1.budget.Budget;

public class Request {

	private String Client;
	private Budget buget;
	private LocalDateTime dateRequest;
	
	public Request(String client, Budget buget, LocalDateTime dateRequest) {
		Client = client;
		this.buget = buget;
		this.dateRequest = dateRequest;
	}

	public String getClient() {
		return Client;
	}

	public Budget getBuget() {
		return buget;
	}

	public LocalDateTime getDateRequest() {
		return dateRequest;
	}
	
}

