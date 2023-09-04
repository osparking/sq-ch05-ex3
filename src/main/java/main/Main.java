package main;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.CommentService;
import config.ProjectConfig;

public class Main {

	public static void main(String[] args) {
		var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var ps = new PrintStream(System.out, true, UTF_8);
		ps.println("채취 전");
		var sv = c.getBean(CommentService.class);
		ps.println("채취 후");
	}

}
