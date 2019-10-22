package arrays;

public class Comment {
	
	private int commt_Id;
	private String commt_Text;
	
	public Comment() {
		
	}

	public Comment(int commt_Id, String commt_Text) {
		
		this.commt_Id = commt_Id;
		this.commt_Text = commt_Text;
	}

	public int getCommt_Id() {
		return commt_Id;
	}

	public void setCommt_Id(int commt_Id) { 
	}

	public String getCommt_Text() {
		return commt_Text;
	}

	public void setCommt_Text(String commt_Text) {
		this.commt_Text = commt_Text;
	}
	
	public void printComm() {
		System.out.println("Comment ID= " + commt_Id);
		System.out.println("Comment Text= " + commt_Text);
		
	}
	

}





