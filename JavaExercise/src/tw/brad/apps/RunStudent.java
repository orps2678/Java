package tw.brad.apps;

import tw.org.iii.*;

public class RunStudent {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("¤p©ú");
		s1.setSex(1);
		s1.setScore(100);
		s1.lookName();
		s1.lookSex();
		s1.lookScore();
	}

}
