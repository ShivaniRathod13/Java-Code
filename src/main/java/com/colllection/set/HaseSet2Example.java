package com.colllection.set;

import java.util.HashSet;
import java.util.Set;

public class HaseSet2Example {


        public static void main(String[] args) {
            int a[]={1,2,3,4,5,7,7,40};
            Set<Integer> s=new HashSet<Integer>();
            int b[]={10,20,30,4,40,50,7,7,4,41};
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<b.length;j++)
                {
                    if(a[i]==b[j])
                    {
                        s.add(a[i]);
                        // System.out.println("Common elemtn is - "+a[i]);
                        break;
                    }
                }
            }
            for(int no:s)
                System.out.println(no);
        }
    }


