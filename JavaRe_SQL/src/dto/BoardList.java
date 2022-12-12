package dto;

public class BoardList {
	
	private int no;
	private String bTitle;
	private String bContent;
	private String bId;
	
	public BoardList(int no, String bTitle, String bContent, String bId) {
		super();
		this.no = no;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bId = bId;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public String getbId() {
		return bId;
	}
	public void setbId(String bId) {
		this.bId = bId;
	}
	
	

}
