package ch14_jdbc_conn.model;

public class BbsVO {
	private int bbsNo         ;
	private int parentNo      ;
	private String bbsTitle   ;
	private String bbsContent ;
	private String authorId   ;
	private String create_dt   ;
	private String update_dt   ;
	

	

	public BbsVO(int bbsNo, int parentNo, String bbsTitle, String authorId, String create_dt, String update_dt) {
		this.bbsNo = bbsNo;
		this.parentNo = parentNo;
		this.bbsTitle = bbsTitle;
		this.authorId = authorId;
		this.create_dt = create_dt;
		this.update_dt = update_dt;
	}
	
	public BbsVO() {
		// TODO Auto-generated constructor stub
	}

	public int getBbsNo() {
		return bbsNo;
	}
	public void setBbsNo(int bbsNo) {
		this.bbsNo = bbsNo;
	}
	public int getParentNo() {
		return parentNo;
	}
	public void setParentNo(int parentNo) {
		this.parentNo = parentNo;
	}
	public String getBbsTitle() {
		return bbsTitle;
	}
	public void setBbsTitle(String bbsTitle) {
		this.bbsTitle = bbsTitle;
	}
	public String getBbsContent() {
		return bbsContent;
	}
	public void setBbsContent(String bbsContent) {
		this.bbsContent = bbsContent;
	}
	public String getAuthorId() {
		return authorId;
	}
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	public String getCreate_dt() {
		return create_dt;
	}
	public void setCreate_dt(String create_dt) {
		this.create_dt = create_dt;
	}
	public String getUpdate_dt() {
		return update_dt;
	}
	public void setUpdate_dt(String update_dt) {
		this.update_dt = update_dt;
	}
	
	
	@Override
	public String toString() {
		return "BbsVO [bbsNo=" + bbsNo + ", parentNo=" + parentNo + ", bbsTitle=" + bbsTitle + ", bbsContent="
				+ bbsContent + ", authorId=" + authorId + ", create_dt=" + create_dt + ", update_dt=" + update_dt + "]";
	}
	
	
}
