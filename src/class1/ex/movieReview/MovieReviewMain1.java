package class1.ex.movieReview;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview dune = new MovieReview();
        dune.title = "듄";
        dune.review = "spice";

        MovieReview pamyo = new MovieReview();
        pamyo.title = "파묘";
        pamyo.review = "화림";

        System.out.println("영화 제목: " + dune.title + ", 리뷰: " + dune.review);
        System.out.println("영화 제목: " + pamyo.title + ", 리뷰: " + pamyo.review);
    }
}
