package videos.domain;

import java.awt.HeadlessException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		boolean newVideoAswer=false;
		int newVideoQuestion;
		List<Video> newUserVideos;
		
		User newUser = new User(null, null, null, null, null);
		newUser.setName(JOptionPane.showInputDialog("Add your name: "));
		newUser.setSurname(JOptionPane.showInputDialog("Add your surname: "));
		newUser.setPass(JOptionPane.showInputDialog("Add your password: "));
		newUser.setStartDate();
		
		newUserVideos = new ArrayList<Video>();
		do {
			newVideoQuestion=JOptionPane.showConfirmDialog(null, "\"Do you want a new video?");
				if(newVideoQuestion==0) { 
					newUserVideos.add(createVideo(sc));
				}
				else if(newVideoQuestion==1) { 
					newVideoAswer=true;
				}
		} while(newVideoAswer==false);	
		
		newUser.addVideo(newUserVideos);
		
		System.out.println(newUser);
	}	
			
	public static Video createVideo(Scanner sc) throws Exception {

		String tag;
		boolean tagGenerate=false;
		int answerNewTag;
		List<String> videoTags = new ArrayList<>();

		Video newVideo = new Video(null, null, videoTags);
		newVideo.setTitle(JOptionPane.showInputDialog("Add video title: "));
		newVideo.setUrl(JOptionPane.showInputDialog("Add video url: "));

		do {
				tag=JOptionPane.showInputDialog("Add a tag:");
					if ("".equals(tag)) {
						throw new Exception("Field required");		
					} 
					else {
						videoTags.add(tag);
					}
				answerNewTag=JOptionPane.showConfirmDialog(null, "\"Do you want to add a new tag?");
					if(answerNewTag==0) { 
						tagGenerate=false;
					}
					else if(answerNewTag==1) { 
						tagGenerate=true;
					}
		}while(tagGenerate==false);

		return newVideo;
	}
}