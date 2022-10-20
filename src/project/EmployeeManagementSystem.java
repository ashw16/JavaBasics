package project;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

class Employee {
	int id;
	String name;
	float salary;
	long contact_no;
	String email_id;

	public Employee(int id, String name, float salary, long contact_no, String email_id) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.contact_no = contact_no;
		this.email_id = email_id;
	}

	public String toString() {
		return "\nEmployee Details :" + "\nID: " + this.id + "\nName: " + this.name + "\nSalary:" + this.salary
				+ "\nContact No: " + this.contact_no + "\nEmail-Id: " + this.email_id;
	}
}

public class EmployeeManagementSystem {
	static void display(ArrayList<Employee> al) {
		System.out.println("\n---------------Employee List------------");
		for (Employee e : al) {
			System.out.println("\nID:" + e.id + " " + "\nName:" + e.name + " " + "\nContact No:" + e.contact_no + " "
					+ "\nEmail-Id:" + e.email_id);
		}
	}

	public static void main(String[] args) {
		int id;
		String name;
		float salary;
		long contact_no;
		String email_id;

		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> al = new ArrayList<Employee>();

		File f = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		do {
			System.out.println("-----------Welcome To Employee Management System------");
			System.out.println(
					"1.Add Employee to the Database\n" + "2.Search for an Employee\n" + "3.Edit Employee Details\n"
							+ "4.Delete Employee Details\n" + "5.Display all the Employee Details\n" + "6.Exit\n");
			System.out.println("Enter your Choice:");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("\nEnter the following details to Add List:\n");
				System.out.println("Enter ID:");
				id = sc.nextInt();
				System.out.println("Enter Name:");
				name = sc.next();
				System.out.println("Enter Salary:");
				salary = sc.nextFloat();
				System.out.println("Enter Contact No:");
				contact_no = sc.nextLong();
				System.out.println("Enter Email-Id:");
				email_id = sc.next();
				al.add(new Employee(id, name, salary, contact_no, email_id));
				display(al);
				break;
			case 2:
				System.out.println("Enter the Employee Id to Search: ");
				id = sc.nextInt();
				int i = 0;
				for (Employee e : al) {
					if (id == e.id) {
						System.out.println(e + "\n");
						i++;
					}
				}
				if (i == 0) {
					System.out.println("\n Employee Details are not available");
				}
				break;
			case 3:
				System.out.println("Enter the Employee ID to Edit the details:");
				id = sc.nextInt();
				int j = 0;
				for (Employee e : al) {
					if (id == e.id) {
						j++;
					}
					do {
						int ch1 = 0;
						System.out.println("\nEdit Employee Details:\n" + "1. Employee ID:\n" + "2. Name:\n"
								+ "3. Salary\n" + "4. Contact No\n" + "5. Email-Id\n" + "6. Go Back\n");
						System.out.println("Enter your choice:");
						ch1 = sc.nextInt();
						switch (ch1) {
						case 1:
							System.out.println("\nEnter new Employee ID:");
							e.id = sc.nextInt();
							System.out.println(e + "\n");
							break;
						case 2:
							System.out.println("\nEnter new Employee Name:");
							e.name = sc.nextLine();
							System.out.println(e + "\n");
							break;
						case 3:
							System.out.println("\nEnter new Employee Salary:");
							e.salary = sc.nextFloat();
							System.out.println(e + "\n");
							break;
						case 4:
							System.out.println("\nEnter new Employee Contact No:");
							e.contact_no = sc.nextLong();
							System.out.println(e + "\n");
							break;
						case 5:
							System.out.println("\nEnter new Employee Email-Id:");
							e.email_id = sc.next();
							System.out.println(e + "\n");
							break;
						case 6:
							j++;
							break;
						default:
							System.out.println("Enter the correct choice from the List:");
							break;
						}
					} while (j == 1);
				}
				if (j == 0) {
					System.out.println("\n Employee Details are not available");
				}
				break;
			case 4:
				System.out.println("Enter Employee ID to Delete From the Database:");
				id = sc.nextInt();
				int k = 0;
				try {
					for (Employee e : al) {
						if (id == e.id) {
							al.remove(e);
							display(al);
							k++;
						}
					}
					if (k == 0) {
						System.out.println("\nEmployee Details are not available");
					}
				} catch (Exception ex) {
					System.out.println(ex);
				}
				break;
			case 5:
				try {
					al = (ArrayList<Employee>) ois.readObject();

				} catch (ClassNotFoundException e2) {
					System.out.println(e2);
				} catch (Exception e2) {
					System.out.println(e2);
				}
				display(al);
				break;
			case 6:
				try {
					fos = new FileOutputStream(f);
					oos = new ObjectOutputStream(fos);
					oos.writeObject(al);

				} catch (IOException e1) {
					e1.printStackTrace();

				} catch (Exception e2) {
					e2.printStackTrace();
				} finally {
					try {
						fis.close();
						ois.close();
						fos.close();
						oos.close();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				System.out.println("\n You have Chosen Exit!!");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Enter a correct choice from the list:");
				break;
			}
		} while (true);
	}
}
