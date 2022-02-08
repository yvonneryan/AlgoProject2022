package ie.itcarlow.AlgoProject;

public class Set {
	final static int REPEATED_GRADE = -1;
	int k;
	int[] S;
	int end = 0;
	
	public Set(int[] grades)
	{
		S = grades;
	}
	
	public int add(int key) {
		for (int i = 0; i < end; i++) {
			if (S[i] == key) {
				return REPEATED_GRADE;
			}
		}
		S[end] = key;
		end++;
		return key;
	}
	
	// contains method
	public boolean contains(int k) 
	{
		for (int i = 0; i < end; i++) 
		{
			if (S[i] == k) { return true; }
		}
		return false;
	}
	
	// remove method
	public void remove(int k) 
	{	
		// Test to make sure loop cancels properly
		for(int i = 0; i <= end; i++)
		{
			if (S[i] == k)
			{
				S[i] = -1;
				for (; i <= end; i++)
				{
					S[i] = S[i+1];
				}
				end--;
			}
		}
	}
	
	public int getValueAtIdx(int idx) {
		return S[idx];
	}
	
	// get size method
	public int getSize() {
		return end - 1;
	}
	
	// remove all method - to remove all elements from the specified set in remSet
	public void removeAll(Set remset) {
		// For each value in the set of values to be removed
		for (int i = 0; i <= remset.getSize(); i++)
		{
			// Get that value in the set, and then remove it from this set.sd
			remove(remset.getValueAtIdx(i));
		}
	}
	
	public int findMax() 
	{	int max = 0;
		S[0] = max;
		
		for (int i = 0; i <= end; i++)
		{
			if (S[i] > max)
			{
				S[i] = max;
			}
		}
		return max;
	}
	
	public Set subsetRange(int end)
	{
		// If no start index suggested, start at 0
		return subsetRange(0, end);
	}
	
	public Set subsetRange(int start, int end) 
	{
		int range = end - start;
		int[] elements = new int[range];
		for(int i = start; i <= end; i++) {
			elements[i] = S[i];
		}
		
		return new Set(elements);
	}
}

