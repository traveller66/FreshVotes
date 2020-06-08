package com.freshvotes.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Vote {
  private VoteID pk;
  private boolean upVote;
  
  public boolean isUpVote() {
    return upVote;
  }
  public void setUpVote(boolean upVote) {
    this.upVote = upVote;
  }
  @EmbeddedId
  public VoteID getPk() {
    return pk;
  }
  public void setPk(VoteID pk) {
    this.pk = pk;
  }


}
