package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

/**
 * Created by watts1 on 9/15/16.
 */

/**
 * This is Interface is for Tweetable. It deals with display the message and date to the
 * actual interface.
 */
public interface Tweetable {
    /**
     * Gets message.
     *
     * @return the message
     */

    public String getMessage();

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate();

}
