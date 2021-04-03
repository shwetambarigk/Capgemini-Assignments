public class Main {

    public static void main(String[] args) {
        Movie_DetailsList movie = new Movie_DetailsList();
        movie.add_movie("big", "sahil", "sakshi", "abc");
        movie.add_movie("small", "raj", "riya", "xyz");
        movie.add_movie("little", "arun", "priya", "pqr");
        movie.add_movie("star", "mayur", "soniya", "zza");

        movie.sort("genre");
        movie.remove_movie("little");

    }
}