    public class Main{
        public static void main(String[] args) {

            /* <--------------------------------- Account --------------------------------- > */
            System.out.println("--------------------------------- Account ---------------------------------");

            Account ac1 = new Account("1123237899","yasir", 500);
            Account ac2 = new Account("1123777876","ahmed", 200);
            Account ac3 = new Account("1151158811","fahad", 0);


                    System.out.println("Initial state:");
                    System.out.println(ac1);
                    System.out.println(ac2);
                    System.out.println(ac3);

                    System.out.println("Deposit 300 into yasir's account:");
                    int newBal1 = ac1.credit(300);
                    System.out.println("New balance in ac1 = " + newBal1);
                    System.out.println();

                    System.out.println("Withdraw 150 from ahmed's account:");
                    int result2 = ac2.debit(150);

                    System.out.println("New balance in ac2 = " + result2);

                    System.out.println();

                    System.out.println("Attempt to withdraw 100 from fahad's account (balance 0):");

                    int result3 = ac3.debit(100);
                    System.out.println("New balance in ac3 = " + result3);

                    System.out.println();

                    System.out.println("Transfer 400 from yasir to fahad:");
                    int afterTransfer = ac1.transferTo(ac3, 400);

                        System.out.println("Balance in ac1 after transfer = " + afterTransfer);
                        System.out.println("Balance in ac3 after transfer = " + ac3.getBalance());

                    System.out.println();

                    System.out.println("Final state:");
                    System.out.println(ac1);
                    System.out.println(ac2);
                    System.out.println(ac3);












            /* <--------------------------------- Account --------------------------------- > */
            System.out.println("--------------------------------- Employee ---------------------------------");

            Employee emp1 = new Employee("101","yasir",10000);
            Employee emp2 = new Employee("202","nawaf",7500);
            Employee emp3 = new Employee("303","khalid",5000);

            // initial state and annual salary
            System.out.println(emp1 + " → Annual: " + emp1.getAnnualSalary());
            System.out.println(emp2 + " → Annual: " + emp2.getAnnualSalary());
            System.out.println(emp3 + " → Annual: " + emp3.getAnnualSalary());
            System.out.println();

            // apply raises and show new salary
            System.out.println("After 10% raise: " + emp1.raisedSalary(10));
            System.out.println("After 5% raise: " + emp2.raisedSalary(5));
            System.out.println("After 20% raise: " + emp3.raisedSalary(20));
            System.out.println();



            // final state
            System.out.println(emp1);
            System.out.println(emp2);
            System.out.println(emp3);

            //use setters & getter for emp1:
            emp1.setName("abdullah");
            emp1.setSalary(12000);
            emp1.setId("121");

            System.out.println("new employee name:"+emp1.getName()+
                    "\n new employee salary: "+emp1.getSalary()+
                    "\n new employee id: "+ emp1.getId());
                }
            }

