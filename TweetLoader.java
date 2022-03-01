import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//
// import any additional packages your program might need.

class TweetLoader {

  public static ArrayList<Tweet> loadAsArrayList (String filename) throws IOException {
  
    BufferedReader reader = new BufferedReader(new FileReader(filename));

    ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
    String line = null;

    while ((line = reader.readLine()) != null){
    String[] tweet_data = line.split(",");

    Tweet new_tweet = new Tweet(Integer.parseInt(tweet_data[1]), tweet_data[0], tweet_data[2]); 

    tweetList.add(new_tweet);
  }
    return tweetList;
  }

public static Tweet[] loadAsArray (String filename) throws IOException{
 
 BufferedReader reader = new BufferedReader(new FileReader(filename));

//Create Array that holds a certain amount of tweet
 Tweet[] tweetList = new Tweet[50]; 

 //Reads File line by line and process it, Store data in line
 String line = null;

// Reads file in input object and stores in line, determines if no line exist then continues to process.
//initialize Counter to keep track of size 
int counter = 0;
while ((line = reader.readLine()) != null){
  if (counter == tweetList.length){
    // Create Temp Array with size One element larger, Copies into Temp, and assign temp as new 
    Tweet[] newArray = new Tweet [tweetList.length + 1];
    for (int i = 0; i < tweetList.length; i++){
                    newArray[i] = tweetList[i];
                }
                tweetList = newArray;
  }
         String[] tweet_data = line.split(",");
         //Parse data
            Tweet new_tweet = new Tweet(Integer.parseInt(tweet_data[1]), tweet_data[0], tweet_data[2]);
        //Take formatted tweet assign it to tweet array 
            tweetList[counter] = new_tweet;         
            counter++;
        }
        return tweetList;
    }
}

    // Implement the methods associated with the TweetLoader class
    // as described in the problem_set specification.


  // end of TweetLoader class.
