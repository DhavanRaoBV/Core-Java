package arrays;

public class User {
	private int uid;
	private String name;
	private Post[] post;
	
	public User() {
		
	}
	
	public User(int uid, String name, Post[] post) {
	
		this.uid = uid;
		this.name = name;
		this.post = post;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Post[] getPost() {
		return post;
	}

	public void setPost(Post[] post) {
		this.post = post;
	}
	
	
	public void printUser() {
		System.out.println("User ID= " + uid);
		System.out.println("User Name= " + name);
		
		for (Post p : post) {
			p.printPost();
		
	}
	
	}
}
