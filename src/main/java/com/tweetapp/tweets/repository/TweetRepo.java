package com.tweetapp.tweets.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tweetapp.tweets.entity.Tweet;



public interface TweetRepo  extends JpaRepository<Tweet, Integer> {
    List<Tweet> findByUserEmailOrderByUpdatedDateDesc(String userEmail);
    @Transactional
    @Query(value="SELECT * FROM tweet_details ORDER BY updated_date DESC;",nativeQuery=true) 
    List<Tweet> findAllTweetsOrderByUpdatedDateDesc();
     Tweet findByTweetIdOrderByUpdatedDateDesc(int tweetId);
     
     
     
     
   
}

