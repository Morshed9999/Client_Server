/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CSE_LAB_Pc-1076
 */
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;
public class Client {
 private Client() {}
 public static void main(String[] args)throws Exception {
 try {
 // Getting the registry
 Registry registry = LocateRegistry.getRegistry(null);
 // Looking up the registry for the remote object
 Hello stub = (Hello) registry.lookup("Hello");
 // Calling the remote method using the obtained object
 List<Student> list = (List)stub.getStudents();
 for (Student s:list){
 // System.out.println("bc "+s.getBranch());
 System.out.println("ID: " + s.getId());
 System.out.println("name: " + s.getName());
 System.out.println("branch: " + s.getBranch());

 }
// System.out.println(list);
 } catch (Exception e) {
     System.err.println("Client exception: " + e.toString());
 e.printStackTrace();
 }
 }
}
 