package org.deepsource.doterra.representations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HelloResponse {
	private final long id;
	private final String message;
	
	public HelloResponse(long id, String message) {
		this.id = id;
		this.message = message;
	}

	@JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getMessage() {
        return "Hello " + message;
    }
}
