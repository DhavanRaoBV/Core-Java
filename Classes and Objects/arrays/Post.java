package arrays;

public class Post {
	
	private int post_Id;
	private String ptitle;
	private String pbody;
	private Comment[] comment;
	
	public Post() {
		
	}

	
	
	public Post(int post_Id, String ptitle, String pbody, Comment[] comment) {
		
		this.post_Id = post_Id;
		this.ptitle = ptitle;
		this.pbody = pbody;
		this.comment = comment;
	}





	public int getPost_Id() {
		return post_Id;
	}

	public void setPost_Id(int post_Id) {
		this.post_Id = post_Id;
	}

	public String getPtitle() {
		return ptitle;
	}

	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}

	public String getPbody() {
		return pbody;
	}

	public void setPbody(String pbody) {
		this.pbody = pbody;
	}

	public Comment[] getComment() {
		return comment;
	}

	public void setComment(Comment[] comment) {
		this.comment = comment;
	}

	public void printPost() {
		System.out.println("Post ID= " + post_Id);
		System.out.println("Post Title= " + ptitle);
		System.out.println("Post Body= " + pbody);
		for (Comment c : comment) {
			c.printComm();
		
	}
	

}
}
