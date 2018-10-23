package com.Moviedb.business.credits;

import com.Moviedb.business.actor.Actor;
import com.Moviedb.business.movie.Movie;

public class Credits {

	private int id;
	private Actor actor;
	private Movie movie;
	private String characterName;
	
	public Credits(int id, Actor actor, Movie movie, String characterName) {
		super();
		this.id = id;
		this.actor = actor;
		this.movie = movie;
		this.characterName = characterName;
	}

	public Credits(Actor actor, Movie movie, String characterName) {
		super();
		this.actor = actor;
		this.movie = movie;
		this.characterName = characterName;
	}

	public Credits() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
}
