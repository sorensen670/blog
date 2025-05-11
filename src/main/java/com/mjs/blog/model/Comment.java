package com.mjs.blog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Comment {
    @Id @GeneratedValue
    private Long id;
    private String textMarkdown;
    private LocalDateTime createdAt;

    @ManyToOne
    private Post post;

    @ManyToOne
    private User commenter;

    public Long getId() {
        return id;
    }
    public String getMarkdown() {
        return textMarkdown;
    }
    public void setMarkdown(String textMarkdown) {
        this.textMarkdown = textMarkdown;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public Post getPost() {
        return post;
    }
    public void setPost(Post post) {
        this.post = post;
    }
    public User getCommenter() {
        return commenter;
    }
    public void setCommenter(User commenter) {
        this.commenter = commenter;
    }

}
