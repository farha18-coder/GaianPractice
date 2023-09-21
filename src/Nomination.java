import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import RestAssuredMethods.JSONObject;

@Test
	public void PutMethod() {
		
		JSONObject request = new JSONObject();
		request.put("name", "chaya");
		request.put("job", "BAA");

		System.out.println(request);
		System.out.println(request.toString());

		given().
		body(request.toJSONString()).
		when().
		put("https://reqres.in/api/users/2").
		then().statusCode(200);
		
	
	}
	
	@Test
	public void DeleteMethod() {
		
		JSONObject request = new JSONObject();
		given().
		body(request.toJSONString()).
		when().
		delete("https://reqres.in/api/users/2").
		then().statusCode(204).
		log().all();

	} 
	

	@Test
	public void PostMethod() {
		
		JSONObject request = new JSONObject();
		request.put("name", "chaya");
		request.put("job", "BA");

		System.out.println(request);
		System.out.println(request.toString());

		given().
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().statusCode(201 );


































public class Nomination {

	 private String category;
	 private String nominee;
	 private String movieTitle;
	 private int year;
	 private boolean winner;
	 private Nomination next;
	 
	 
	 public Nomination(String category, String nominee, String movieTitle, int year, boolean winner) {
	        this.category = category;
	        this.nominee = nominee;
	        this.movieTitle = movieTitle;
	        this.year = year;
	        this.setWinner(winner);
	        this.setNext(null);
	    }

	    // getters and setters
	    public String getCategory() {
	        return category;
	    }

	    public void setCategory(String category) {
	        this.category = category;
	    }

	    public String getNominee() {
	        return nominee;
	    }

	    public void setNominee(String nominee) {
	        this.nominee = nominee;
	    }

	    public String getMovieTitle() {
	        return movieTitle;
	    }

	    public void setMovieTitle(String movieTitle) {
	        this.movieTitle = movieTitle;
	    }

	    public int getYear() {
	        return year;
	    }

	    public void setYear(int year) {
	        this.year = year;
	    }

		public boolean isWinner() {
			return winner;
		}

		public void setWinner(boolean winner) {
			this.winner = winner;
		}

		public Nomination getNext() {
			return next;
		}

		public void setNext(Nomination next) {
			this.next = next;
		}
	 
	
}
