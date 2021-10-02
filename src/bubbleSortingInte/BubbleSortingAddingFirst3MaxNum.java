package bubbleSortingInte;

public class BubbleSortingAddingFirst3MaxNum {

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
	    int sum=0;
	    for (int i = 0; i <3; i++) {
			sum =sum+a[i];
			System.out.println(a[i]);
		}
	    System.out.println("its sum of first 3 max num  ===> "+sum);
	}

}
