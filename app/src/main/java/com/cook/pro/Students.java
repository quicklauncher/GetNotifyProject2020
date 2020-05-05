package com.cook.pro;

public class Students {


    private String studentId;
    private String studentName ;
    private String addressName;
    private String quantityName;

    public Students(){
    }

    public Students(String id, String studentId, String studentName , String address,String quantity) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.addressName=address;
        this.quantityName=quantity;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
    public String getAddress() {
        return addressName;
    }
    public String getQuantity() {
        return quantityName;
    }


}
