package com.sigismondi.marco.k8spoc.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/echoService")
public class EchoService {
	
	@GetMapping("/echo/{input}")
	public String echo(@PathVariable String input) {
		return input;
	}

}
