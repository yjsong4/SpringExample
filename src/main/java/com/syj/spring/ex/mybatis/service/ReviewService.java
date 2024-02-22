package com.syj.spring.ex.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syj.spring.ex.mybatis.domain.Review;
import com.syj.spring.ex.mybatis.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	// 전달 받은 id와 일치하는 리뷰 정보를 리턴하는 기능
	public Review getReview(int id) {
		
		Review review = reviewRepository.selectReview(id);
		return review;
	}
	
	public int addReview(
			int storeId
			, String menu
			, String userName
			, double point
			, String review) {
		
		int count = reviewRepository.insertReview(storeId, menu, userName, point, review);
		
		return count;
	}

	public int addReviewByObject(Review review) {
		int count = reviewRepository.insertReviewByObject(review);
		
		return count;
	}
	
}
