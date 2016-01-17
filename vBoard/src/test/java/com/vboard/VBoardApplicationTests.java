package com.vboard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.vboard.entity.Board;
import com.vboard.repository.BoardRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = VBoardApplication.class)
@WebAppConfiguration
public class VBoardApplicationTests {
	
	
	@Autowired
	private BoardRepository boardRepository;
	
	@Test
	public void findByNameTest(){
		Board board1 = new Board (1L, "firstBoard", " gary","My first board");
		Board board2 = new Board (2L, "secondBoard", " gary","My second board");
		Board board3 = new Board (3L, "thirdBoard", " gary","My third board");
		
		boardRepository.save(board1);
		boardRepository.save(board2);
		boardRepository.save(board3);
		System.out.println(" #########################: " + boardRepository.findByName("secondBoard"));
	}

	@Test
	public void contextLoads() {
	}

}
