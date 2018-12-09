package com.restapi.dynamiccontent.restapidynamiccontent;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoPresenterController {

	@GetMapping("/GetVideos/{videoTopic}")
	public String GetVideos(@PathVariable String videoTopic) {
		switch (videoTopic) {
		case "python" :
			return String.format("This as all our Python video");
		case "java" :
			return String.format("This as all our Java video");		
		default :
			return String.format("Sorry, Incorrect input");
		}
	}
}
