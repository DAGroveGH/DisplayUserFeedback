package com.hcl.david.DisplayUserFeedback.controllers;

import com.hcl.david.DisplayUserFeedback.models.FeedbackEntity;
import com.hcl.david.DisplayUserFeedback.services.FeedbackService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FeedbackController {

    Logger logger = LoggerFactory.getLogger(FeedbackController.class);

    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/index");
        return modelAndView;
    }

    @PostMapping("/send")
    public FeedbackEntity sendFeedback(@RequestParam String feedback) {
        logger.info(feedback.toString());

        FeedbackEntity feedbackEntity = new FeedbackEntity(null, feedback);

        return feedbackService.saveFeedback(feedbackEntity);
    }

    @GetMapping("/allFeedback")
    public Iterable<FeedbackEntity> getAllFeedback() {
        return feedbackService.getAllFeedback();
    }

    @GetMapping("/feedback")
    public FeedbackEntity getFeedback(@RequestParam (value = "feedback_id") String feedback_id) {
        logger.info(String.valueOf(feedback_id));
        Long id = Long.parseLong(feedback_id);
        return feedbackService.getFeedbackById(id);
    }
}
