package com.freshvotes.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment {
  private String text;
  private CommentId pk;
  
  @Column(length=5000)
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @EmbeddedId
  public CommentId getPk() {
    return pk;
  }

  public void setPk(CommentId pk) {
    this.pk = pk;
  }

}
