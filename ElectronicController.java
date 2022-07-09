package com.prodapt.controller;

import com.prodapt.services.ElectronicBusinessLogic;

public class ElectronicController {

	public static void main(String[] args) {

		ElectronicBusinessLogic bl = new ElectronicBusinessLogic();
		bl.CreateRecord();
		bl.update();
		bl.delete();
		bl.Display();

	}
}
