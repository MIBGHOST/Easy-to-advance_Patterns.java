import java.util.*;

public class Pattern{

	public static void main(String[] args){

		System.out.println("enter the numbers for pattern: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		SolidRect(n, m);
		HollowRect(n, m);
		HalfPyramid(n);
		InvHalfPyramid(n);
		InvHalRotPyr(n);
		NumberPyr(n);
		InvNumPyr(n);
		FloydTri(n);
		Butterfly(n);
		SolidRhombus(n, m);
		NumPyr(m);
		PalindPattern(m);
		DiamondShape(n);
	}
       	public static void SolidRect(int n, int m){
	
		//Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//int m = sc.nextInt();

		for (int i=1; i<=n; i++){
		
			for (int j=1; j<=m; j++){
			      System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
        public static void HollowRect(int n, int m){
   
	     // Scanner sc = new Scanner(System.in);
             // int n=sc.nextInt();
             // int m=sc.nextInt();

	      for (int i=1; i<=n; i++){

                      for(int j=1; j<=m; j++){
		      
			      if(i==1 || j==1 || i==n || j==m){
			      System.out.print("*");
		      
			      }else 
				      System.out.print(" ");
		     }
		      System.out.println();
	      }
	      System.out.println();


        }
	static void HalfPyramid(int n){

//              Scanner in = new Scanner(System.in);
//		int k = in.nextInt();

		for(int i=1; i<=n; i++){
		
			for(int j=1; j<=i; j++){
			
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	static void InvHalfPyramid(int n){
	
		for (int i=n; i>=1; i--){
		
			for (int j=1; j<=i; j++){
			
				System.out.print("*");
			}
			System.out.println();
		}

	}
	static void InvHalRotPyr(int n){
	
		for(int i=1; i<=n; i++){
		
			for(int j=1; j<=n-i; j++){
			
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++);{
			
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	static void NumberPyr(int n){
	
		for(int i=1; i<=n; i++){
		
			for(int j=1; j<=i; j++){
			
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}
	static void InvNumPyr(int n){

		for(int i=n; i>=1; i--){
		
			for(int j=1; j<=i; j++){
			
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}
	static void FloydTri(int n){
	
		int number =1;
		for (int i=1; i<=n; i++){
		
			for (int j=1; j<=i; j++){
			
				System.out.print(number+ " ");
				number++;
			}
			System.out.println();
		}
		System.out.println();
	}
	static void Butterfly(int n){
	
		for(int i=1; i<=n; i++){
		
			for(int j=1; j<=i; j++){
			
				System.out.print("*");
			}
			for(int j=1; j<=2*(n-i); j++){
			
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
			
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n; i>=1; i--){
		
			for(int j=1; j<=i; j++){
			
				System.out.print("*");
			}
			for(int j=1; j<=2*(n-i); j++){
			
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
			
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println();

	}
	static void SolidRhombus(int n, int m){
	
		for(int i=1; i<=n; i++){
		
			for(int j=1; j<=n-i; j++){
			
				System.out.print(" ");
			}
			for(int j=1; j<=m; j++){
			
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

	}
	static void NumPyr(int n){
	
		for(int i=1; i<=n; i++){
		
			for(int j=1; j<=n-i; j++){
			
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
			
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		System.out.println();

	}
	static void PalindPattern(int n){
	
		for(int i=1; i<=n; i++){
		
			for(int j=1; j<=n-i; j++){
			
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--){
			
				System.out.print(j);
			}
			for(int j=2; j<=i; j++){
			
				System.out.print(j);
			}
                        System.out.println();
		}
		System.out.println();
	}
	static void DiamondShape(int n){
	
		for(int i=1; i<=n; i++){
		
			for(int j=1; j<=n-i; j++){
			
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++){
			
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=n-1; i>=1; i--){
		
			for(int j=1; j<=n-i; j++){
			
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++){
			
				System.out.print("*");
			}
			System.out.println();
		}
	}


}
