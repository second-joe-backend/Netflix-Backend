
package com.mysite.netflixProject.favmovie;

import java.util.ArrayList;
import java.util.List;



public interface FavMovieService {
	public int insertFavMovie(FavMovieVO favmovieVO);
	
	public ArrayList<FavMovieVO> getFavMovielist(FavMovieVO favmovieVO);
	
	public int deleteFavMovie(FavMovieVO favmovieVO);
	
	public List<FavMovieVO> chkLike(FavMovieVO favmovieVO);
}