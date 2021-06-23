class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       int i=0;
       int j=0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int k=0;
        if(nums1[0]>nums2[0])
        {
            j=1;
            
        }
        else if(nums1[0]<nums2[0])
        {
            
            i=1;
            
        }
        else 
        {
            al.add(nums1[0]);
            k++;
        }
        
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]==nums2[j] )
            {
                if(k>0)
                {
                   if(nums1[i]!=al.get(k-1) && nums2[j]!=al.get(k-1))
                   {
                     al.add(nums1[i]);
                    k++;
                    i++;
                    j++;
                   }
                    else 
                    {
                        j++;
                        i++;
                    }
                }else
                {
                    al.add(nums1[i]);
                    k++;
                    i++;
                    j++;

                }
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else 
            {
                j++;
            }
        }
        int arr[] = new int[al.size()];
        for(int l=0;l<al.size();l++)
        {
            arr[l] = al.get(l);
        }
       return arr;     
    }
}