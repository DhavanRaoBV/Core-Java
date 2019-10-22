package arrays;

import java.util.Scanner;

public class Testuser {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of Users");

		User[] users = new User[scan.nextInt()];
		
		for (int i = 0; i < users.length; i++) {
			users[i] = new User();
			System.out.println("Enter User id");
			users[i].setUid(scan.nextInt());
			System.out.println("Enter name");
			users[i].setName(scan.next());
			System.out.println("Enter number of Posts");
			Post[] posts = new Post[scan.nextInt()];
			for (int j = 0; j < posts.length; j++) {
				posts[j] = new Post();
				
				System.out.println("Enter Post ID");
				posts[j].setPost_Id(scan.nextInt());
				System.out.println("Enter Post Title");
				posts[j].setPtitle(scan.next());
				System.out.println("Enter Post Body");
				scan.nextLine();
				posts[j].setPbody(scan.nextLine());
				
			
				
				System.out.println("Enter number of Comments");
				Comment[] comments = new Comment[scan.nextInt()];
				
				for (int k = 0; k < comments.length; k++) {
					comments[k] = new Comment();
					
					System.out.println("Enter Comment ID");
					comments[k].setCommt_Id(scan.nextInt());
					System.out.println("Enter Comment Text");
					scan.nextLine();
					comments[k].setCommt_Text(scan.nextLine());
				}
				posts[j].setComment(comments);
			}
			users[i].setPost(posts);
		}
		for(User u:users) {
			u.printUser();
		}
	}
}
				
					
					
				
				




