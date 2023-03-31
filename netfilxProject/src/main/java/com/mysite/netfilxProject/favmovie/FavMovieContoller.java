package com.mysite.netfilxProject.favmovie;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FavMovieContoller {
	private FavMovieService favMovieService; 
	
	public FavMovieContoller(FavMovieService favMovieService) { 
		this.favMovieService = favMovieService;
	}
	
//	@RequestMapping("/insert")
	@PostMapping("/inserts")
	public int insertFavMovie(FavMovieVO vo) throws Exception{
		int res = favMovieService.insertFavMovie(vo);
		return res;
	}

}
