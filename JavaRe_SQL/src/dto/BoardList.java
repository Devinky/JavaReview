package dto;

public class BoardList {
	
	private int bNum;
	private String bTitle;
	private String bContent;
	private String bId;
	
	public BoardList(int bNum, String bTitle, String bContent, String bId) {
		super();
		this.bNum = bNum;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bId = bId;
	}
	public int getbNum() {
		return bNum;
	}
	public void setbNum(int bNum) {
		this.bNum = bNum;
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
