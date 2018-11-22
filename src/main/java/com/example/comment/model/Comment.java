package com.example.comment.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    private String articleId;

    private String content;

    private Long parentId;

    private int level;

    public Comment()
    {

    }

    public Comment(String articleId, Long parentId, String content)
    {
        this.articleId = articleId;
        this.parentId = parentId;
        this.content = content;
    }
}
