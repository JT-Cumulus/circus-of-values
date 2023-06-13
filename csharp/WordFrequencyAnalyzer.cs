namespace Test;

public class WordFrequencyAnalyzer:IWordFrequencyAnalyzer{

    public int CalculateHighestFrequency(string text){
        // split the input text with a space delimiter in lowercase
        // put the split words into a string array
        // take each word and for loop over the remainder to obtain frequency
        // continue and replace the frequency value with new value if higher
        // return frequency as int at end of array
    }
    public int CalculateFrequencyForWord (string text, string word){
        // split input text with space delimiter in lowercase
        // put split words into a string array
        // take input word and loop through the array to increment each time the word shows up
        // return frequency as int at end of array

    }

    public IList<IWordFrequency> CalculateMostFrequentNWords (string text, int n){
        // split input text with space delimiter in lowercase
        // put split words into a string array
        // take input word and loop through the array to increment each time the word shows up
        // save word and frequency in new array as IWordFrequency object

    }

}