package com.restapi.dynamiccontent.restapidynamiccontent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoPresenterController {
	
	@Autowired
	VideoRepositoryController videoRepositoryController;
	
	@Autowired
	PhotosRepositoryController photosRepositoryController;

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
	
	@GetMapping("/Getall")
	public List<Videos> getAllVideos () {
		return videoRepositoryController.getAllVideos();
	}
	
	@GetMapping("/GetallPhotos")
	public List<Photos> getAllPhotos () {
		return photosRepositoryController.getAllPhotos();
	}
}
