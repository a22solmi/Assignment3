
# Rapport

Changed to a relative layout. 
Added an ImageView of the android loading screen which is an already existing drawable.
Added buttons and put them in a linearLayout in order to center them without hardcoding.
Added additional colors.
Created a list containing the id of the colors and converted it into a ListIterator which is an 
Iterator traversable in both directions.
Added onClick functionality to the buttons to traverse the iterator and change the background color
of the ImageView to its value.

The LinkedIterator moves the cursor after a next() or previous() call. This means the same color is 
selected twice when changing directions. Solved this by checking if the current color is the same as
the selected and calling the function again if that is the case.

Changed the alignment of imageView to cover the are between the buttons and the bottom of screen.
> android:layout_alignParentBottom="true" 

> android:layout_marginBottom="0dp"

![](mainView.png)