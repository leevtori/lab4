package ca.ualberta.cs.lonelytwitter;

/**
 * Created by watts1 on 9/15/16.
 */

/**
 * This class NormalTweet inherits properties from Tweet, and it will handle cases where
 * the tweets have no special case/priority.
 */
public class NormalTweet extends Tweet {

    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the message
     */
    public NormalTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
