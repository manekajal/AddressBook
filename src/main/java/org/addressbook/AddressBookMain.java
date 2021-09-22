package org.addressbook;

public class AddressBookMain {
    public String fName;
    public String lName;
    public String address;
    public String city;
    public String state;
    public int zipCode;
    public long mobileNo;
    public String email;

    AddressBookMain(String firstName,String lastName,String contactAddress,String contactCity,String contactState,int zipCode,long mobileNumber,String emailId){
       this.fName=firstName;
       this.lName=lastName;
       this.address=contactAddress;
       this.city=contactCity;
       this.state=contactState;
       this.zipCode=zipCode;
       this.mobileNo=mobileNumber;
       this.email=emailId;


    }
    void display(){

        System.out.println(fName+ "||"+lName+" ||"+address+" || "+city+" || "+state+" || "+zipCode+" || "+mobileNo+" || "+email);

    }


    public static void main(String[] args){
       AddressBookMain main = new AddressBookMain("kajal","mane","karad","pune","Kerala",123,9923866882L,"manekajal2014@gmail.com");
        main.display();
    }
}
