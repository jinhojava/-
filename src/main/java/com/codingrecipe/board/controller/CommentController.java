package com.codingrecipe.board.controller;

import com.codingrecipe.board.dto.CommentDTO;
import com.codingrecipe.board.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

     @PostMapping("/save")
    public @ResponseBody List<CommentDTO> save(@ModelAttribute CommentDTO commentDTO){
         System.out.println("CommentDTO=" + commentDTO);
         commentService.save(commentDTO);

         //해당 게시글에 작성된 댓글 리스트를 가져옴
         List<CommentDTO> commentDTOList=commentService.findAll(commentDTO.getBoardId());
         return commentDTOList;
     }
}
