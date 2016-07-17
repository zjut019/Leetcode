package algorithm;

public class Solution {
	public int mySqrt(int x) {
		long l = 1, r = x, m = (l + r) >> 1;
		long mul = m * m;
		while (mul != x) {
			if (mul < x) {
				l = m + 1;
			} else if (mul > x) {
				r = m - 1;
			}
			m = (l + r) >> 1;
			mul = m * m;
			if(l >= r) {
				if(mul > x)
					m -= 1;
				break;
			}
		}
		return (int) m;
	}
}
