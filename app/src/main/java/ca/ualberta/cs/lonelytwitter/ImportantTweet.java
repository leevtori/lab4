package ca.ualberta.cs.lonelytwitter;

/**
 * Created by watts1 on 9/15/16.
 */

/**
 * This class ImportantTweet inherits from Tweet and it deals with cases where certain tweets
 * have priority over other.
 */
public class ImportantTweet extends Tweet{

    /**
     * Instantiates a new Important tweet.
     * This method will prioritize the tweet.
     * @param message the message
     */
    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }


}
