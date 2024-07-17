package com.mycompany.dvdstore;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Veuillez saisir le titre et le genre du film à ajouter" );
        System.out.println( "Veuillez saisir le titre: " );
        Scanner scanner = new Scanner(System.in);
        String titre = scanner.nextLine();
        System.out.println( "Veuillez saisir le genre: " );
        String genre = scanner.nextLine();
        Movie movie = new Movie();
        movie.setTitle(titre);
        movie.setGenre(genre);
        MovieService movieService = new MovieService();
        movieService.registerMovie(movie);
    }
}
