package com.mysite.netfilxProject.favmovie;

import lombok.Data;

@Data
public class FavMovieVO {
	private int movie_num;
	private String member_id;
	private String movie_title;
	private String movie_summary;
	private String movie_image;
	
}