package com.jaeguni.homework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jaeguni.homework.dto.ScoreDTO;
import com.jaeguni.homework.service.ScoreService;

@Controller
@RequestMapping("/score")
public class ScoreController {

	@Autowired
	private ScoreService scoreService;

//	@GetMapping("/list")
//	@ResponseBody
//	public List<ScoreDTO> getList() {
//		List<ScoreDTO> studentList = scoreService.studentList();
//		return studentList;
//	}	
//	DATA만 보임 기존의 HTML이 안보임
	
//	@GetMapping("/list")
//	public String getStudentList(Model model) {
//		model.addAttribute("studentList", scoreService.studentList());
//		//아; 여기서는 toString 해줘야함
//		System.err.println(scoreService.studentList());
//		System.err.println("========================");
//		return "scoreList";
	//DATA 전송은 되지만 HTML에서 데이터를 아무리해도 안먹음
//	}	
	
	//Mustache 이용해서 처리
	@GetMapping("/list2")
	public String getStudentList(Model model) {
		model.addAttribute("studentList", scoreService.studentList());
		return "scoreList2";
	}	

	//점수입력
	@GetMapping("/write")
	public String insertUserInfo() {
		return "scoreWrite";
	}

	@PostMapping("/save")
	public String updateUserInfo(ScoreDTO scoreDTO) {
		scoreService.insertScore(scoreDTO);
		return "redirect:/score/list2";
	}

	//한명 성적표보기
	@GetMapping("/view/{name}")
	
	public String viewList(Model model, @PathVariable("name") String name) {
		model.addAttribute("list", scoreService.scoreView(name));
		return "/scoreView";
	}
}
