package com.project.plus.service;

import java.util.List;

import com.project.plus.domain.ClubVO;
import com.project.plus.domain.InquiryVO;
import com.project.plus.domain.MemberVO;
import com.project.plus.domain.PaymentVO;
import com.project.plus.domain.VisitCountVO;

public interface AdminService {
	
	void deleteAdminInquiry(InquiryVO vo);

	InquiryVO getAdminInquiry(InquiryVO vo);

	List<InquiryVO> getAdminInquiryList(InquiryVO vo);
	
	int getAdminChart(MemberVO mvo);
	
	int getAdminVisit(VisitCountVO vcvo);
	
	int getAdminDayVisit(VisitCountVO vcvo);
	
	int getVisit_1(VisitCountVO vcvo);
	int getVisit_2(VisitCountVO vcvo);
	int getVisit_3(VisitCountVO vcvo);
	int getVisit_4(VisitCountVO vcvo);
	int getVisit_5(VisitCountVO vcvo);
	int getVisit_6(VisitCountVO vcvo);
	
	int getCateStudy(VisitCountVO vcvo);
	int getCateExcer(VisitCountVO vcvo);
	int getCateHabit(VisitCountVO vcvo);
	int getCateHobby(VisitCountVO vcvo);
	
	int getJoinToday(MemberVO mvo);
	int getJoin_1(MemberVO mvo);
	int getJoin_2(MemberVO mvo);
	int getJoin_3(MemberVO mvo);
	int getJoin_4(MemberVO mvo);
	int getJoin_5(MemberVO mvo);
	int getJoin_6(MemberVO mvo);
	
	
	InquiryVO answerInquiryForm(InquiryVO vo);
	
	void answerInquiry(InquiryVO vo);


	List<PaymentVO> adminPayList(PaymentVO pvo);
	List<ClubVO> adminClubList(ClubVO cvo);

	
	void deleteAdminClub(ClubVO cvo);

//	List<Map<String, Object>> getAdminInquiryList(CriteriaAdmin criAd);
//	int countAdminInquiryList(InquiryVO vo);
	
}
