package com.springbook.biz.view.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

@Controller
@SessionAttributes("board") 			
public class BoardController {
	/*
	 	@SessionAttributes("board")
	 		BoardVO���� ������ �������� Session���ٰ� ������ �ΰ� ���Ӱ� ����� �׸����� ����
	 		������ ����� ������ �״�� ���� 
	 	
	 	��ɺ��� Controller�� ����
	 	���� ������ �����ϱ� ���ؼ� DAO ��ü�� ���� ȣ���ϸ� �ȵȴ�.
	 	�������̽��� ��ü �����ؼ� ������ �س��ƾ� ���� ������ ���� �� �� �ִ�.
	 	 	
	 */
	
	@Autowired
	private BoardService boardService; 	// �������̽��� DAO�� ȣ��
		// Ÿ���� �������̽� ,

	
	// ������ ��ȯ ó�� (DB���� ������ ���� JSON �������� ���� ��ȯ ��Ŵ
	@RequestMapping (value = "/dataTransform.do")
	@ResponseBody	// <mvc:annotation-driven> ���� @ResponseBody�� �Դ����ϰ�
	public List<BoardVO> dataTransform(BoardVO vo) {
		// Null üũ
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		List<BoardVO> boardList = boardService.getBoardList(vo);
		
		return boardList;
	}
	
	
	// 1. �� ���
	@RequestMapping(value = "/insertBoard.do")	// Ŭ���̾�Ʈ ��û
	public String insertBoard(BoardVO vo) throws IOException {
		System.out.println("�� ��� ó�� - Spring MVC ������̼� �۵� " );
		// ���� ���ε� ó��

		MultipartFile uploadFile = vo.getUploadFile();
		if (!uploadFile.isEmpty()) {
			String fileName = uploadFile.getOriginalFilename();
			uploadFile.transferTo(new File("C:/upload/" + fileName));
		}

		boardService.insertBoard(vo);
		return "getBoardList.do";	// Forward ������� �� ������ ����
		
	}
	
	
	// 2. �� ����
	
	@RequestMapping ("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardVO vo) { 		// BoardVO�� "board"��� �̸����� ModelAttribute ����
		System.out.println("�� ���� ó�� - Spring MVC Annotation ȣ�� - Controller ����");
		
		System.out.println("��ȣ : "  + vo.getSeq());
		System.out.println("���� : "  + vo.getTitle());
		System.out.println("�ۼ��� : " + vo.getWriter()); 	// update���� �ѱ�� ������ �����ȵ�
		System.out.println("���� : " + vo.getContent());
		System.out.println("����� : " + vo.getRegdate());
		System.out.println("��ȸ�� : " + vo.getCnt());
		System.out.println("============================");
		
		
		boardService.updateBoard(vo);
		
		//  ȭ�� �׺���̼�
		
		 return "redirect:getBoardList.do";
		 
	}
	
	// 3. �� ����
	
	@RequestMapping ("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		System.out.println("�� ���� ó��- Spring MVC ������̼� ȣ�� - Controller ����");
		
		boardService.deleteBoard(vo);
		
		return "redirect:getBoardList.do"; // redirect�� �̵�
		// return "getBoardList.do"; // Forward�� �̵�
		
	}
	
	// �˻� ���� ��� ���� (Model ��ü�� ���� �� �߰� �մϴ�. Model ��ü�� ȣ���ϱ� ���� ���� �۵��Ǿ Model ��ü�� ���� �Ҵ��Ѵ�.)
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("����", "TITLE");
		conditionMap.put("����", "CONTENT");
		conditionMap.put("�̸�", "NAME");
		conditionMap.put("��¥", "REGDATE");
		
		return conditionMap;
	}
	
		// SearchConditionMap() �޼ҵ�� @ModelAttribute ������̼��� ����Ǿ� �ֱ� ������ 
		// getBoardList.do ���� ���� ���� �ȴ�.
	
	

	// 4. �� �� �˻�
	@RequestMapping ("/getBoard.do")
	public String getBoard(BoardVO vo, Model model)  {
		System.out.println("�� �� ��ȸ ó��- Spring MVC ȣ�� - Controller ����");
		
		
		 model.addAttribute("board", boardService.getBoard(vo));
		 
		 return "getBoard.jsp"; 
		 
		 // ModelAndView : Model (���������� ������ ���� �ѱ涧) + View (���������� ����)
		 // Model : Model (���������� ������ ���� �ѱ涧) 

		 
	}
	
	// 5. �� ��� �˻�
	@RequestMapping("/getBoardList.do")
	public String getBoardList( BoardVO vo, Model model) {
		
		System.out.println("�� ��� �˻� ó�� -- Spring MVC ������̼� �۵� - Controller ����");


		// NULL �� ���� �⺻ ó��
		if (vo.getSearchCondition() == null) { 	// �˻��� ���� �ʾ����� �⺻ ó��
			vo.setSearchCondition("TITLE");
		}
		if (vo.getSearchKeyword()== null) {
			vo.setSearchKeyword("");
		}
		
		
		model.addAttribute("boardList", boardService.getBoardList(vo));
		
		return "getBoardList.jsp"; 

		/*	@ModelAttribute:
		 	1. Command ��ü�� ���۵Ǵ� ��ü�̸��� �ٸ� �̸����� ����
		 	2. View���� ����� ������ �����ϴ� �뵵�� ���
		 		@ModelAttribute �� ������ �޼ҵ�� @RequestMapping ������̼��� ������ �޼ҵ� ���� ���� ȣ���
		 		@ModelAttribute �޼ҵ� ���� ����� ���ϵǴ� ��ü�� �ڵ����� Model�� ������ �ȴ�.
		 		@ModelAttribute �޼ҵ� ���� ����� ������ ��ü�� View ���������� ��� �� �� ����.
		 */
		
		
	}
	
	
}