package com.skyjilygao.springboot.demo;

import com.skyjilygao.springboot.demo.controller.VideoController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileNotFoundException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoM3u8ApplicationTests {

	@Autowired
	private VideoController videoController;
	@Test
	public void contextLoads() throws FileNotFoundException, InterruptedException {
		videoController.start();
	}

}
