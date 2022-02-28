package Library.Test;


	import java.util.Scanner;

	public class Project {

		public static void main(String[] args) {
			 char r;
			do 	{

			System.out.println("-----------------------------------");
			System.out.println("Library Management System");
	        System.out.println("-----------------------------------");
	        
	        
			System.out.println("1:To Add Book");
			System.out.println("2:To Issue Book");
			System.out.println("3:To Return Book");
			System.out.println("4:To Print Book Details");
			System.out.println("5:Exit");
			
			Scanner obj1=new Scanner(System.in);
			System.out.println("Enter any Option");
			int a = obj1.nextInt();
			switch(a)
			{
			case 1 :
				Library aa = new Library();
				aa.add();
				break;
			case 2 :
				Library bb = new Library();
				bb.issue();
				break;
			case 3 :
				Library cc = new Library();
				cc.retr();
				break;
			case 4 :
				Library dd = new Library();
				dd.detail();
				break;
			case 5 :
				Library ee = new Library();
				ee.exit();
				break;
				
				default:
					System.out.println("Invalid Number");
			
			}
			
			
		
			System.out.println("Next Option Y/N:");
			r=obj1.next().charAt(0);
			
			}
			  while(r=='Y' || r=='y');
			if(r=='n'|| r=='N');
			{
				Library z = new Library();
				z.exit();
			}
			
			
	      
	}
	}
	class Library
	{
		static String str,b,date;
		static int a,c;
		
		
		void add()
		{
			System.out.println("Enter book Details:");
			Scanner obj2=new Scanner(System.in);
			String str=obj2.nextLine();
			double price = obj2.nextInt();
			int bookno=obj2.nextInt();
			System.out.println("Book Details :");
			System.out.println("Book Name :"+str);
			System.out.println("Book Price:"+price);
			System.out.println("Book Id :"+bookno);



			

		}
		
		void issue()
		{
			Scanner obj3=new Scanner(System.in);
			System.out.println("Book Name");
		     str = obj3.nextLine();
			System.out.println("Book_ID");
			 a = obj3.nextInt();
			obj3.nextLine();
			System.out.println("Issue Date");
			b = obj3.nextLine();
			System.out.println("Total number of book Issue:");
			c = obj3.nextInt();
			obj3.nextLine();
			System.out.println("Return Book Date:");
			date=obj3.nextLine();
			
		}
			
		int getid()
		{
			
		
			return a;
		}
			
		void retr()
				{
			System.out.println("Enter Student Name And Book_Id");
			Scanner o = new Scanner(System.in);
			String name = o.nextLine();
			int bookid=o.nextInt();
			if(a==bookid)
			{
				System.out.println("Book Details:");
				System.out.println(" Book Name"+Library.str);
				System.out.println("Book Id"+ Library.a);
				System.out.println("Book Issue Date"+Library.b);
				System.out.println("Total number of book Issue:"+Library.c);
				System.out.println("Book Return Date:"+Library.date);

			}
			else
			{
				System.out.println("Wrong Id ,Enter Correct Id");
			}

			}
			
			void detail()
			{
				System.out.println("Book Name:"+Library.str);
				System.out.println("Book Id:"+Library.a);
				System.out.println("Book Issue Date"+Library.b);
				System.out.println("Total number of book Issue:"+Library.c);
				System.out.println("Book Return Date:"+Library.date);

				}
			
			void exit()
			{
				System.exit(0);
			}
			
	}






