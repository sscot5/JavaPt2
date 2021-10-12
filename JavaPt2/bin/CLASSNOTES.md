10/4/21
# Writing Classes
```Java
public class Rectangle {
    //instance variables
    private double length = 5; //seting values here are for default constructor
    private double width = 5;
}
```

# Writing a constructor

: - always about initializing the object so that it can be constructor

```Java
public Rectangle(double len, double width) {
    length = len;
    this.width = width;
}
```
# Getters

: - getters return the values of the object

: - starts with get

```Java
public double getLenth() {
    return length;
}
```

# Setters (mutators)

: - setters change the values of the object

: - starts with set

```Java
public void setWidth (double newWidth) {
    width = newWidth;
}
```