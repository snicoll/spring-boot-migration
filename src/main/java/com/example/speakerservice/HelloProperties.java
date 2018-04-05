package com.example.speakerservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("hello")
public class HelloProperties {

	/**
	 * Target of our friendly welcome message.
	 */
	private String target = "World";

	/**
	 * Timeout in seconds after which the server gets angry if it doesn't get an answer to
	 * a welcome message.
	 */
	private long answerTimeout = 3;

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public long getAnswerTimeout() {
		return this.answerTimeout;
	}

	public void setAnswerTimeout(long answerTimeout) {
		this.answerTimeout = answerTimeout;
	}

}
