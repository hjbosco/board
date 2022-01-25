package com.bosco.board.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    public Boolean retrieveBoard(String boardId) {
        return false;
    }

    public Boolean registerBoard(BoardReqDto boardReqDto) {
      return true;
    }

    public Boolean updateBoard(BoardReqDto boardReqDto) {
        return true;
    }

    public Boolean deleteBoard(String boardId) {
        return true;
    }
}
