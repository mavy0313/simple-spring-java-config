package spring.java.config;

import org.springframework.context.annotation.Bean;

import spring.java.service.BlogPostService;
import spring.java.service.impl.BlogPostServiceImpl;

public class JavaConfig {

	@Bean //default bean name is methodName
	public BlogPostService blogPostService() {
		return new BlogPostServiceImpl();
	}
}
