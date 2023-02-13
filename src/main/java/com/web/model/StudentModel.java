package com.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Studentjava")
public class StudentModel {
@Id
private Integer studentid;
@Column
private String name;
private Integer  sub1;
private Integer sub2;
private Integer sub3;
private Integer total;
private double avearage;
private char grade;

public StudentModel() {
	super();
	// TODO Auto-generated constructor stub
}

public StudentModel(Integer studentid, String name, int sub1, int sub2, int sub3, int total, double avearage,
		char grade) {
	super();
	this.studentid = studentid;
	this.name = name;
	this.sub1 = sub1;
	this.sub2 = sub2;
	this.sub3 = sub3;
	this.total = total;
	this.avearage = avearage;
	this.grade = grade;
}

public Integer getStudentid() {
	return studentid;
}

public void setStudentid(Integer studentid) {
	this.studentid = studentid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSub1() {
	return sub1;
}

public void setSub1(int sub1) {
	this.sub1 = sub1;
}

public int getSub2() {
	return sub2;
}

public void setSub2(int sub2) {
	this.sub2 = sub2;
}

public int getSub3() {
	return sub3;
}

public void setSub3(int sub3) {
	this.sub3 = sub3;
}

public int getTotal() {
	return total;
}

public void setTotal(int total) {
	this.total = total;
}

public double getAvearage() {
	return avearage;
}

public void setAvearage(double avearage) {
	this.avearage = avearage;
}

public char getGrade() {
	return grade;
}

public void setGrade(char grade) {
	this.grade = grade;
}

@Override
public String toString() {
	return "StudentModel [studentid=" + studentid + ", name=" + name + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3="
			+ sub3 + ", total=" + total + ", avearage=" + avearage + ", grade=" + grade + "]";
}



}
