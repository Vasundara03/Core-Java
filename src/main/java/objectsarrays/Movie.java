package objectsarrays;

import java.util.Comparator;

public class Movie {
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;

    // Constructors, getters, and setters

    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    // Getter and Setter methods for yearReleased, rating, budget, and collectionAmount

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }

    public void setCollectionAmount(double collectionAmount) {
        this.collectionAmount = collectionAmount;
    }

    // Two Comparator implementations for sorting Movie instances

    public static class RatingComparator implements Comparator<Movie> {
        @Override
        public int compare(Movie movie1, Movie movie2) {
            // Compare movies based on rating
            return Double.compare(movie1.getRating(), movie2.getRating());
        }
    }

    public static class ProfitComparator implements Comparator<Movie> {
        @Override
        public int compare(Movie movie1, Movie movie2) {
            // Compare movies based on profit (collectionAmount - budget)
            double profit1 = movie1.getCollectionAmount() - movie1.getBudget();
            double profit2 = movie2.getCollectionAmount() - movie2.getBudget();
            return Double.compare(profit1, profit2);
        }
    }


}
