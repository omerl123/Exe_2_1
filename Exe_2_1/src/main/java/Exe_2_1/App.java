package Exe_2_1;

public class App 
{
   public static String BVA_Check(int Grade) {
	   if (Grade >= 1 && Grade <=49) {
		   return "F";
	   }
	   else if (Grade >=50 && Grade<=59) {
		   return "E";
	   }
	   else if (Grade >=60 && Grade <= 69) {
		   return "D";
	   }
	   else if (Grade >= 70 && Grade <=79) {
		   return "C";
	   }
	   else if (Grade >= 80 && Grade <=89) {
		   return "B";
	   }
	   else if (Grade >=90 && Grade <=100) {
		   return "A";
	   }
	   else {
		   return "Error";
	   }
   }
   
}
