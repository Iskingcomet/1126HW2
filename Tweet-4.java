
//
// Implement the tweet class according to the problem_set specifications.
//

class Tweet implements Comparable{
  // Attributes
  public int tweetId;
  public String tweetSen;
  public String tweetText;
  // Define the Attributes

// Constructor
// Local Variables any name relate to attributes
  public Tweet(int Id, String Sen, String Txt){
    this.tweetId = Id; 
    this.tweetSen = Sen;
    this.tweetText = Txt;
  }
  // Define a constructor.


  public String toString() {
    return String.format("%d (%s): %s", this.tweetId, this.tweetSen, this.tweetText);
  }

  // Override the toString method.
public boolean equals(Object o) 
	{
		Tweet tmp = (Tweet)o;
		if(this.tweetId == tmp.tweetId) {
			return true;
		}
    {
			return false;
		}
	}


  public int compareTo(Object o) 
	{
		Tweet tmp = (Tweet)o;
		if (this.tweetId < tmp.tweetId) {
			return -1;
		}
		else if (this.tweetId > tmp.tweetId) {
			return 1;
		}
		{
			return 0;
		}			
	}
} // End of Tweet class
