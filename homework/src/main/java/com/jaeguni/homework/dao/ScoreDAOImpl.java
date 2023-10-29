 package com.jaeguni.homework.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jaeguni.homework.dto.ScoreDTO;

//Impl에 어노테이션 달아줘야함.
@Repository
public class ScoreDAOImpl implements ScoreDAO {
	List<ScoreDTO> studentList = new ArrayList<>();
	
	//DB 정보 대신 
	public ScoreDAOImpl() {
		studentList.add(new ScoreDTO("둘리", 100, 100, 100));
		studentList.add(new ScoreDTO("고길동", 100, 100, 70));
		studentList.add(new ScoreDTO("마이클", 20, 100, 30));
		studentList.add(new ScoreDTO("심슨", 80, 100, 90));
		studentList.add(new ScoreDTO("용비", 100, 10, 90));
	}

	//프론트 측에서 온 정보 주입
	@Override
	public void insertScore(ScoreDTO scoreDTO) {
		this.studentList.add(scoreDTO);
	}
	
	//학생 성적표 전체 반환
	@Override
	public List<ScoreDTO> studentList() {
		return studentList;
	}
	
	//학생 한명 정보 반환
	//여기가 DB 접속하는 곳이라면
	//DB를 여기서 name으로 정보를 찾는건가.
	//그럼 여기서 저기 상단 리스트에서 name으로 찾아야하는게 맞는 것 같다.
	
	@Override
	public ScoreDTO scoreView(String name) {
		for (ScoreDTO student : studentList) {
			if (student.getName().equals(name)) {
				return student; //객체 넘겨줌
			}
		}
		return null;
	}

}
