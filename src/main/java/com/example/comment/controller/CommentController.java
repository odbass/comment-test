package com.example.comment.controller;

import com.example.comment.model.Comment;
import com.example.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    CommentService commentService;

    @GetMapping("/articles/comments")
    public List<Comment> retrieveAllComments() {
        return commentService.getAllComments();
    }

    @PostMapping("/articles/{articleId}/comments/{content}/{parentId}")
    public Comment createComment(@PathVariable("articleId") String articleId,
                                 @PathVariable("parentId") Long parentId,
                                 @PathVariable("content") String content) {

        return commentService.createComment(articleId, parentId, content);

    }
}
