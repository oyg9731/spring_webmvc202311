package com.spring.mvc.chap05.repository;

import com.spring.mvc.chap05.entity.Board;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

//@Repository
public class BoardRepositoryImpl implements BoardRepository{

    private static final Map<Integer, Board> boardMap;

    // 글번호 자동으로 증가시키기 위한 공유필드
    private static int sequence;

    static {
        boardMap = new HashMap<>();

        Board b1 = new Board(++sequence, "오늘 장보러 갈건데ㅋ", "뭐 살지 추천좀 해주세욤");
        Board b2 = new Board(++sequence, "포켓몬빵 맛있어?", "무슨맛 살지 추천좀 해주세욤");
        Board b3 = new Board(++sequence, "낙곱새 개맛도리", "야무지게 먹어야지");

        boardMap.put(b1.getBoardNo(), b1);
        boardMap.put(b2.getBoardNo(), b2);
        boardMap.put(b3.getBoardNo(), b3);
    }

    @Override
    public List<Board> findAll() {
        System.out.println(boardMap);
        return new ArrayList<>(boardMap.values())
                .stream()
                .sorted(Comparator.comparing(Board::getBoardNo).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public Board findOne(int boardNo) {
        return boardMap.get(boardNo);
    }

    @Override
    public boolean save(Board board) {
        board.setBoardNo(++sequence);
        boardMap.put(board.getBoardNo(), board);
        return true;
    }

    @Override
    public boolean deleteByNo(int boardNo) {
        boardMap.remove(boardNo);
        return true;
    }
}
