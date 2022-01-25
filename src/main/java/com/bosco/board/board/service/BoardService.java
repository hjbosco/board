package com.bosco.board.board.service;

import org.springframework.stereotype.Service;

@Service
public class BoardService {

    public BoardResDto retrieveBoard(String boardId) {
        return new Object();
    }

    public Boolean registerBoard(BoardReqDto boardReqDto) {
        return true;
    }

    public Boolean updateBoard(BoardReqDto boardReqDto) {
        return true;
    }

    public Boolean deleteBoard(BoardReqDto boardReqDto) {
        return true;
    }
}
