package com.project.plus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.plus.domain.ApplyVO;
import com.project.plus.mapper.ApplyMapper;
import com.project.plus.service.ApplyService;


@Service("ApplyService")
public class ApplyServiceImpl implements ApplyService {

	@Autowired
	private ApplyMapper applyMapper;

	@Override
	public void applyFreeClub(ApplyVO vo) {
		applyMapper.applyFreeClub(vo);
	}

	@Override
	public ApplyVO checkApplyClub(ApplyVO vo) {
		return applyMapper.checkApplyClub(vo);
	}

	@Override
	public List<ApplyVO> applyPayClubInfo(ApplyVO vo) {
		return applyMapper.applyPayClubInfo(vo);		
	}

	@Override
	public List<ApplyVO> checkApplyClubByMemberNum(ApplyVO vo) {
		return applyMapper.checkApplyClubByMemberNum(vo);
	}	
	
	public List<ApplyVO> applyMember(int clubNum) {
		return applyMapper.applyMember(clubNum);
	}



}
//정연추가 20210326