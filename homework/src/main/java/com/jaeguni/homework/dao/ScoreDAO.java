package com.jaeguni.homework.dao;

import java.util.List;

import com.jaeguni.homework.dto.ScoreDTO;

public interface ScoreDAO {
	List<ScoreDTO> studentList();
	ScoreDTO scoreView(String name);
	void insertScore(ScoreDTO scroreDTO);
}
