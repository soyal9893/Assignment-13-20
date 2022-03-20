//Additional question - 4. Create a Employee class - Id, name, department, Work location. Getters and Setters.
// Every Employee will have to have the worklocation as ""Bangalore"" (Without using constructor)
class employee {
    int Id;
    String name;
    String department;
    String worklocation;

    public String getName() {
        return name;
    }

    public void setname() {
        this.name = name;
    }

    public String getdepartment() {
        return department;
    }

    public void setDepartment() {
        this.department = department;
    }

    public String getWorklocation() {
        return worklocation;
    }

    public void setWorklocation(String bangalore) {
        this.worklocation = worklocation;
        class AsQ_9 {
            public void main(String[] args) {
               employee E=new employee();
            //  E.worklocation="Bangalore";
              // E.department="Electrical";
             //  E.Id=001;
              // E.name="Sy";
                E.setWorklocation("Bangalore");
                System.out.println(getWorklocation());

            }
        }
    }
}