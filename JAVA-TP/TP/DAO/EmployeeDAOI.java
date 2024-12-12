package DAO;

import Models.Employee;

interface EmployeeDAOI {
  public String url = "jdbc:postgresql://192.168.1.100:5433/employee_db";
  public String dbuser = "postgres";
  public String dbpw = "logomn";

  public boolean addEmployee(Employee em);

  public boolean deleteEmployee(int id);

  public boolean updateEmployee(int id, Employee em);
}
