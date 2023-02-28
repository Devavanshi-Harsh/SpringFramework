package springExpressionLanguage;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj1")
public class Student {
	@Value("#{100>17?new java.lang.String('Harsh'):'Seema'}")
	private String name;
	@Value("#{2020+3}")
	private String batch;
	@Value("#{alList}")
	private ArrayList<Integer> marks;
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int sqrt;
	
	@Value("#{T(java.lang.Math).E}")
	private int E;
	
	@Value("#{new String('Sushil')}")
	private String obj;
	
	public String getName() {
		return name;
	}
	public int getSqrt() {
		return sqrt;
	}
	public void setSqrt(int sqrt) {
		this.sqrt = sqrt;
	}
	public int getE() {
		return E;
	}
	public void setE(int e) {
		E = e;
	}
	public String getObj() {
		return obj;
	}
	public void setObj(String obj) {
		this.obj = obj;
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
		return "Student [name=" + name + ", batch=" + batch + ", marks=" + marks + ", sqrt=" + sqrt + ", E=" + E
				+ ", obj=" + obj.getClass().getName() + "]";
	}
	
	

}
