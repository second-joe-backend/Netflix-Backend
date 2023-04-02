package com.mysite.netflixProject.favmovie;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;



@Mapper
public interface FavMovieMapper {

	@Insert("insert into fav_movie (member_id, movie_title, movie_summary, movie_image) values (#{member_id}, #{movie_title}, #{movie_summary}, #{movie_image})")
	public int insertFavMovie(FavMovieVO favmovieVO);

	@Select("select movie_title from fav_movie where movie_title = #{movie_title} and member_id=#{member_id}")
	public List<FavMovieVO> chkLike(FavMovieVO favmovieVO);
	
	@Select("select * from fav_movie where member_id=#{member_id}")
	public ArrayList<FavMovieVO> getFavMovielist(FavMovieVO favmovieVO);
	
	@Delete("delete from fav_movie where movie_title = #{movie_title} and member_id=#{member_id}")
	public int deleteFavMovie(FavMovieVO favmovieVO);
	
	@Delete("delete from fav_movie where member_id=#{member_id}")
	public int removeMember(FavMovieVO favmovieVO);

}