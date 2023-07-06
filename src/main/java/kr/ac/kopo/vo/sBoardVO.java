package kr.ac.kopo.vo;

public class sBoardVO {
	private int postId;
	private String userId;
	private String title;
	private String contents;
	private String time;
	private int isNotice;
	private int views;
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getIsNotice() {
		return isNotice;
	}
	public void setIsNotice(int isNotice) {
		this.isNotice = isNotice;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	@Override
	public String toString() {
		return "sBoardVO [postId=" + postId + ", userId=" + userId + ", title=" + title + ", contents=" + contents
				+ ", time=" + time + ", isNotice=" + isNotice + ", views=" + views + "]";
	}
	
	
}
