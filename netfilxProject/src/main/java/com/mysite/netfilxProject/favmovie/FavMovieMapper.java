package com.mysite.netfilxProject.favmovie;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface FavMovieMapper {
//	@Insert("insert into fav_movie values (#{member_id}, #{movie_title}, #{movie_summary}, #{movie_image})")
	@Insert("insert into fav_movie(movie_title, movie_summary, movie_image values (#{movie_title}, #{movie_summary}, #{movie_image})")
	public int insertFavMovie(FavMovieVO favmovieVO);
	
	@Select("select * from fav_movie")
	public ArrayList<FavMovieVO> getFavMovielist();

}
