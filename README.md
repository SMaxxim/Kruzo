# Kruzo
ideas:
What i dont like most in modern react and react-like frameworks:
need for mixed up in your code: 
  - view of visual elements: size, font, color, etc.;
  - mapping data to elements
  - behaviour logic: event handlers; 
  - layout logic: i hate that most, there are  so many diferent ways for layout your elements: flex, grid, style library wrappers for grid   and flex like Grid component in Material-ui, and you cannot just move all that logic in some separate module of your code (yes you can do it by writing some component who render Grid or div with some style, but that means you need to add extra divs to you dom);
  
What i like in react: 
  - way of doing changes in ui: no for directly calling methods of ui-elements, for any changes your must change of state and smart
  framework doing all next job for you;
  - build web app without any html code;
  
  
So what i want to acheive: 

```
interface Layout<T> {
   [in key of T]: 
}

class MyInputForm:
  state = 
     surname =
     name = 
  PersonDataInput = class
    surname = new Input()
    name = new Input()
  layout = (elements: IElements<PersonDataInput>) -> {
      elements.surname  
  }
    grid 
      personDataInput.surname
      personDataInput.name
  dataMapping =   
    personDataInput.surname.value = surname    
    personDataInput.name.value = name    
  view = 
    personDataInput.surname.color =
    personDataInput.name.font =
  
  sharedState
  sharedStateApi
```  

