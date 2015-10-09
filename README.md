<!-- link -->
[ViewPager]:http://developer.android.com/reference/android/support/v4/view/ViewPager.html
[Toolbar]:https://developer.android.com/reference/android/widget/Toolbar.html
[SlidingTabLayout_java]:https://github.com/google/iosched/blob/master/android/src/main/java/com/google/samples/apps/iosched/ui/widget/SlidingTabLayout.java
[SlidingTabStrip_java]:https://github.com/google/iosched/blob/master/android/src/main/java/com/google/samples/apps/iosched/ui/widget/SlidingTabStrip.java

# SlidingTabLayout_Sample
This project explore the use of SlidingTabLayout to create Material Design Tabs.
  
In order to use the **SlidingTabLayout**, we first have to get [SildingTabLayout.java][SlidingTabLayout_java] and [SlidingTabStrip.java][SlidingTabStrip_java] from Google's open source I/O app and add it to the project.

build.gradle
------------
In this project, we will using [**Toolbar**][Toolbar], and [**ViewPager**][ViewPager] so we need to add the following file into **build.gradle:**

 -   compile 'com.android.support:appcompat-v7:23.0.1'    
 -   compile 'com.android.support:support-v4:23.0.1'      
 
layout xml
----------
We will have a lot of layout files:

 -   The layout of the main acitivty
 -   each individual fragmentand 
 -   color attribute for toolbar
 -   style for toolbar

The most important one is the main activity, which is consist of **toolbar**(at the top), then **SlidingTabLayout**, then **ViewPager**(where we swip our fragment)

Fragment
--------
we will create each individual fragment for different tabs and ViewPager will manage the fragment based on user's action.

Adapter
-------
we will create a custom ViewPagerAdapter for ViewPager so it can manage the fragment for each tab.  

MainActivity
------------
Inside the main activity, we will combine our toolbar, slideTabLayout, and ViewPager together.

 1.   find the toolbar and set it as the actionbar for the activity.
 2.   create the ViewPagerAdapter and set it to our ViewPager.
 3.   find the SlidingTabLayout and set the color for tabScroller.
 4.   set the ViewPager for SlidingTabLayout.
 
 
