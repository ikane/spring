/**
 * 
 */
package com.netapsys.springmvc.web;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.ui.ModelMap;

/**
 * @author IKANE
 *
 */
public class HelloSpringMVCTest {

	@Test
	public void testSayHelloWithSpringMVC() {
		HelloSpringMVC helloSpringMVC = new HelloSpringMVC();
		ModelMap model = new ModelMap();
		String view = helloSpringMVC.sayHelloWithSpringMVC("ibou", model);
		assertEquals("hello", view);
		assertTrue(model.containsAttribute("name"));
		assertEquals("ibou", model.get("name"));
	}
}
