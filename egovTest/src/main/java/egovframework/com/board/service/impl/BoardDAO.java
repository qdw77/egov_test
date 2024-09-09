package egovframework.com.board.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository("BoardDAO")
public class BoardDAO extends EgovAbstractMapper{
	
	public List<HashMap<String, Object>> selectBoardList(HashMap<String, Object> paramMap){
		return selectList("selectBoardList", paramMap);
	}
	
	public int selectBoardListCnt(HashMap<String, Object> paramMap) {
		return selectOne("selectBoardListCnt", paramMap);
	}
	
	public int insertBoard(HashMap<String, Object> paramMap) {
		return insert("insertBoard", paramMap);
	}
	
	public int updateBoard(HashMap<String, Object> paramMap) {
		return update("updateBoard", paramMap);
	}
	
	// int로 받아서 int로 넘겨 주었으므로 int로 
	public HashMap<String, Object> selectBoardDetail(int boardIdx) {
		return selectOne("selectBoardDetail", boardIdx) ;
				
	}

	public int deleteBoard(HashMap<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return update("deleteBoard", paramMap);
	}

}
