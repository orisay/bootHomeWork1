package com.jaeguni.homework.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaeguni.homework.dao.ScoreDAO;
import com.jaeguni.homework.dto.ScoreDTO;

//Impl파일에 @Service 넣고 @AutoWired한다. @Autowired는 Interface 클래스
@Service
public class ScoreServiceImpl implements ScoreService {

	@Autowired
	private ScoreDAO scoreDAO;
	
	
	//여기서 총합과 평균 구해서 보내줘야함
	@Override
	public List<ScoreDTO> studentList() {
		return scoreDAO.studentList();
	}

	//여기서 총합과 평균 구해서 보내줘야함 그런데 우선 객체 정보로 온다.
	@Override
	public ScoreDTO scoreView(String name) {
		return scoreDAO.scoreView(name);
	}

	@Override
	public void insertScore(ScoreDTO scroreDTO) {
		scoreDAO.insertScore(scroreDTO);
	}

	

}
