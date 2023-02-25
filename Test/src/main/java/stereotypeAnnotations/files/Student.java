package stereotypeAnnotations.files;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj1")
public class Student {
	@Value("Harsh")
	private String name;
	@Value("2022")
	private String batch;
	@Value("#{alList}")
	private ArrayList<Integer> marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public ArrayList<Integer> getMarks() {
		return marks;
	}
	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", batch=" + batch + ", marks=" + marks + "]";
	}
	
	

}
