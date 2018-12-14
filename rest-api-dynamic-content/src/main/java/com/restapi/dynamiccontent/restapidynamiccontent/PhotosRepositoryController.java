package com.restapi.dynamiccontent.restapidynamiccontent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PhotosRepositoryController {

	@Autowired
	PhotosRepository photosRepository;
	
	public List<Photos> getAllPhotos() {
		return photosRepository.findAll();
	}
}
