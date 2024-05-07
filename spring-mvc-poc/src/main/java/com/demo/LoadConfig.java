package com.demo;

import java.net.URI;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.springframework.stereotype.Component;

@Component
public class LoadConfig {

	@PostConstruct
	public void init() {
		//initLog4j2();
	}
	void initLog4j2() {
		 LoggerContext context = (LoggerContext)LogManager.getContext(false);
	     context.setConfigLocation(URI.create("D://log4j2.xml"));
	     context.reconfigure();
	}
}
