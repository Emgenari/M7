package videos.domain;

import java.util.*;

public class Video {
	private String title;
	private String url;
	private List<String> tagList = new ArrayList<String>();
	
	public Video(String title, String url, List<String> tagList) {
		this.title=title;
		this.url=url;
		this.tagList=tagList;
	}
	public void setTitle(String title) throws Exception {
		if ("".equals(title)) {
			throw new Exception("Field required");
		}
		this.title=title;	
	}
	public void setUrl(String url) throws Exception {
		if ("".equals(url)) {
			throw new Exception("Field required");
		}
		this.url=url;	
	}
    public void setTagList(List<String> tagList) {
   	 this.tagList=tagList;
    }
	public String getTitle() {
		return title;
	}
	public String getUrl() {
		return url;
	}
	public List<String> getTagList() {
		return tagList;
	}
	@Override
	public String toString() {
		return "Video [Title=" +title+ ", Url=" +url+ ", Tags=" +tagList+ "]";
	}
}