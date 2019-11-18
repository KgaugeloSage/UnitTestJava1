import java.util.ArrayList;

class Person{
    private String name, gender;
    private ArrayList<String> interests;
    private int age;

  Person(String name, int age, String gender, ArrayList<String> interests){
       this.name = name;
       this.age = age;
       this.gender = gender;
       this.interests = interests;
    }
   String hello(){
      StringBuilder interestsAll = new StringBuilder();
      for(int i = 0; i < interests.size(); i++){
          interestsAll.append(interests.get(i));
          if(i+2 == interests.size() ){
              interestsAll.append(" and ");
          }
          if (i+2 < interests.size())
          {
              interestsAll.append(", ");
          }
          if (i+2 > interests.size()){
              interestsAll.append(".");
          }
      }
       return "Hello, my name "+ name+" and I am a "+age+" years old "+gender+ ". My interests are "+ interestsAll;
   }


}
