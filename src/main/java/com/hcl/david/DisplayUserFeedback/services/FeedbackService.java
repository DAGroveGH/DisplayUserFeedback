package com.hcl.david.DisplayUserFeedback.services;

import com.hcl.david.DisplayUserFeedback.models.FeedbackEntity;
import com.hcl.david.DisplayUserFeedback.repositories.FeedbackRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class FeedbackService {

    Logger logger = LoggerFactory.getLogger(FeedbackService.class);

    @Autowired
    private FeedbackRepository feedbackRepository;

    public FeedbackEntity saveFeedback(FeedbackEntity feedback) {
        return feedbackRepository.save(feedback);
    }

    public Iterable<FeedbackEntity> getAllFeedback() {
        return feedbackRepository.findAll();
    }

    public FeedbackEntity getFeedbackById(Long feedback_id) {
        FeedbackEntity feedback = feedbackRepository.findById(feedback_id).orElse(null);

        logger.info(feedback.toString());

        return feedback;
    }
}
