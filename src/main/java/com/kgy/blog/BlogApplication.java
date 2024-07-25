package com.kgy.blog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BlogApplication extends SpringBootServletInitializer {

    private static final Logger logger = LoggerFactory.getLogger(SpringApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BlogApplication.class);
    }

    public static void main(String[] args) {
        logger.trace("TRACE LOG MESSAGE");
        logger.debug("DEBUG LOG MESSAGE");
        logger.info("INFO LOG MESSAGE");
        logger.warn("WARN LOG MESSAGE");
        logger.error("ERROR LOG MESSAGE");

        SpringApplication.run(BlogApplication.class, args);
    }
}
