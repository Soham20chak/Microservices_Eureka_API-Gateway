package com.std.user.service.entities;

public class Marks {
	private String marksId;
	private String userId;
	private String studentId;
	private int marks;
	private String remarks;
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
//	public void setMarks(int marks) {
//		this.marks = marks;
//	}
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
	public Marks(String marksId, String userId, String studentId, int marks, String remarks, String attendance) {
		super();
		this.marksId = marksId;
		this.userId = userId;
		this.studentId = studentId;
		this.marks = marks;
		this.remarks = remarks;
		this.attendance = attendance;
	}
	public Marks() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Marks [marksId=" + marksId + ", userId=" + userId + ", studentId=" + studentId + ", marks=" + marks
				+ ", remarks=" + remarks + ", attendance=" + attendance + "]";
	}
	
	

}
