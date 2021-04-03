import java.util.*;
class Movie_Details {

	String mov_Name;
	String lead_actor;
	String lead_actories;
	String genre;
	
	Movie_Details(String mov_Name, String lead_actor, String lead_actories, String genre){
		this.mov_Name=mov_Name;
		this.lead_actor=lead_actor;
		this.lead_actories=lead_actories;
		this.genre=genre;
	}

	public String getMov_Name() {
		return mov_Name;
	}

	public void setMov_Name(String mov_Name) {
		this.mov_Name = mov_Name;
	}

	public String getLead_actor() {
		return lead_actor;
	}

	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}

	public String getLead_actories() {
		return lead_actories;
	}

	public void setLead_actories(String lead_actories) {
		this.lead_actories = lead_actories;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String toString() {
		String s = getMov_Name() + " " + getLead_actor() + " " + getLead_actories() + " " + getGenre();
        return s;
	}
	
}

class Movie_DetailsList {
    ArrayList<Movie_Details> list = new ArrayList<Movie_Details>();

    public void add_movie(String mov_name, String lead_actor, String lead_actories, String genre) {
        list.add(new Movie_Details(mov_name, lead_actor, lead_actories, genre));
        System.out.println("Movie Added");
    }

    public void remove_movie(String name) {
        for (Movie_Details m : list) {
            if (m.mov_Name.equals(name)) {
                int index = list.indexOf(m);
                list.remove(index);
                System.out.println("Movie Removed");
                break;
            }
        }
    }

    public void remove_AllMovies() {
        list.removeAll(list);
        System.out.println("All movies are removed");
    }

    public void find_movie_by_name(String name) {
        for (Movie_Details m : list) {
            if (m.mov_Name.equals(name)) {
                int index = list.indexOf(m);
                System.out.println(list.get(index));
                break;
            }
        }
    }

    public void find_movie_by_genre(String genre) {
        for (Movie_Details m : list) {
            if (m.genre.equals(genre)) {
                int index = list.indexOf(m);
                System.out.println(list.get(index));
                break;

            }
        }
    }
    
    class NameComparator implements Comparator<Movie_Details> {
        public int compare(Movie_Details m1, Movie_Details m2) {
            return m1.mov_Name.compareTo(m2.mov_Name);
        }
    }

    class GenreComparator implements Comparator<Movie_Details> {
        public int compare(Movie_Details m1, Movie_Details m2) {
            return m1.genre.compareTo(m2.genre);
        }
    }

    public void sort(String criteria) {
        String a="name";
        if (a.equals(criteria)) {
            Collections.sort(list, new NameComparator());
            for (Movie_Details m : list) {
                System.out.println(m.mov_Name + " " + m.lead_actor + " " + m.lead_actories + " " + m.genre);
            }
        }
        else{
            Collections.sort(list, new GenreComparator());
            for (Movie_Details m : list) {
                System.out.println(m.mov_Name + " " + m.lead_actor + " " + m.lead_actories + " " + m.genre);
            }
        }
    }
}
