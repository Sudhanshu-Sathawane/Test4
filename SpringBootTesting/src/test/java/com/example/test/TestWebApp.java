package com.example.test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;

import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import org.springframework.web.context.WebApplicationContext;
public class TestWebApp extends SpringBootTestingApplicationTests {
	@Autowired

	 private WebApplicationContext webApplicationContext;
	 private MockMvc mockMvc;

	 @Before

	 public void setup() {

	 mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

	 }
	 @Test

	 public void testStudent() throws Exception {
		 mockMvc.perform(get("/student")).andExpect(status().isOk())

		 .andExpect(content().contentType("application/json;charset=UTF-8"))

		 .andExpect(jsonPath("$.studentName").value("Sudhanshu")).andExpect(jsonPath("$.likesSport").value("Cricket"))

		 .andExpect(jsonPath("$.studentId").value(101));
}
}
