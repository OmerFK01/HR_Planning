
package hr_planning;

/**
 *
 * @author Omer Khan
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class AssgnRecordSerializable implements Serializable {
  private int Assgn_id;

  private String name;

  private String groupLead;

  private double cost;

  public AssgnRecordSerializable() {
    this(0, "", "", 0.0);
  }


  public AssgnRecordSerializable(int acct, String first, String last, double bal) {
    setAssgn_id(acct);
    setName(first);
    setGroupLead(last);
    setCost(bal);
  }

    public int getAssgn_id() {
        return Assgn_id;
    }

    public void setAssgn_id(int Assgn_id) {
        this.Assgn_id = Assgn_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getGroupLead() {
        return groupLead;
    }

    public void setGroupLead(String GroupLead) {
        this.groupLead = GroupLead;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

  

}
