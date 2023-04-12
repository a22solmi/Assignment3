
# Rapport

I started this assignment by using the relative layout. It didn't add any useful features for my use
case and was later refactored to the constraint layout. Relative positions were still possible 
with the constraints like ToptoBottom StartToEnd etc.

Text was added to string.xml and additional colors to colors.xml file in the resource folder

Added an ImageView of the android loading screen which is an already existing drawable.
Resized to a larger size:

> android:layout_height="500dp"  
> android:layout_width="500dp"  
> android:scaleType="fitXY"  
> android:adjustViewBounds="true"  

The bottomToTop constraint is limited to a single view. For the constraint between the ImageView 
and the buttons a intermittent barrier was added. The ImageView and buttons can reference the 
barrier instead of each other.

> <androidx.constraintlayout.widget.Barrier  
>         android:id="@+id/barrier"  
>         app:barrierDirection="top"  
>         android:layout_width="wrap_content"  
>         android:layout_height="wrap_content"/>

Created a list containing the id of the colors and converted it into a ListIterator which is an 
Iterator traversable in both directions.
Added onClick functionality to the buttons to traverse the iterator and change the background color
of the ImageView to its value.

The LinkedIterator moves the cursor after a next() or previous() call. This means the same color is 
selected twice when changing directions. Solved this by checking if the current color is the same as
the selected and calling the function again if that is the case.


![](mainView.png)