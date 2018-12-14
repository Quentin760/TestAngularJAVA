package com.restapi.dynamiccontent.restapidynamiccontent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VideoRepositoryController {
	
	@Autowired
	VideoRepository videoRepository;
	
	public List<Videos> getAllVideos() {
		return videoRepository.findAll();
	}
}
