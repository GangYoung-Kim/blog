package com.kgy.blog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringApplication.class);

    public static void main(String[] args) {
        logger.trace("TRACE LOG MESSAGE");
        logger.debug("DEBUG LOG MESSAGE");
        logger.info("INFO LOG MESSAGE");
        logger.warn("WARN LOG MESSAGE");
        logger.error("ERROR LOG MESSAGE");

        SpringApplication.run(BlogApplication.class, args);
    }
}
