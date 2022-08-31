#include<stdio.h> 
#include<stdlib.h> 
#include<math.h> 
#include<time.h> 
void insertion_sort(long a[],int n) 
{ 
 int i,j; 
 long key; 
 for(i=1;i<n;i++) 
 { 
 key=a[i]; 
 j=i-1;
 while(j>=0 && a[j]>key) 
 { 
 a[j+1]=a[j]; 
 j--; 
 } 
 a[j+1]=key; 
 } 
} 
int main(){ 
 int n,i; 
 long a[1000]; 
 clock_t start,end; 
 double clk; 
 printf("ENTER THE NO. OF CALLS\n"); 
 scanf("%d",&n); 
 
 for(i=0;i<n;i++) 
 a[i]=9000000000+(rand()%10000000)+1; 
 
 printf("THE PHONE NO.s ARE:\n"); 
 for(i=0;i<n;i++) 
 printf("%ld\t",a[i]); 
 printf("\n"); 
 
 start=clock(); 
 insertion_sort(a,n); 
 end=clock(); 
 clk=(double)(end-start)/CLOCKS_PER_SEC; 
 
 printf("THE SORTED PHONE NO.S ARE:\n"); 
 for(i=0;i<n;i++) 
 printf("%ld\t",a[i]);
 printf("\n"); 
 
 printf("TIME TAKEN FOR EXECUTION: %f\n",clk); 
}
