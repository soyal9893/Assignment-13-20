public class AsQ_5 {

        public class Person
        {
            // fields
            private String name;
            private String email;
            private String phoneNumber;

            // constructor
            public Person(String theName)
            {
                this.name = theName;
            }
            public Person(String Theemail,String thePhonenumber){
                this.email=Theemail;
                this.phoneNumber=thePhonenumber;
            }

            // methods - getters
            public String getName() { return this.name;}
            public String getEmail() { return this.email;}
            public String getPhoneNumber() { return this.phoneNumber;}

            // methods - setters
            public void setName(String theName) { this.name = theName;}
            public void setEmail(String theEmail) {this.email = theEmail;}
            public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
            public String toString()
            {
                return this.name + " " + this.email + " " + this.phoneNumber;
            }

            // main method for testing
            public void main(String[] args)
            {
                Person p1 = new Person("Sana","485756956852");
                System.out.println(p1);
                Person p2 = new Person("Jean","4785972362452");
                p2.setEmail("jean@gmail.com");
                p2.setPhoneNumber("404 899-9955");
                System.out.println(p2);
            }
        }


    }

