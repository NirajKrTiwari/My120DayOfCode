import java.util.*;

class GFG {
static int longestSubarrWthSumDivByK(int arr[], int N, int k)
{
	int maxl = 0;
	for (int i = 0; i < N; i++) {
	int sum1 = 0;
	for (int j = i; j < N; j++) {
		sum1 += arr[j];
		if (sum1 % k == 0)
		maxl = Math.max(maxl, j - i + 1);
	}
	}
	return maxl;
}
public static void main(String[] args)
{
	int arr[] = { 2, 7, 6, 1, 4, 5 };
	int n = arr.length;
	int k = 3;

	System.out.println("Length = "+ longestSubarrWthSumDivByK(arr, n, k));
}
}

