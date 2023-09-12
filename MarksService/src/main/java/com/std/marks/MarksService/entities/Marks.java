package com.std.marks.MarksService.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table(name = "marks")
public class Marks {
	@Id
	private String marksId;
	@NotBlank
	private String userId;
	@NotBlank
	private String studentId;
	@Min(0)
	@Max(100)
	private int marks;
	private String remarks;
	@Min(0)
	@Max(100)
	private String attendance;
	public String getMarksId() {
		return marksId;
	}
	public void setMarksId(String marksId) {
		this.marksId = marksId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getAttendance() {
		return attendance;
	}
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}
	@Override
	public String toString() {
		return "Marks [marksId=" + marksId + ", userId=" + userId + ", studentId=" + studentId + ", marks=" + marks
				+ ", remarks=" + remarks + ", attendance=" + attendance + "]";
	}
	public Marks() {
		super();
	}
	public Marks(String marksId, String userId, String studentId, int marks, String remarks, String attendance) {
		super();
		this.marksId = marksId;
		this.userId = userId;
		this.studentId = studentId;
		this.marks = marks;
		this.remarks = remarks;
		this.attendance = attendance;
	}
	

}
