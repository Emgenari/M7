package videos.domain;

import java.util.*;

public class User {
	private String name;
	private String surname;
	private String pass;
	private String startDate;
	private List<Video> videoList = new ArrayList<Video>();

	public User(String name, String surname, String pass, String startDate, List<Video> videoList) {
		this.name=name;
		this.surname=surname;
		this.pass=pass;
		this.startDate=startDate;	
	}
	public void addVideo(List<Video> videoList) {
		this.videoList=videoList;
	}
	public void setName(String name) throws Exception {
		if ("".equals(name)) {
			throw new Exception("Field required");
		}
		this.name=name;
	}
	public void setSurname(String surname) throws Exception {
		if ("".equals(surname)) {
			throw new Exception("Field required");
		}
		this.surname=surname;
	}
	public void setPass(String pass) throws Exception {
		if ("".equals(pass)) {
			throw new Exception("Field required");
		}
		this.pass=pass;
	}
	public void setStartDate() {
		Date startDate = new Date();
		this.startDate=startDate.toString();
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getPass() {
		return pass;
	}
	public String getStartDate() {
		return startDate;
	}
	public List<Video> getVideoList() {
		return videoList;
	}
	@Override
	public String toString() {
		return "User [Name=" +name+ ", Surname=" +surname+ ", Password=" +pass+ ", Starting Date=" +startDate+ ", Video List=" +videoList+ "]";
	}
}