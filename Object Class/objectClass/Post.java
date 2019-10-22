package objectClass;

public class Post {
	int pid;
	String pbody;
	
	public Post() {
		
	}

	public Post(int pid, String pbody) {
		super();
		this.pid = pid;
		this.pbody = pbody;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPbody() {
		return pbody;
	}

	public void setPbody(String pbody) {
		this.pbody = pbody;
	}

	@Override
	public String toString() {
		return "Post [pid=" + pid + ", pbody=" + pbody + "]";
	}
	
	
	public boolean equals(Object obj) {
		return (obj instanceof Post && this.pbody.length() == ((Post) obj).pbody.length()) ? true : false;
	}
	
	

}
