package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by V1CTORIA2LEE on 2016-09-29.
 */

/**
 * This class TweetList deals with the list of tweets the user inputs. In here the list can be
 * modified by adding or deleting, as well as acessing the actual list of tweets
 */
public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    /**
     * Instantiates a new Tweet list.
     */
    public TweetList(){
    }

    /**
     * Has tweet boolean.
     * This method determines if the List contains a specific tweet
     * @param tweet the tweet
     * @return the boolean
     */
    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    /**
     * Add.
     * This method will add a new tweet the the List
     * @param tweet the tweet
     */
    public void add(Tweet tweet){
        tweets.add(tweet);
    }

    /**
     * Delete.
     * This method will remove a tweet from the list
     * @param tweet the tweet
     */
    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    /**
     * Get tweet tweet.
     * This method will return a specific tweet.
     * @param index the index
     * @return the tweet
     */
    public Tweet getTweet(int index){
        return tweets.get(index);
    }
}
