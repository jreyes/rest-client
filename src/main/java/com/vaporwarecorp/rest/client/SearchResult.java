package com.vaporwarecorp.rest.client;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class SearchResult
{
// ------------------------------ FIELDS ------------------------------

    private List<Tweet> tweets;

// --------------------------- CONSTRUCTORS ---------------------------

    public SearchResult()
    {

    }

// --------------------- GETTER / SETTER METHODS ---------------------

    @XmlElement(name = "results")
    public List<Tweet> getTweets()
    {
        return tweets;
    }

    public void setTweets( List<Tweet> tweets )
    {
        this.tweets = tweets;
    }
}
