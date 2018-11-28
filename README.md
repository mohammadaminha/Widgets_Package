# Widgets_Package
All widgets scuh as TextView, Button, CheckBox and etc with custom font and also some usefull widgets such as PersianDatePicker for persian language.
## Installing:
Add this to your project
```
allprojects {
    repositories {
      ...
      maven { url 'https://jitpack.io' }
    }
  }
  
dependencies {
          implementation 'com.github.mohammadaminha:Widgets_Package:V1'
}
```
## Using:
First of all you should initilize the static parameters with this code, run this code inside of your onCreate Application class:
```
new Util("font_address",applicationContext);
```
## Widgets You can use:
1_ JustifiedTextView
2_ AutoScrollViewPager
3_ Persian date picker dialog and Persian time picker dialog
4_ ExpendableLayout
5_ ImageViewZoom
6_ particleview
7_ Button
8_ CardView with default padding, margin and default direction (RTL)
9_ CheckBox
10_ Coordinator with default direction (RTL)
11_ cToast you can use it for your toasts in your application with your custom font 
12_ CurrencyEditText for example 1,200
13_ EditText
14_ GridSpacingItemDecoration
15_ RadioButton
16_ Switch
17_ TextInputLayout
18_ TextView
19_ ToolbarCustomizer this class has a static method, when you use this method it will add homebuttons clicks and navigation clicks

## Styles:
I made some usefull methods in repository, I think the name of these styles are easy 
If you want that your textview has Gravity:center|vertical and textDirection:RTL and also textcolor:Black you can just use this style
style="@style/txtGDCB"
For white style="@style/txtGDCB"
The compelete name style is TextViewGravityDirectionCenterBlack
Let me know with your commits if you need something new in this repository and also you can email me:Mohammadaminha4@gmail.com
Enjoy coding ;)
