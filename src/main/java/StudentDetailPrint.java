/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * user interaction, stor in array then print the student list
 * @author Nsikak Spoon
 */
public class StudentDetailPrint {
        public static void main(String[] args){
            
            Student[] list = new Student[3];
            
            Student s1 = new Student();
            s1.setName("reee");
            s1.setSid(1231);
            
            Student s2 = new Student();
            s2.setName("yeet");
            s2.setSid(112311);
            
            Student s3 = new Student();
            s3.setName("yoink");
            s3.setSid(12324231);
            
            list[0]=s1;
            list[1]=s2;   
            list[2]=s3;
            
            for(int i=0; i<list.length;i++){
                 System.out.println(list[i].getName() + " " + list[i].getSid());
            }
                
           
            
            
        }
    
}
