package com.donny.bikemis.repository;

import com.donny.bikemis.model.bo.UserFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Donny
 * @date 2024/6/12
 */
@Repository
public interface UserFeedbackRepository extends JpaRepository<UserFeedback, Long> {

}
