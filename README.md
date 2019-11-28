# LinedEditText
Android Lined EditText like Notepad

## Getting Started

This library allows you to add Lined EditText in your application with ease


### Installing

* Add this line in your project level gradle file

```
allprojects {
    repositories {
        ...
	maven { url 'https://jitpack.io' }
    }
}
```

Add this line in your app level gradel file

```
dependencies {
    implementation 'com.github.shivampip:LinedEditText:6e5e019dee'
}
```

and click on Sync Now

## Usage

You can easily integrate it in your layout file

```
<com.shivampip.LinedEditText
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:text="Hello World \nIt's Working"
        android:padding="10dp"
        app:lineTextGap="1.0"
        app:lineWidth="1.0"
        app:lineColor="#000000"/>
```   



## Built With

* [Android Studio](https://developer.android.com/studio)


## Authors

* **Shivam Agrawal** 


