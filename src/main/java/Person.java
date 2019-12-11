class Person{
     private String name,gender;
     private String[] interests;
     private int age;
     Person(String name, int age, String gender, String[] interests){
       this.name = name;
       this.gender = gender;
       this.interests = interests;
       this.age = age;
     }
     String hello(){
      StringBuilder interestsAll = new StringBuilder();
     for(int i=0;i<interests.length;i++){
          interestsAll.append(interests[i]);
          if(i+2 == interests.length )interestsAll.append(" and ");
          if (i+2 < interests.length)interestsAll.append(", ");
          if (i+2 > interests.length)interestsAll.append(".");
     }
      return "Hello, my name is "+ name+" and I am "+age+" years old. My interests are "+interestsAll;
     }
}

