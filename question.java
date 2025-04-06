package KBC_package;
import java.io.File;
import javax.sound.sampled.*;
import java.util.*;
public class question
{
int chance=0;
int pdecrease=0;
int fdecrease=0;
int choice;
public void putquestion()
{
Scanner sc = new Scanner(System.in);
//=================================Q1=====================================
cls('d');
star();
int amount;
amount=00000;
System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!Start the game!!!!!!!!!!!!!!!!!!!!!!");
System.out.println("Enter your Name= ");
String name = sc.nextLine();

cls('a');
System.out.println("-----------------Stage 1  -> Q1  -> 1,000RS--------------------");
System.out.println("1) Who invented Java Programming?        ");
System.out.println("1. Guido van Rossum   2. James Gosling   ");
System.out.println("3. Dennis Ritchie     4. Bjarne Stroustrup");
System.out.println("");
lifeline();
sound("question1.wav");
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();
cls('a');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion2(choice,amount,name);

if(fdecrease==1)
{
amount=00000;
System.out.println("");
System.out.println("-----------------Stage 1  -> Q1  -> 1,000RS--------------------");
System.out.println("");
System.out.println("1) Who invented Java Programming?           ");
System.out.println("                           2. James Gosling    ");
System.out.println("3.  Dennis Ritchie         ");
System.out.println("");
lifeline();
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();
cls('a');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else 
checkquestion2(choice,amount,name);
}
if(pdecrease==1)
{   
	amount=00000;
    ExperAdvice(1);
	System.out.println("");
    System.out.println("-----------------Stage 1  -> Q1  -> 1,000RS--------------------");
    System.out.println("");
    System.out.println("1. Guido van Rossum   2. James Gosling   **50-50** ");
    System.out.println("3. Dennis Ritchie     4. Bjarne Stroustrup");
    System.out.println("");
    System.out.println("Enter your choice=  ");
    choice = sc.nextInt();
	cls('a');
	if(choice==5)
    fdecrease=fdecrease+1;
    if(choice==6)
    pdecrease = pdecrease+1;
	else
    checkquestion2(choice,amount,name);	
}
//==========================================Q2=======================================================
if(chance==0)
{
if(fdecrease!=0)
fdecrease=fdecrease+1;
if(pdecrease!=0)
pdecrease = pdecrease+1;
amount=1000;
System.out.println("-----------------Stage 2  -> Q2  -> 10,000RS--------------------");
System.out.println("2) What is the extension of java code files?  ");
System.out.println("1. .js     2. .txt                    		");
System.out.println("3. .txt    4. .java");
System.out.println("");
lifeline();
sound("question2.wav");
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();
cls('b');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion4(choice,amount,name);
if(fdecrease==1)
{
amount=1000;
System.out.println("");
System.out.println("-----------------Stage 2  -> Q2  -> 10,000RS--------------------");
System.out.println("");
System.out.println("2) What is the extension of java code files?");
System.out.println("1. .js                            ");
System.out.println("          4. .java");
System.out.println("");
lifeline();
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();
cls('b');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion4(choice,amount,name);
}
if(pdecrease==1)
{
amount=1000;
ExperAdvice(2);
System.out.println("");
System.out.println("-----------------Stage 2  -> Q2  -> 10,000RS--------------------");
System.out.println("2) What is the extension of java code files?  ");
System.out.println("1. .js     2. .txt                    		      ");
System.out.println("3. .txt    4. .java");
System.out.println("");
lifeline();
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();
cls('b');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion4(choice,amount,name);
}
}//==============================================Q3========================================================
if(chance==0)
{
if(fdecrease!=0)
fdecrease=fdecrease+1;
if(pdecrease!=0)
pdecrease = pdecrease+1;
amount=10000;
System.out.println("-----------------Stage 3  -> Q3  -> 1,00,000RS--------------------");
System.out.println("3) Which of the following is not an OOPS concept in Java? ");
System.out.println("1. Polymorphism    2. Inheritance                       ");
System.out.println("3. Compilation     4. Encapsulation");
System.out.println("");
lifeline();
sound("question3.wav");
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();
cls('c');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion3(choice,amount,name);

if(fdecrease==1)
{
amount=10000;
System.out.println("");
System.out.println("-----------------Stage 3  -> Q3  -> 1,00,000RS--------------------");
System.out.println("");
System.out.println("3) Which of the following is not an OOPS concept in Java?");
System.out.println("1. Polymorphism                                                ");
System.out.println("3. Compilation      ");
System.out.println("");
lifeline();
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();
cls('c');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion3(choice,amount,name);	
}
if(pdecrease==1)
{
amount=10000;
ExperAdvice(3);
System.out.println("");
System.out.println("-----------------Stage 3  -> Q3  -> 1,00,000RS--------------------");
System.out.println("3) Which of the following is not an OOPS concept in Java?");
System.out.println("1. Polymorphism    2. Inheritance                             ");
System.out.println("3. Compilation       4. Encapsulation");
System.out.println("");
lifeline();
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();
cls('c');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion3(choice,amount,name);
}
}
//===============================Q4=========================================
if(chance==0)
{
if(fdecrease!=0)
fdecrease=fdecrease+1;
if(pdecrease!=0)
pdecrease = pdecrease+1;
amount=1000000;
System.out.println("-----------------Stage 4  -> Q4  -> 10,00,000RS--------------------");
System.out.println("4)  What is the extension of compiled java classes?  ");
System.out.println("1. .txt     2. .js                     			 ");
System.out.println("3. .class  4. .java");
System.out.println("");
lifeline();
sound("question4.wav");
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();
cls('d');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion3(choice,amount,name);

if(fdecrease==1)
{
amount=1000000;
System.out.println("");
System.out.println("-----------------Stage 4  -> Q4  -> 10,00,000RS--------------------");
System.out.println("");
System.out.println("4)  What is the extension of compiled java classes? ");
System.out.println("                    2. .js             			     " );
System.out.println("3. .class   ");
System.out.println("");
lifeline();
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();cls('d');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion3(choice,amount,name);	
}
if(pdecrease==1)
{
amount=1000000;
ExperAdvice(4);
System.out.println("");
System.out.println("-----------------Stage 4  -> Q4  -> 10,00,000RS--------------------");
System.out.println("4)  What is the extension of compiled java classes?    ");
System.out.println("1. .txt     2. .js                     			            ");
System.out.println("3. .class  4. .java");
System.out.println("");
lifeline();
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();cls('d');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion3(choice,amount,name);
}
}
//===========================================Q5=======================================
if(chance==0)
{
if(fdecrease!=0)
fdecrease=fdecrease+1;
if(pdecrease!=0)
pdecrease = pdecrease+1;
amount=1000000;
System.out.println("-----------------Stage 5  -> Q5  -> 1,00,00,000RS--------------------");
System.out.println("5) Which of these are selection statements in Java? ");
System.out.println("1.  break     2.  continue                     	    ");
System.out.println("3.  for()       4. if()");
System.out.println("");
lifeline();
sound("question5.wav");
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();
cls('e');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion4(choice,amount,name);
if(fdecrease==1)
{
amount=1000000;
System.out.println("");
System.out.println("-----------------Stage 5  -> Q5  -> 1,00,00,000RS--------------------");
System.out.println("");
System.out.println("5) Which of these are selection statements in Java?        ");
System.out.println("1.  break                		                                 ");
System.out.println("            4. if()");
System.out.println("");
lifeline();
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();cls('e');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion4(choice,amount,name);
}
if(pdecrease==1)
{
amount=1000000;
ExperAdvice(5);
System.out.println("");
System.out.println("-----------------Stage 5  -> Q5  -> 1,00,00,000RS--------------------");
System.out.println("5) Which of these are selection statements in Java? ");
System.out.println("1.  break     2.  continue                     	         ");
System.out.println("3.  for()       4. if()");
System.out.println("");
lifeline();
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();cls('e');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion4(choice,amount,name);
}
}
//================================Q6==============================================
if(chance==0)
{
if(fdecrease!=0)
fdecrease=fdecrease+1;
if(pdecrease!=0)
pdecrease = pdecrease+1;
amount=10000000;
System.out.println("-----------------Stage 6  -> Q6  -> 2,00,00,000RS--------------------");
System.out.println("6) Which of these keywords is used to define interfaces in Java?");
System.out.println("1. intf           2. Intf                     			            ");
System.out.println("3. interface   4. Interface");
System.out.println("");
lifeline();
sound("question6.wav");
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();
cls('a');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion3(choice,amount,name);	
if(fdecrease==1)
{
amount=10000000;
System.out.println("");
System.out.println("-----------------Stage 6  -> Q6  -> 2,00,00,000RS--------------------");
System.out.println("");
System.out.println("6)  Which of these keywords is used to define interfaces in Java? ");
System.out.println("                            		                                  ");
System.out.println("3. interface   4. Interface");
System.out.println("");
lifeline();
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();cls('a');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion3(choice,amount,name);	
}
if(pdecrease==1)
{
amount=10000000;
ExperAdvice(6);
System.out.println("");
System.out.println("-----------------Stage 6  -> Q6  -> 2,00,00,000RS--------------------");
System.out.println("6) Which of these keywords is used to define interfaces in Java?");
System.out.println("1. intf           2. Intf                     			              ");
System.out.println("3. interface   4. Interface");
System.out.println("");
lifeline();
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();cls('a');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion3(choice,amount,name);	
}
}
//======================================Q7===================================
if(chance==0)
{
if(fdecrease!=0)
fdecrease=fdecrease+1;
if(pdecrease!=0)
pdecrease = pdecrease+1;
amount=20000000;
System.out.println("-----------------Stage 7  -> Q7  -> 4,00,00,000RS--------------------");
System.out.println("7)  Which of the following is a superclass of every class in Java?");
System.out.println("1. ArrayList     2. Abstract class                    	    	    ");
System.out.println("3. String          4. Object class");
System.out.println("");
lifeline();
sound("question7.wav");
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();
cls('b');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion4(choice,amount,name);	
if(fdecrease==1)
{
amount=20000000;
System.out.println("");
System.out.println("-----------------Stage 7  -> Q7  -> 4,00,00,000RS--------------------");
System.out.println("");
System.out.println("7)  Which of the following is a superclass of every class in Java?");
System.out.println("                   2. Abstract class             		               ");
System.out.println("                   4. Object class");
System.out.println("");
lifeline();
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();cls('b');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion4(choice,amount,name);	
}
if(pdecrease==1)
{
amount=20000000;
ExperAdvice(7);
System.out.println("");
System.out.println("-----------------Stage 7  -> Q7  -> 4,00,00,000RS--------------------");
System.out.println("7)  Which of the following is a superclass of every class in Java? ");
System.out.println("1. ArrayList     2. Abstract class                    	    	       ");
System.out.println("3. String          4. Object class");
System.out.println("");
lifeline();
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();cls('b');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion4(choice,amount,name);
}
}
//=====================================Q8=============================
if(chance==0)
{
if(fdecrease!=0)
fdecrease=fdecrease+1;
if(pdecrease!=0)
pdecrease = pdecrease+1;
amount=40000000;
System.out.println("-----------------Stage 8  -> Q8  -> 7,00,00,000RS--------------------");
System.out.println("8)  Which one of the following is not an access modifier?  ");
System.out.println("1. Protected     2. Void                  			       ");
System.out.println("3. Public          4.  Private");
System.out.println("");
lifeline();
sound("question8.wav");
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();
cls('c');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion2(choice,amount,name);	
if(fdecrease==1)
{
amount=40000000;
System.out.println("");
System.out.println("-----------------Stage 8  -> Q8  -> 7,00,00,000RS--------------------");
System.out.println("");
System.out.println("8)  Which one of the following is not an access modifier?  ");
System.out.println("                   2. Void             			                        ");
System.out.println("3. Public          ");
System.out.println("");
lifeline();
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();cls('c');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion2(choice,amount,name);	
}
if(pdecrease==1)
{
amount=40000000;
ExperAdvice(8);
System.out.println("");
System.out.println("-----------------Stage 8  -> Q8  -> 7,00,00,000RS--------------------");
System.out.println("8)  Which one of the following is not an access modifier?  ");
System.out.println("1. Protected       2. Void                           ");
System.out.println("3. Public          4.  Private");
System.out.println("");
lifeline();
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();cls('c');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion2(choice,amount,name);	
}
}
//========================Q9============================
if(chance==0)
{
if(fdecrease!=0)
fdecrease=fdecrease+1;
if(pdecrease!=0)
pdecrease = pdecrease+1;
amount=70000000;
System.out.println("-----------------Stage 9  -> Q9  -> 10,00,00,000RS--------------------");
System.out.println("9)  What is the numerical range of a char data type in Java? ");
System.out.println("1. 0 to 65535     2. -128 to 127                     		 ");
System.out.println("3. 0 to 256         4. 0 to 32767");
System.out.println("");
lifeline();
sound("question9.wav");
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();
cls('d');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion1(choice,amount,name);	
if(fdecrease==1)
{
amount=70000000;
System.out.println("");
System.out.println("-----------------Stage 9  -> Q9  -> 10,00,00,000RS--------------------");
System.out.println("");
System.out.println("9)  What is the numerical range of a char data type in Java? ");
System.out.println("1. 0 to 65535                		                              ");
System.out.println("                 4. 0 to 32767");
System.out.println("");
lifeline();
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();cls('d');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion1(choice,amount,name);		
}
if(pdecrease==1)
{
amount=70000000;
ExperAdvice(9);
System.out.println("");
System.out.println("-----------------Stage 9  -> Q9  -> 10,00,00,000RS--------------------");
System.out.println("9)  What is the numerical range of a char data type in Java?");
System.out.println("1. 0 to 65535     2. -128 to 127                     		     ");
System.out.println("3. 0 to 256         4. 0 to 32767");
System.out.println("");
lifeline();
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();cls('d');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion1(choice,amount,name);	
}
}
//=================================Q10==============================
if(chance==0)
{
if(fdecrease!=0)
fdecrease=fdecrease+1;
if(pdecrease!=0)
pdecrease = pdecrease+1;
amount=100000000;
System.out.println("-----------------Stage 10 -> Q10 -> 14,00,00,000RS--------------------");
System.out.println("10) Which of these keywords is used to define packages in Java? ");
System.out.println("1.  pkg      2.  Pkg                     				        ");
System.out.println("3. Package   4. package");
System.out.println("");
lifeline();
sound("question10.wav");
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();
cls('e');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion10(choice,amount,name);	
if(fdecrease==1)
{
amount=100000000;
System.out.println("");
System.out.println("-----------------Stage 10 -> Q10 -> 14,00,00,000RS--------------------");
System.out.println("");
System.out.println("10) Which of these keywords is used to define packages in Java?");
System.out.println("                         			                                 ");
System.out.println("3. Package   4. package");
System.out.println("");
lifeline();
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();cls('e');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion10(choice,amount,name);	
}
if(pdecrease==1)
{
amount=100000000;
ExperAdvice(10);
System.out.println("");
System.out.println("-----------------Stage 10 -> Q10 -> 14,00,00,000RS--------------------");
System.out.println("10) Which of these keywords is used to define packages in Java? ");
System.out.println("1.  pkg      2.  Pkg                     				          ");
System.out.println("3. Package   4. package");
System.out.println("");
lifeline();
System.out.println("");
System.out.println("Enter your choice=  ");
choice = sc.nextInt();cls('e');
if(choice==5)
fdecrease=fdecrease+1;
if(choice==6)
pdecrease = pdecrease+1;
else
checkquestion10(choice,amount,name);	
}
}
}
public void ExperAdvice(int option)
{
	System.out.println("!!!!!!Remember the Experts are not always correct!!!!!!");
	
		if(option==1){
				System.out.println("1 : 28%");
				System.out.println("2 : 82%");
				System.out.println("3 : 92%");
				System.out.println("4 : 10%");
		}
		else if(option==2){
				System.out.println("1 : 18%");
				System.out.println("2 : 12%");
				System.out.println("3 : 90%");
				System.out.println("4 : 96%");
		}
		else if(option==3){
				System.out.println("1 : 18%");
				System.out.println("2 : 68%");
				System.out.println("3 : 98%");
				System.out.println("4 : 18%");
		}
		else if(option==4){
				System.out.println("1 : 98%");
				System.out.println("2 : 14%");
				System.out.println("3 : 82%");
				System.out.println("4 : 18%");
		}
		else if(option==5){
				System.out.println("1 : 65%");
				System.out.println("2 : 65%");
				System.out.println("3 : 65%");
				System.out.println("4 : 65%");
		}
		else if(option==6){
				System.out.println("1 : 18%");
				System.out.println("2 : 68%");
				System.out.println("3 : 91%");
				System.out.println("4 : 28%");
		}
		else if(option==7){
				System.out.println("1 : 71%");
				System.out.println("2 : 74%");
				System.out.println("3 : 71%");
				System.out.println("4 : 74%");
		}
		else if(option==8){
				System.out.println("1 : 21%");
				System.out.println("2 : 22%");
				System.out.println("3 : 23%");
				System.out.println("4 : 24%");
		}
		else if(option==9){
				System.out.println("1 : 18%");
				System.out.println("2 : 68%");
				System.out.println("3 : 14%");
				System.out.println("4 : 21%");	
		}
		else if(option==10){
				System.out.println("1 : 13%");
				System.out.println("2 : 11%");
				System.out.println("3 : 18%");
				System.out.println("4 : 74%");
		}
		
	
}
public void sound(String sound)
{
	 try{
	 Scanner scanner = new Scanner(System.in);	 
	 File file = new File(sound);
	 AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
	 Clip clip = AudioSystem.getClip();
	 clip.open(audioStream);
	 clip.start();	 
	 }catch(Exception e){
		System.out.println(e);
	 }
}
public static void cls(char a)
	{
		try{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			new ProcessBuilder("cmd","/c","color "+a).inheritIO().start().waitFor();
			new ProcessBuilder("cmd","/c","title KAUN BANEGA KARORPATI GAME").inheritIO().start().waitFor();			
		}catch(Exception e){
			System.out.println(e);
		}
	}
public void star()
{
System.out.println("");
System.out.println("");
System.out.println("!!!!!!!WELCOME!!!!WELCOME!!!WELCOME!!!!!!!");

System.out.println("");
System.out.println("");
System.out.println("  ******    ********");
System.out.println("    *       *      *");
System.out.println("    *       *      *");
System.out.println("    *       ********");
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("  **   **   * * * *           ** **                ");
System.out.println("  **  **    * *  *  *       ** **              ");
System.out.println("  ** **     *     * *      ** **              ");
System.out.println("  ** **     * * * **       ****                  ");
System.out.println("  **  **    * * * **       ****              ");
System.out.println("  **   **   *     * *      ** **                 ");
System.out.println("  **   **   * *  *  *       ** **               ");
System.out.println("  **   **   * * * *           ** **           ");
System.out.println("");
System.out.println("");
}

public void lifeline()
{
if(fdecrease==0&&pdecrease==0)
{
System.out.println("LIFE LINES -:   5. Fifty-Fifty     6. Expert Adivice");	
}
else if(fdecrease==1)
{
System.out.println("LIFE LINES -:   6. Expert Adivice");	
}
else if(pdecrease==1)
{
System.out.println("LIFE LINES -:   5. Fifty-Fifty ");	
}
}
//=========================================check 1======================================================
public void checkquestion1(int  condition, int amount, String name)
{
if(condition==1)
{
    System.out.println("You are Right!!");
    System.out.println("");
    System.out.println("========================================");
}
else if(condition==2)
{
    System.out.println("You are Wrong!!");
    chance=1;
	KBCcertificate(amount,name);
}  
else if(condition==3)
{  
    System.out.println("You are Wrong!!");
    chance=1 ;
	KBCcertificate(amount,name);
}
else if(condition==4)
{
    System.out.println("You are Wrong!!");
    chance=1; 
	KBCcertificate(amount,name);
}
}
//========================================check 2=================================================
public void checkquestion2(int  condition, int amount, String name)
{
if(condition==1)
{
    System.out.println("You are Wrong!!");
    chance=1;
	KBCcertificate(amount,name);
}  
else if(condition==2)
{
    System.out.println("You are Right!!");
    System.out.println("");
    System.out.println("========================================");
}
else if(condition==3)
{  
    System.out.println("You are Wrong!!");
    chance=1 ;
	KBCcertificate(amount,name);
}
else if(condition==4)
{
    System.out.println("You are Wrong!!");
    chance=1; 
	KBCcertificate(amount,name);
}
}
//===================================check 3=======================================================
public void checkquestion3(int  condition, int amount, String name)
{
if(condition==1)
{
    System.out.println("You are Wrong!!");
    chance=1;
	KBCcertificate(amount,name);
}  
else if(condition==2)
{
    System.out.println("You are Wrong!!");
    chance=1; 
	KBCcertificate(amount,name);
}
else if(condition==3)
{
    System.out.println("You are Right!!");
    System.out.println("");
    System.out.println("========================================");
}
else if(condition==4)
{
    System.out.println("You are Wrong!!");
    chance=1; 
	KBCcertificate(amount,name);
}
}
//====================================check 4===================================================
public void checkquestion4(int  condition, int amount, String name)
{
if(condition==1)
{
    System.out.println("You are Wrong!!");
    chance=1;
	KBCcertificate(amount,name);
}  
else if(condition==2)
{
    System.out.println("You are Wrong!!");
    chance=1; 
	KBCcertificate(amount,name);
}
else if(condition==3)
{
    System.out.println("You are Wrong!!");
    chance=1; 
	KBCcertificate(amount,name);
}
else if(condition==4)
{
    System.out.println("You are Right!!");
    System.out.println("");
    System.out.println("========================================");
}
}
//=================================Check Q10========================================================================
public void checkquestion10(int  condition, int amount, String name)
{
if(condition==1)
{
    System.out.println("You are Wrong!!");
    chance=1;
	KBCcertificate(amount,name);
}  
else if(condition==2)
{
    System.out.println("You are Wrong!!");
    chance=1; 
	KBCcertificate(amount,name);
}
else if(condition==3)
{
    System.out.println("You are Wrong!!");
    chance=1; 
	KBCcertificate(amount,name);
}
else if(condition==4)
{
    System.out.println("You are Right!!");
    System.out.println("");
    System.out.println("========================================");
	amount = 140000000;
	KBCcertificate(amount,name);
}	
}
//======================================check End==============================================
public void KBCcertificate(int prize, String Name)
{
System.out.println("");
System.out.println("");
System.out.println("         !!!!!!!!!!!! CERTIFICATE !!!!!!!!!!!!!");
System.out.println("                       from KBC                  ");
System.out.println("          Dear "+Name+" we will happy to say that your are");
System.out.println("our one of the contestent who complete with 200 peoples in");
System.out.println("Audition Level and after that you came in Real Game and You");
System.out.println("Answered the Questions courageously. Your all Questions are");
System.out.println("Hard and Brain Stroming.");
System.out.println("          Your efforts, Your Never Give Up Attitude made you");
System.out.println("to winner of KBC Quiz compition. Our wishes with you, your  ");
System.out.println("achievments are unstoppeble in your next years.");
System.out.println("          And I happy to say that your winnig amount is -:");
System.out.println("!!!!!!!!! "+prize+" !!!!!!!!!!!! "+prize+ " !!!!!!!!!! "+prize+" !!!!!!!!!!");
}
}
/*class KBC
{
	public static void main(String args[])
	{
		question aa = new question();
		aa.putquestion();
	}
}*/