package hust.soict.hedspi.aims.media;

import java.util.Comparator;
import java.util.Objects;

public abstract class Media {

		public static final Comparator<Media> COMPARE_BY_TITLE_COST = Comparator
	            .comparing(Media::getTitle)
	            .thenComparing(Media::getCost, Comparator.reverseOrder());
		public static final Comparator<Media> COMPARE_BY_COST_TITLE = Comparator
	            .comparing(Media::getCost, Comparator.reverseOrder())
	            .thenComparing(Media::getTitle);
		
		private int id;
		private String title;
		private String category;
		private float cost;
		public String director;
		public int length;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public float getCost() {
			return cost;
		}
		public void setCost(float cost) {
			this.cost = cost;
		}
		
		public String getDirector() {
			return this.director;
		}
		public void setDirector(String director) {
			this.director = director;
		}
		public int getLength() {
			return this.length;
		}
		public void setLength(int length) {
			this.length = length;
		}
		public Media() {
			
		}
		
		public Media(int id, String title, String category, float cost) {
	        this.id = id;
	        this.title = title;
	        this.category = category;
	        this.cost = cost;
	    }
		public Media(String title) {
			this.title = title;
		}
		
		public Media(String category, String title, float cost) {
		    this.category = category;
		    this.title = title;
		    this.cost = cost;
		}
		public boolean isMatch(String searchTitle) {
			String[] keywords = this.getTitle().toLowerCase().split("\\s+");
			for (String word : keywords) {
				if (searchTitle.toLowerCase().equals(word.toLowerCase())){
					return true;
				}
			}
			return false;
		}
		public boolean isMatch(int id ) {
			return(this.getId() == id);
		}
		@Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        Media otherMedia = (Media) obj;
	        return Objects.equals(title, otherMedia.title);
	    }
		public String getDetails() {
			return "Media details example";
		}
		
}
