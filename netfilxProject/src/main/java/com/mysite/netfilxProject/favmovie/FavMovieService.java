package com.mysite.netfilxProject.favmovie;

import java.util.ArrayList;



public interface FavMovieService {
	public int insertFavMovie(FavMovieVO favmovieVO);
	
	public ArrayList<FavMovieVO> getFavMovielist();
}
