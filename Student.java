/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author CSE_LAB_Pc-1076
 */
public class Student implements java.io.Serializable {
 private int id;
 private String name, branch;
public int getId(){
return id;
}
public String getName(){
return name;
}
public String getBranch(){
return branch;
}

public void setID(int id){
this.id = id;
}
public void setName(String name){
this.name = name;
}
public void setBranch(String branch){
this.branch = branch;
}

}

