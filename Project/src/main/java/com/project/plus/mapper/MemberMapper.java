package com.project.plus.mapper;

import java.util.List;


import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;

import com.project.plus.domain.MemberVO;
import com.project.plus.domain.SearchCriteriaMem;

public interface MemberMapper {
	public void joinMember(MemberVO vo);
	public void updateMember(MemberVO vo);
	public void deleteMember(int memberNum);
	
	public MemberVO login(MemberVO vo);
	public Integer kakaologin(MemberVO vo);

	//휴대폰번호 중복 검사
	public int memberPChk(String memberPhone);
	//닉네임 중복 검사
	public int memberNChk(String memberNickname);
	//이메일 중복 검사
	public int memberEChk(String memberEmail);

	public MemberVO findPw(MemberVO vo);
	public void logout(HttpSession session);
	
	public MemberVO selectMember(MemberVO vo);

	public List<MemberVO> memberList(SearchCriteriaMem scmem);
	public int listCount(SearchCriteriaMem scmem);
	public MemberVO viewMember(int memberNum);
	public int checkPw(@Param("memberEmail") String memberEmail, @Param("memberPassword") String memberPassword);
	public int changePw(MemberVO vo);
	
	//정연 하단 추가 20210326

	public void updateMemberPoint (MemberVO vo);
	
	public int selectMemberPointByNickname(MemberVO vo);

	public int selectMemberPoint(MemberVO vo);
	
	public void deductMemberPoint(MemberVO vo);
	
	public void updateClubLeaderPoint(MemberVO vo);
	
	public int selectMemberNumberByNickname(MemberVO vo);
	
	void insertLocation(MemberVO vo);
	//정연 하단 추가 20210403
	public void refundFee(MemberVO vo);


}
