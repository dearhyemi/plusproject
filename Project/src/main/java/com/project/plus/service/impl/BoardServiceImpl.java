<<<<<<< HEAD
<<<<<<< HEAD
package com.project.plus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.plus.domain.BoardVO;
import com.project.plus.mapper.BoardMapper;
import com.project.plus.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardMapper mapper;
	
	public int insertBoard(BoardVO board) {
		return mapper.insertBoard(board);
	}

	@Override
	public BoardVO getBoard(int boardNum) {
		return mapper.getBoard(boardNum);
	}

	@Override
	public List<BoardVO> getBoardList(int clubNum) {
		return mapper.getBoardList(clubNum);
	}

	@Override
	public void updateBoard(BoardVO board) {
		mapper.updateBoard(board);
		
	}

	@Override
	public void deleteBoard(int boardNum) {
		System.out.println("Del service impl 진입 ");
		mapper.deleteBoard(boardNum);
		
	}
}
=======
=======
>>>>>>> 7161a5136ca54c2e0afd159888505446f1d6024c
package com.project.plus.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.plus.domain.BoardVO;
import com.project.plus.mapper.BoardMapper;
import com.project.plus.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardMapper mapper;
	
	public int insertBoard(BoardVO board) {
		return mapper.insertBoard(board);
	}

	@Override
	public BoardVO getBoard(int boardNum) {
		return mapper.getBoard(boardNum);
	}

	@Override
	public List<BoardVO> getBoardList(int clubNum) {
		return mapper.getBoardList(clubNum);
	}

	@Override
	public void updateBoard(BoardVO board) {
		mapper.updateBoard(board);
		
	}

	@Override
	public void deleteBoard(int boardNum) {
		System.out.println("Del service impl 진입 ");
		mapper.deleteBoard(boardNum);
		
	}

	@Override
	public List<BoardVO> getMoreContents(Map<String, Integer> map) {
		return mapper.getMoreContents(map);
	}

	@Override
	public int getContentCount(int clubNum) {
		return mapper.getContentCount(clubNum);
	}
}
<<<<<<< HEAD
>>>>>>> e7608280895d9fd2dfe2abf9ce350ac13feeabc3
=======
>>>>>>> 7161a5136ca54c2e0afd159888505446f1d6024c
