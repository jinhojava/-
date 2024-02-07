package com.codingrecipe.board.dto;

import lombok.Data;

@Data

public class PageDTO {

    private int page; //현재페이지
    private int maxPage; //전체 필요한 페이지 갯수
    private int startPage; //현제 페이지 기준 시작 페이지
    private int endPage; //현재 페이지 기준 마지막 페이지값
}
