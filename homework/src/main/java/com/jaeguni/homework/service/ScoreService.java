package com.jaeguni.homework.service;

import java.util.List;

import com.jaeguni.homework.dto.ScoreDTO;

public interface ScoreService {
	List<ScoreDTO> studentList();
	ScoreDTO scoreView(String name);
	void insertScore(ScoreDTO scroreDTO);
}
