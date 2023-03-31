package com.mysite.netfilxProject.favmovie;

import java.util.ArrayList;

import org.springframework.stereotype.Service;


@Service
public class FavMovieServiceImpl implements FavMovieService {
	private FavMovieMapper mapper;
	
	public FavMovieServiceImpl(FavMovieMapper mapper) {
		this.mapper = mapper;
	}
	@Override
	public int insertFavMovie(FavMovieVO favmovieVO) {
		int res = mapper.insertFavMovie(favmovieVO);
		return res;
	}

	@Override
	public ArrayList<FavMovieVO> getFavMovielist() {
		ArrayList<FavMovieVO> favmovie_list= new ArrayList<FavMovieVO>();
		favmovie_list = mapper.getFavMovielist();
		return favmovie_list;
	}

}
