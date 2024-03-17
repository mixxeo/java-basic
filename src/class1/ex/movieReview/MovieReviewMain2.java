package class1.ex.movieReview;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview dune = new MovieReview();
        dune.title = "듄";
        dune.review = "spice";

        MovieReview pamyo = new MovieReview();
        pamyo.title = "파묘";
        pamyo.review = "화림";

        MovieReview[] reviews = new MovieReview[]{ dune, pamyo };

        for (MovieReview review : reviews) {
            System.out.println("영화 제목: " + review.title + ", 리뷰: " + review.review);
        }
    }
}
