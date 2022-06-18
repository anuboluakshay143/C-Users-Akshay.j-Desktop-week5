package com.codeBasesdAssessment2;

public class Tester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HR hm = new HR("Akshay", 20, " Associate software Developer");
		HR hm1 = new HR("sai", 22, "Scrum master");
		HR hm2 = new HR("Alekhya", 20, "Tester");
		HR hm3 = new HR("Pruthvi", 21, "Manager");
		HR hm4 = new HR("Akhila", 21, "Data Scientist");

		hm.process_Records(hm);
		hm.process_Records(hm1);
		hm.process_Records(hm2);
		hm.process_Records(hm3);
		hm.process_Records(hm4);
		}



	

	}


