class Solution {
    public int threeSumMulti(int[] arr, int target) {
      Arrays.sort(arr);
        int arrLen = arr.length;
        int modulo = (int) Math.pow(10, 9) + 7;
        int result = 0;
        
        for (int i = 0; i < arrLen; i++) {
            
            int j = i + 1;
            int k = arrLen - 1;
            int tmp = target - arr[i];
            
            while (j < k) {
                int sum = arr[j] + arr[k];
                
                if (sum < tmp) {
                    j++;
                } else if (sum > tmp) {
                    k--;
                } else {
                    if (arr[j] != arr[k]) {
                        int left = 1;
                        int right = 1;
                        
                        while (j + 1 < k && arr[j] == arr[j + 1]) {
                            left++;
                            j++;
                        }
                        
                        while (k - 1 > j && arr[k] == arr[k - 1]) {
                            right++;
                            k--;
                        }
                        
                        result += left * right;
                        result %= modulo;
                        j++;
                        k--;
                    } else {
                        result += (k - j + 1) * (k - j) / 2;
                        result %= modulo;
                        break;
                    }
                }
                
            }
        }
        return result;
    }
}