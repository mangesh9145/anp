
package question1.test;

public class Customer {

	
				private int Id;
				private String Name;
				private int Age;
				public Customer() {
					Id=321;
					Name="Mangesh";
					Age=22;
					
					
				}
				public Customer(int id, String name, int age) {
					this.Id=id;
					this.Name=name;
					this.Age=age;
					
				}
				public int getId() {
					return Id;
				}
				public String getName() {
					return Name;
				}
				public double getPrice() {
					return Age;
					
				}
				public void setId(int id) {
					Id=id;
				}
				public void setName (String name) {
					Name=name;
				}
				public void setAge(int age) {
					Age=age;
					
				}
				
			
			

	}


