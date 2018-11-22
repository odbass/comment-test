package com.example.comment.service;

import com.example.comment.model.Comment;
import com.example.comment.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;


    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    public Comment createComment(String articleId, Long parentId, String content) {

        Comment comment = new Comment(articleId, parentId, content);

        return commentRepository.save(comment);
    }
}
