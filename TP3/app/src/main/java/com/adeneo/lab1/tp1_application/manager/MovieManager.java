package com.adeneo.lab1.tp1_application.manager;

import com.adeneo.lab1.tp1_application.R;
import com.adeneo.lab1.tp1_application.objects.Category;
import com.adeneo.lab1.tp1_application.objects.Cell;
import com.adeneo.lab1.tp1_application.objects.Comment;

import java.util.ArrayList;
import java.util.List;

public class MovieManager {

    private static final MovieManager instanceMovieManager = new MovieManager();
    List<Cell> movies = new ArrayList<>();
    List<Category> categories = new ArrayList<>();
    List<Comment> comments = new ArrayList<>();

    private MovieManager(){
        categories.add(new Category("Humour"));
        categories.add(new Category("Film d'horreur"));
        categories.add(new Category("Comédie"));
        categories.add(new Category("Action"));
        categories.add(new Category("Aventure"));
        categories.add(new Category("Humour"));
        categories.add(new Category("Documentaires"));
        categories.add(new Category("Policier"));
        categories.add(new Category("Amour"));
        categories.add(new Category("Comédies musicales"));
        categories.add(new Category("Dessins animés"));
        categories.add(new Category("Francais"));
        categories.add(new Category("Manga"));
        categories.add(new Category("Science fiction"));
        categories.add(new Category("Fantastique"));

        movies.add(new Cell("Fast and furious 8", "petit film sympa, un peu d'action donc pas degueu", R.drawable.fastandfurious8, Cell.CellType.MOVIE));
        movies.add(new Cell("Star wars 10", "petit film sympa, un peu d'action donc pas degueu", R.drawable.fastandfurious8, Cell.CellType.MOVIE));
        movies.add(new Cell("Avengers, la guerre de l'infiny (lol)", "petit film sympa, un peu d'action donc pas degueu", R.drawable.fastandfurious8, Cell.CellType.MOVIE));
        movies.add(new Cell("Babysitting", "petit film sympa, un peu d'action donc pas degueu", R.drawable.fastandfurious8, Cell.CellType.MOVIE));
        movies.add(new Cell("Cringe", "petit film sympa, un peu d'action donc pas degueu", R.drawable.fastandfurious8, Cell.CellType.MOVIE));
        movies.add(new Cell("Zoe la nerveuse", "petit film sympa, un peu d'action donc pas degueu", R.drawable.fastandfurious8, Cell.CellType.MOVIE));
        movies.add(new Cell("Bananasplit", "petit film sympa, un peu d'action donc pas degueu", R.drawable.fastandfurious8, Cell.CellType.MOVIE));

        comments.add(new Comment("misterV", "Trop bien LOL !", "avatar"));
        comments.add(new Comment("LeCrapeauDu74", "Pas ouf, pas assez d'action", "avatar"));



    }

    public static MovieManager getInstance() {
        return instanceMovieManager;
    }

    public List<Cell> getMovies(){
        return movies;
    }

    public Cell getMovieById(int id){
        return movies.get(id);
    }

    public List<Category> getCategories(){
        return categories;
    }

    public List<Comment> getComments() {
        return comments;
    }
}