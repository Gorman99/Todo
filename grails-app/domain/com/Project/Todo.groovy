package com.Project

class Todo {

    String title
    String description 
    Integer periority  
    Date startDate  = new Date()
    Date endDate  = new Date()
    boolean completed
   

    static constraints = {

        title blank:false, nullable:false,size:3..80
        description blank:false, nullable:false,size:3..1000
      
    }
}
