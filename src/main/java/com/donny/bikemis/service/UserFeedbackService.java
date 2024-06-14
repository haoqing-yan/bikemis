package com.donny.bikemis.service;

import com.donny.bikemis.model.UserFeedback;
import com.donny.bikemis.repository.UserFeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Donny
 * @date 2024/6/12
 */

@Service
public class UserFeedbackService {
    @Autowired
    private UserFeedbackRepository userFeedbackRepository;

    public UserFeedback saveFeedback(UserFeedback feedback) {
        return userFeedbackRepository.save(feedback);
    }

    public Optional<UserFeedback> getFeedbackById(Long id) {
        return userFeedbackRepository.findById(id);
    }

    public List<UserFeedback> getAllFeedbacks() {
        return userFeedbackRepository.findAll();
    }

    public void deleteFeedback(Long id) {
        userFeedbackRepository.deleteById(id);
    }
}
