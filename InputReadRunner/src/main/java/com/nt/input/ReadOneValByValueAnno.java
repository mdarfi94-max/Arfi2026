package com.nt.input;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReadOneValByValueAnno implements CommandLineRunner {

	@Value("${com.nt}")
	private int id;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Input class values:-"+id);

	}

}
