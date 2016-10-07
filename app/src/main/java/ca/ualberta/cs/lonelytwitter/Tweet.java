package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/15/16.
 */

/**
 * This class Tweet use the interface Tweetable and display the Tweets and time it was recorded
 */
public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Instantiates a new Tweet.
     * This method sets the tweet message
     * @param message the message
     * @param date    the date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    @Override
    public String toString(){
        return message;
    }

    /**
     * Is important boolean.
     * This method determins if a tweet is a priority
     * @return the boolean
     */
    public abstract Boolean isImportant();


    /**
     * Sets message.
     * This method returns the tweet if it is not too long, or else it will go to the exception.
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            //Do Something!
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     * Sets date.
     * This method sets the current date.
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }
}
