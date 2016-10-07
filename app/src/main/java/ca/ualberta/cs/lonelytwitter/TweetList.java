package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by V1CTORIA2LEE on 2016-09-29.
 */
public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void add(Tweet tweet){
        tweets.add(tweet);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public Tweet getTWeet(int index){
        return tweets.get(index);
    }
}
