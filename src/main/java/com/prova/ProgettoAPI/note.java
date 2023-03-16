package com.prova.ProgettoAPI;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class note {

	private String to;
	private String from;
	private String heading;
	private String body;

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

//	@XmlElement(name = "from")
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
