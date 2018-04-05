package com.example.speakerservice;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("hello")
public class HelloProperties {

	/**
	 * Target of our friendly welcome message.
	 */
	private String target = "World";

	/**
	 * Timeout after which the server gets angry if it doesn't get an answer to
	 * a welcome message. If a duration suffix is not specified, seconds will be used.
	 */
	@DurationUnit(ChronoUnit.SECONDS)
	private Duration answerTimeout = Duration.ofSeconds(3);

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public Duration getAnswerTimeout() {
		return this.answerTimeout;
	}

	public void setAnswerTimeout(Duration answerTimeout) {
		this.answerTimeout = answerTimeout;
	}

}
