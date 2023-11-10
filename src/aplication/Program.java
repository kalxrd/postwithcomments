package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow thats´awesome!");
		Post p1 = new Post(sdf.parse("21/06/2023"), "Traveling New Zeland", "I´m going to visit wonderful country!", 200);


	}

}
