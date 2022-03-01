//
// Add any import statement your program might need
import java.util.ArrayList;
import java.io.IOException;

class Main {
  public static void main(String[] args) {

Tweet[] myArray = null ;
try{
  myArray = TweetLoader.loadAsArray("tweet_data_sorted.csv");
} catch (IOException e){
  System.out.println(e);
}

Tweet key = new Tweet(1000,"","" );
int t_index = SearchObject.linearSearch(myArray, myArray.length, key);
printResult(myArray, key, t_index);

System.out.println("");
  
key = new Tweet(1005,"","" );
t_index = SearchObject.linearSearch(myArray, myArray.length, key);
printResult(myArray, key, t_index);

System.out.println("");

key = new Tweet(1804,"","" );
t_index = SearchObject.binarySearch(myArray, myArray.length, key);
printResult(myArray, key, t_index);

System.out.println("");
    
key = new Tweet(2499,"","" );
t_index = SearchObject.binarySearch(myArray, myArray.length, key);
printResult(myArray, key, t_index);

System.out.println("");

key = new Tweet(2504,"","" );
t_index = SearchObject.binarySearch(myArray, myArray.length, key);
printResult(myArray, key, t_index);

System.out.println("");

key = new Tweet(2800,"","" );
t_index = SearchObject.linearSearch(myArray, myArray.length, key);
printResult(myArray, key, t_index); 
}
 
public static void printResult (Tweet [] myArray, Tweet searchKey, int t_index){
		if (t_index >= 0){
			System.out.println(String.format("Tweet with : %d found at index %d", searchKey.tweetId, t_index));
			System.out.println(myArray[t_index]);
		}
		else{
			System.out.println(String.format("Tweet with id %d was not found on the list",  searchKey.tweetId));
		}
	}
}
 // end of Main class

