package instructor.lesson_3;

class MovieDemo {

    public static void main(String[] args) {

        Movie movie1 = new Movie("Spiderman", "Action");

        movie1.title = "Spiderman";
        movie1.genre = "Action";



    }
}

class Movie {

    String title;
    String genre;

    Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }
}
