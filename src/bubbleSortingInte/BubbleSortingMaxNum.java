package bubbleSortingInte;

public class BubbleSortingMaxNum {
public static void main(String[] args) {
	int a[]= {30,20,10,50,40};
    for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]<a[j]) {
				int temp =a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
	}
   
    System.out.println("for max num when its in descending"+"  ==>  "+a[0]);
    System.out.println("for min num when its in descending"+"  ==>  "+a[a.length-1]);
}
}
