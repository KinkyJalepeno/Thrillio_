package com.kinky.thrillio.managers;

import com.kinky.thrillio.entities.Book;
import com.kinky.thrillio.entities.Movie;
import com.kinky.thrillio.entities.Weblink;

public class BookmarkManager {
	private static BookmarkManager instance = new BookmarkManager();

	private BookmarkManager() {
	}

	public static BookmarkManager getInstance() {

		return instance;
	}

	public Movie createMovie(long id, String title, String profileURL, int releaseYear, String[] cast,
			String[] directors, String genre, double imdbRating) {

		Movie movie = new Movie();

		// from the Bookmark superclass
		movie.setId(id);
		movie.setTitle(title);
		movie.setProfileURL(profileURL);

		// from the Movie subclass
		movie.setRealeaseYear(releaseYear);
		movie.setCast(cast);
		movie.setDirectors(directors);
		movie.setGenre(genre);
		movie.setImdbRating(imdbRating);

		return movie;

	}

	public Book createBook(long id, String title, String profileURL, int publicationYear, String publisher,
			String[] authors, String genre, double amazonRating) {
		Book book = new Book();

		// from the Bookmark superclass
		book.setId(id);
		book.setTitle(title);
		book.setProfileURL(profileURL);

		// from the Book subclass
		book.setPublicationYear(publicationYear);
		book.setPublisher(publisher);
		book.setAuthors(authors);
		book.setGenre(genre);
		book.setAmazonRating(amazonRating);

		return book;

	}

	public Weblink createWebLink(long id, String title, String profileURL, String url, String host) {
		Weblink weblink = new Weblink();

		// from the Bookmark superclass
		weblink.setId(id);
		weblink.setTitle(title);
		weblink.setProfileURL(profileURL);

		// from the Weblink subclass
		weblink.setUrl(url);
		weblink.setHost(host);

		return weblink;

	}

}
