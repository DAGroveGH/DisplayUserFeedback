package com.hcl.david.DisplayUserFeedback.repositories;

import com.hcl.david.DisplayUserFeedback.models.Feedback;
import org.springframework.data.repository.CrudRepository;

public interface FeedbackRepository extends CrudRepository<Feedback, Long> {
}
