/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simplearraysum;

import java.util.Scanner;

/**
 *
 * @author Nhat Anh
 */
public class SimpleArraySum {
    public static int caculatorSum(int[] nums){
    int sum = 0;
    //loop for find sum
    for(int i = 0; i < nums.length; i++){
        sum+= nums[i];
    }
    return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        //Loop for read input
        for(int i = 0; i< nums.length; i++ ){
            nums[i] = sc.nextInt();
        }
        System.out.println(caculatorSum(nums));
    }
}
