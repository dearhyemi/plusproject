<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7161a5136ca54c2e0afd159888505446f1d6024c
package com.project.plus.mapper;

import java.util.List;

import com.project.plus.domain.CriteriaAdmin;
import com.project.plus.domain.InquiryVO;

public interface InquiryMapper{
	
	void inquiryForm(InquiryVO vo);
	void writeInquiry(InquiryVO vo);
	void editInquiry(InquiryVO vo);
	InquiryVO editInquiryForm(InquiryVO vo);
	void deleteInquiry(InquiryVO vo);
	InquiryVO getInquiry(InquiryVO vo);

	public List<InquiryVO> getInquiryList(CriteriaAdmin cri) throws Exception;
	public int inquiryListCount(CriteriaAdmin cri) throws Exception;
}
<<<<<<< HEAD
=======
package com.project.plus.mapper;

import java.util.List;

import com.project.plus.domain.CriteriaAdmin;
import com.project.plus.domain.InquiryVO;

public interface InquiryMapper{
	
	void inquiryForm(InquiryVO vo);
	void writeInquiry(InquiryVO vo);
	void editInquiry(InquiryVO vo);
	InquiryVO editInquiryForm(InquiryVO vo);
	void deleteInquiry(InquiryVO vo);
	InquiryVO getInquiry(InquiryVO vo);

	public List<InquiryVO> getInquiryList(CriteriaAdmin cri) throws Exception;
	public int inquiryListCount(CriteriaAdmin cri) throws Exception;
}
>>>>>>> e7608280895d9fd2dfe2abf9ce350ac13feeabc3
=======
>>>>>>> 7161a5136ca54c2e0afd159888505446f1d6024c
