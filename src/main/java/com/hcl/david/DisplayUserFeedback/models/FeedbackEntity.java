package com.hcl.david.DisplayUserFeedback.models;

import javax.persistence.*;

@Table(name="feedback_table")
@Entity
public class FeedbackEntity {

    public FeedbackEntity () {}

    public FeedbackEntity (Long feedbackId, String feedback) {
        super();
        this.feedbackId = feedbackId;
        this.feedback = feedback;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="feedback_id")
    private Long feedbackId;

    @Column(name = "feedback")
    private String feedback;

    public Long getId() {
        return feedbackId;
    }

    public void setId(Long id) {
        this.feedbackId = feedbackId;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "id - " + feedbackId + "\nfeedback - " + feedback;
    }
}
