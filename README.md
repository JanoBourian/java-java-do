# java-java-do
Schoolar codes about java. 

# Important statemnts

```java
import javax.swing.JOptionPane;

int n = Integer.parseInt(JOptionPane.showInputDialog("Cuántos componentes deseas ver?: "));
System.out.println(n);
```

@override when you going to set the function
```java
package basictopics;

public abstract class AbstractClass {
    public abstract void areaCircul(int a);
    public abstract void setName(String name);
}
```

```java
package basictopics;

final class FinalClass {
    
    final public void finalMethod(){
        System.out.println("I'm a final method in a final class!");
    }
}
```

NOTE: Interfaces ares useful when you want to inherit from two or more classes:

Arrays:
```java
String[] names;
String aux;
names = new String[n];
for(int i = 0; i < n; i++){
    aux = JOptionPane.showInputDialog("Ingrese el nombre del elemento "+ i + ": ");
    names[i] = aux;
    System.out.println("names[" + i + "] = " + names[i]);
}
```

Try - Catch
```java
try{
    Alumno alumno = new Alumno();
    alumno.setName("Fernando");
    alumno.setAge(31);
    alumno.setMatricula(26568);
    alumno.getAge();
    alumno.getMatricula();
    alumno.getName();
}catch(java.lang.AbstractMethodError e){
    System.out.println(e);
}
```

## Events

Basic event
```java
package events;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class Events {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Example of eventes");
        frame.setLocation(100, 100);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```
