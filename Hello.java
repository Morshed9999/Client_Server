/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;
/**
 *
 * @author CSE_LAB_Pc-1076
 */
public interface Hello extends Remote {
 public List<Student> getStudents() throws Exception;
}
