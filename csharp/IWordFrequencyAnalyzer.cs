using System.Collections.Generic;
namespace Test
{
public interface IWordFrequencyAnalyzer
{
    // Return highest frequency in the text
    int CalculateHighestFrequency(string text);
    // Return frequency of the specified word
    int CalculateFrequencyForWord (string text, string word);
    // Return a list of the most frequent 'n' words in input text
    // Words should be returned in lowercase
    IList<IWordFrequency> CalculateMostFrequentNWords (string text, int n);
}
}