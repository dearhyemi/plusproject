package com.project.plus.domain;

import java.math.BigDecimal;
import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MemberVO {
	private int memberNum;
	private String memberPhone;
	private String memberPic;
	private String memberEmail;
	private String memberPassword;
	private String memberName;
	private String memberNickname;
	private int memberPoint;
	private Date memberJoindate;
	private String memberMarketing;
	private BigDecimal memberLatitude;
	private BigDecimal  memberLongitude;
	
	//조인을 위해 선언한 객체
	
	public int getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberPic() {
		return memberPic;
	}
	public void setMemberPic(String memberPic) {
		this.memberPic = memberPic;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberNickname() {
		return memberNickname;
	}
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}
	public int getMemberPoint() {
		return memberPoint;
	}
	public void setMemberPoint(int memberPoint) {
		this.memberPoint = memberPoint;
	}
	public Date getMemberJoindate() {
		return memberJoindate;
	}
	public void setMemberJoindate(Date memberJoindate) {
		this.memberJoindate = memberJoindate;
	}
	public String getMemberMarketing() {
		return memberMarketing;
	}
	public void setMemberMarketing(String memberMarketing) {
		this.memberMarketing = memberMarketing;
	}

	

	@Override
	public String toString() {
		return "MemberVO [memberNum=" + memberNum + ", memberPhone=" + memberPhone + ", memberPic=" + memberPic
				+ ", memberEmail=" + memberEmail + ", memberName=" + memberName + ", memberNickname=" + memberNickname
				+ ", memberPoint=" + memberPoint + ", memberJoindate=" + memberJoindate + ", memberMarketing="
				+ memberMarketing + ", memberLatitude=" + memberLatitude + ", memberLongitude=" + memberLongitude + "]";
	}

	
	
	
}
