/*(Rectangle Class) Create a class Rectangle with attributes length and width, each of which
defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has set and get
methods for both length and width. The set methods should verify that length and width are each
floating-point numbers larger than 0.0 and less than 20.0. Write a program to test class Rectangle.*/

 class Rectangle{

 	private float length; 
 	private float width ;


 	public Rectangle (){ //both instance variables default to 1

 		length = 1;
 		width = 1;
 	} 
 	public Rectangle (float length1, float width1){ //constructor overloading to initialize variables

 		length = length1;
 		width = width1;
 	}
 	public static float getPerimeter(){ //method for perimeter

 		double per = 2 * length + 2 * width;

 		return per;
 	}
 	public static float getArea(){ //method for area

 		double area = length * width ;
 		return area;
 	}
 	public float getLength(){ //getter for length

 		return length;
 	}
 	public float getWidth(){ //getter for width

 		return width;
 	}
 	public void setLength(float l){ //setter for length


 		if(length > 0.0 || length < 20.0){

 			length = l;

 		}
 	}
 	public void setWidth(float w){ //setter for width

 		if(width > 0.0 || length < 20.0){

 			width = w;
 		}
 	}
}
p










